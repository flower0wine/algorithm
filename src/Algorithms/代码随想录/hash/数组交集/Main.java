package Algorithms.代码随想录.hash.数组交集;

import java.util.Arrays;

/**
 * @author flowerwine
 * @date 2024 年 01 月 20 日
 */
public class Main {
    public static void main(String[] args) {
        int[] numsA = new int[]{1, 2, 3, 4};
        int[] numsB = new int[]{1, 3, 5, 7};

        int[] array = Arrays.stream(numsA).filter((a) -> Arrays.stream(numsB).anyMatch((b) -> a == b)).toArray();

        System.out.println(Arrays.toString(array));
    }
}
