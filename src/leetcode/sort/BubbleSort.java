package leetcode.sort;

/**
 * @ClassName BubbleSort
 * @Description 冒泡排序
 * @Author huchenfei
 * @Date 2019/4/30 18:07
 * @Version 1.0
 **/
public class BubbleSort {

    // 从小到大
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
}
