package leetcode.sort;

/**
 * @author huchenfei
 * @version 1.0
 * @className BubbleSort
 * @description 冒泡排序
 * 冒泡排序时间复杂度
 * 冒泡排序的时间复杂度是O(N2)。
 * 假设被排序的数列中有N个数。遍历一趟的时间复杂度是O(N)，需要遍历多少次呢？N-1次！因此，冒泡排序的时间复杂度是O(N2)。
 * @date 2019/4/30 18:07
 **/
public class BubbleSort {

    /**
     * 从小到大
     */
    public static void main1(String... args) {
        int[] arr = {6, 3, 8, 2, 9, 1};
        //外层循环控制排序趟数
        for (int i = 0; i < arr.length - 1; i++) {
            //内层循环控制每一趟排序多少次
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    arr[j] = arr[j] + arr[j + 1];
                    arr[j + 1] = arr[j] - arr[j + 1];
                    arr[j] = arr[j] - arr[j + 1];
                }
            }
        }
        for (int i : arr) {
            System.out.print(i);
        }
    }


    // 从大到小
    public static void main(String... args) {
        int[] arr = {6, 3, 8, 2, 9, 1};
        //外层循环控制排序趟数
        for (int i = 0; i < arr.length - 1; i++) {
            //内层循环控制每一趟排序多少次
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    arr[j + 1] = arr[j] + arr[j + 1];
                    arr[j] = arr[j + 1] - arr[j];
                    arr[j + 1] = arr[j + 1] - arr[j];
                }
            }
        }
        for (int i : arr) {
            System.out.print(i);
        }
    }

    /**
     * 冒泡排序(改进版)
     * <p>
     * 参数说明：
     * a -- 待排序的数组
     * n -- 数组的长度
     */
    public static void bubbleSort2(int[] a, int n) {
        int i, j;
        int flag;// 标记

        for (i = n - 1; i > 0; i--) {
            flag = 0;// 初始化标记为0
            // 将a[0...i]中最大的数据放在末尾
            for (j = 0; j < i; j++) {
                if (a[j] > a[j + 1]) {
                    // 交换a[j]和a[j+1]
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                    flag = 1;    // 若发生交换，则设标记为1
                }
            }

            if (flag == 0)
                break;            // 若没发生交换，则说明数列已有序。
        }
    }
}
