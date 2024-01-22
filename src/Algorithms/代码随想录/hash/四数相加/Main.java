package Algorithms.代码随想录.hash.四数相加;

import java.util.HashMap;
import java.util.Map;

/**
 * @author flowerwine
 * @date 2024 年 01 月 21 日
 */
public class Main {
    public static void main(String[] args) {
        String strA = "ransom";
        String strB = "magarziones";

        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0, length = strB.length(); i < length; i++) {
            char c = strB.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        boolean match = true;
        for(int i = 0, length = strA.length(); i < length; i++) {
            char c = strA.charAt(i);
            Integer count = map.get(c);
            if(count == null || count == 0) {
                match = false;
                break;
            }
            map.put(c, count - 1);
        }

        System.out.println(match);
    }
}
