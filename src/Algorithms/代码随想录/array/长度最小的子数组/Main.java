package Algorithms.代码随想录.array.长度最小的子数组;

/**
 * @author flowerwine
 * @date 2024 年 01 月 12 日
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 1, 2, 4, 3};

        int target = 7;
        int i = 0, j = 0;

        // 使用滑动窗口算法
        while(i <= j || j < arr.length) {
            if(greaterOrEquals(arr, i, j, target)) {
                if(j == arr.length - 1 && !greaterOrEquals(arr, i + 1, j, target)) {
                    System.out.println(j - i + 1);
                    break;
                }
                i++;
            } else {
                j++;
            }
        }
        System.out.println();
    }

    public static boolean greaterOrEquals(int[] arr, int i, int j, int target) {
        int res = 0;
        for(; i <= j; i++) {
            res += arr[i];
        }
        return res >= target;
    }
}
