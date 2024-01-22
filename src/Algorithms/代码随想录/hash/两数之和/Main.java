package Algorithms.代码随想录.hash.两数之和;

import java.util.HashMap;
import java.util.Map;

/**
 * @author flowerwine
 * @date 2024 年 01 月 20 日
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 7, 11, 2};

        Map<Integer, Integer> map = new HashMap<>();

        int target = 9;

        for(int i = 0; i < arr.length; i++) {
            int temp = target - arr[i];
            if(map.containsKey(temp)) {
                break;
            }
            map.put(arr[i], i);
        }
        System.out.println();
    }
}
