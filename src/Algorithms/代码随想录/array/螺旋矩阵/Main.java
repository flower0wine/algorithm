package Algorithms.代码随想录.array.螺旋矩阵;

/**
 * @author flowerwine
 * @date 2024 年 01 月 12 日
 */
public class Main {
    public static void main(String[] args) {
        int n = 10;

        int top = n, left = n, right = n, bottom = n;
        int[][] arr = new int[n][n];

        int i = 0, j = 0, k = 1;
        int count = n * n;
        while (k < count) {
            while (j < right) {
                arr[i][j++] = k++;
            }
            i++;
            j--;
            top--;
            while (i < bottom) {
                arr[i++][j] = k++;
            }
            i--;
            j--;
            right--;
            while (j >= n - left) {
                arr[i][j--] = k++;
            }
            i--;
            j++;
            bottom--;
            while (i >= n - top) {
                arr[i--][j] = k++;
            }
            i++;
            j++;
            left--;
        }
        System.out.println();
    }
}
