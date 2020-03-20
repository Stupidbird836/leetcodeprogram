package sort;

import java.util.Arrays;

/**
 * @author huchenfei
 * @version 1.0
 * @date 2020/3/4 17:48
 * @description
 * @className QuickSort
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 0, 3, 3, 8, 1, 4, 6, 2, 8, 8, 15, 10, 0, 9, 9, 1, 2, 17, 8, 17, 25, 18, 18, 16, 13, 18, 29, 2, 3, 32, 2, 26, 23, 18, 8, 34, 8, 11, 36, 36, 39, 46, 30, 21, 25, 21, 14, 41, 10, 31, 55, 45, 16, 33, 47, 4, 52, 59, 60, 1, 43, 42, 10, 12, 56, 12, 27, 22, 52, 38, 12, 41, 42, 71, 5, 42, 76, 8, 3, 31, 65, 11, 29, 28, 68, 33, 50, 73, 87, 22, 68, 31, 1, 38, 89};
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * @param arr   待排序的数组
     * @param left  左闭
     * @param right 右闭
     */
    private static void sort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int[] ret = partition(arr, left, right);
        sort(arr, left, ret[0]);
        sort(arr, ret[1], right);
    }

    /**
     * @param arr   待排序的数组
     * @param left  待排序数组的左边界
     * @param right 待排序数组的右边界
     * @return int[]
     */
    private static int[] partition(int[] arr, int left, int right) {
        // 排序前，先让基准值和随机的一个数进行交换。这样，基准值就有随机性。
        // 就不至于在数组相对有序时，导致左右两边的递归规模不一致，产生最坏时间复杂度
        swap(arr, left, (int) (Math.random() * (right - left + 1) + left));

        //基准值，每次都把这个基准值抛出去，看成[left+1.....right]左闭右闭区间的排序
        int base = arr[left];

        //三路快排分为下面这三个路(区间)
        int i = left; // left表示，[lleft...left) 左闭右开区间里的数都比base小
        int j = right;// right表示，(rright...right] 左开右闭区间里的数都比base大
        int cur = i;// 用cur来遍历数组。[left...right] 左闭右闭区间里的数都等于base

        while (cur <= j) {
            if (arr[cur] == base) {
                //如果当前值和base相同，直接跳过
                cur++;
            } else if (arr[cur] < base) {
                //如果当前值小于base值，那么需要交换当前值和左指针(左指针存的是一个base值)，并且两个指针都前进一步
                swap(arr, cur++, i++);
            } else {
                //如果当前值小于base值，那么需要交换当前值和右指针(右指针是一个未知的数),因为交换过来的数未知，所以当前指针不变，右指针向左一步
                swap(arr, cur, j--);
            }
        }
        return new int[]{i - 1, j + 1};//[i...j]都等于base,子问题就只需要解决i左边和j右边就行了
    }


    private static void swap(int[] arr, int i, int j) {
        if (i != j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
