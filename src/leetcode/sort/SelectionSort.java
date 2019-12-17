package leetcode.sort;

/**
 * @ClassName SelectionSort
 * @Description 选择排序(Selection sort)是一种简单直观的排序算法。
 * 它的基本思想是：首先在未排序的数列中找到最小(or最大)元素，然后将其存放到数列的起始位置；
 * 接着，再从剩余未排序的元素中继续寻找最小(or最大)元素，然后放到已排序序列的末尾。以此类推，直到所有元素均排序完毕。
 * <p>
 * 选择排序时间复杂度
 * 选择排序的时间复杂度是O(N2)。
 * 假设被排序的数列中有N个数。遍历一趟的时间复杂度是O(N)，需要遍历多少次呢？N-1！因此，选择排序的时间复杂度是O(N2)。
 * @Author huchenfei
 * @Date 2019/4/30 18:19
 * @Version 1.0
 **/
public class SelectionSort {

    public static void main(String... args) {
        int[] a = {2, 9, 8, 7, 4, 1, 10, 65, 54};
        int min;
        for (int i = 0; i < a.length; i++) {
            min = i;
            // 找出最小元素
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            // min不等于i说明, 当前值不是最小值, 那么两个值调换位置, 保证未排好序的最小值始终在前面
            if (min != i) {
                a[i] = a[min] + a[i];
                a[min] = a[i] - a[min];
                a[i] = a[i] - a[min];
            }
            for (int i1 : a) {
                System.out.print(i1 + ",");
            }
            System.out.println();
        }
    }
}
