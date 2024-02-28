package Algorithms.代码随想录.string.反转字符串;

import java.util.Arrays;

/**
 * @author flowerwine
 * @date 2024 年 02 月 03 日
 */
public class Main {
    public static void main(String[] args) {
        char[] chars = new char[]{'a', 'b', 'c'};

        int l = 0, r = chars.length - 1;
        while(l < r) {
            char c = chars[l];
            chars[l] = chars[r];
            chars[r] = c;
            l++;
            r--;
        }
        System.out.println(Arrays.toString(chars));
    }
}
