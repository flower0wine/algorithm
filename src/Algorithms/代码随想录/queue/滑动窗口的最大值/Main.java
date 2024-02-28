package Algorithms.代码随想录.queue.滑动窗口的最大值;

import Algorithms.DataStructure.Queue.Queue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author flowerwine
 * @date 2024 年 02 月 03 日
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, -1, -3, 5, 3, 6, 7};
        List<Integer> list = new ArrayList<>();

        int k = 3;
        int l = k;
        Queue<Integer> queue = new Queue<>();
        for (int i = 0; i < k; i++) {
            queue.add(arr[i]);
            while (queue.peek() < arr[i]) {
                queue.remove();
            }
        }
        list.add(queue.peek());
        for (; l < arr.length; l++) {
            queue.add(arr[l]);
            while (queue.peek() < arr[l]) {
                queue.remove();
            }
            list.add(queue.peek());
        }

        System.out.println(list);
    }
}
