package solution.q_per_day;

import java.util.Arrays;

/**
 * @author huchenfei
 * @version 1.0
 * @date 2020/3/20 17:03
 * @description 面试题40. 最小的k个数
 * 输入整数数组 arr ，找出其中最小的 k 个数。
 * 例如，输入4、5、1、6、2、7、3、8这8个数字，则最小的4个数字是1、2、3、4。
 * <p>
 * 示例 1：
 * 输入：arr = [3,2,1], k = 2
 * 输出：[1,2] 或者 [2,1]
 * <p>
 * 示例 2：
 * 输入：arr = [0,1,2,1], k = 1
 * 输出：[0]
 * <p>
 * 限制：
 * 0 <= k <= arr.length <= 10000
 * 0 <= arr[i] <= 10000
 * @className GetLeastNumbers
 */
public class GetLeastNumbers {

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 0, 3, 3, 8, 1, 4, 6, 2, 8, 8, 15, 10, 0, 9, 9, 1, 2, 17, 8, 17, 25, 18, 18, 16, 13, 18, 29, 2, 3, 32, 2, 26, 23, 18, 8, 34, 8, 11, 36, 36, 39, 46, 30, 21, 25, 21, 14, 41, 10, 31, 55, 45, 16, 33, 47, 4, 52, 59, 60, 1, 43, 42, 10, 12, 56, 12, 27, 22, 52, 38, 12, 41, 42, 71, 5, 42, 76, 8, 3, 31, 65, 11, 29, 28, 68, 33, 50, 73, 87, 22, 68, 31, 1, 38, 89};
        System.out.println(Arrays.toString(getLeastNumbers(arr, 60)));
    }

    private static int[] getLeastNumbers(int[] arr, int k) {
        if (k > arr.length) {
            return null;
        }
        sort(arr, 0, arr.length - 1);
        int[] arrNew = new int[k];
        System.arraycopy(arr, 0, arrNew, 0, k);
        return arrNew;
    }

    private static void sort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int[] lr = partition(arr, left, right);
        sort(arr, left, lr[0]);
        sort(arr, lr[1], right);
    }

    private static int[] partition(int[] arr, int left, int right) {
        swap(arr, left, (int) (Math.random() * (right - left + 1) + left));
        int base = arr[left];

        int i = left;
        int j = right;
        int cur = i;

        while (cur <= j) {
            if (arr[cur] == base) {
                cur++;
            } else if (arr[cur] < base) {
                swap(arr, cur++, i++);
            } else {
                swap(arr, cur, j--);
            }
        }
        return new int[]{i - 1, j + 1};
    }

    private static void swap(int[] arr, int i, int j) {
        if (i != j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
