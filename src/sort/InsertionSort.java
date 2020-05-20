package sort;

import java.util.Arrays;

/**
 * @author huchenfei
 * @version 1.0
 * @date 2020/3/16 12:18
 * @description
 * @className InsertionSort
 */
public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 0, 0, 0};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 插入排序
     *
     * @param arr 数组
     */
    private static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                swap(arr, j, j - 1);
                j--;
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        if (i != j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
