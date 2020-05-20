package solution.moveelement;

import java.util.Arrays;

/**
 * @author huchenfei
 * @version 1.0
 * @date 2020/3/4 21:03
 * @description 给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 num1 成为一个有序数组。
 * 说明:
 * <p>
 * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。
 * 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
 * <p>
 * 示例:
 * <p>
 * 输入:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 * <p>
 * 输出: [1,2,2,3,5,6]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/merge-sorted-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @className MergeSortedArray88
 */
public class MergeSortedArray88 {

    public static void main(String[] args) {
        int[] num1 = {1, 2, 3, 0, 0, 0};
        int[] num2 = {2, 5, 6};
        merge(num1, 3, num2, 3);
        System.out.println(Arrays.toString(num1));
    }

    private static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] newNums = Arrays.copyOf(nums1, m);
        int left1 = 0; // 第一个有序数组的左右闭区间
        int left2 = 0; // 第二个有序数组的左右闭区间
        int newT = 0; // 新数组的临时坐标
        while (left1 < m && left2 < n) {
            if (newNums[left1] >= nums2[left2]) {
                nums1[newT++] = nums2[left2++];
            } else {
                nums1[newT++] = newNums[left1++];
            }
        }
        while (left1 < m) {
            nums1[newT++] = newNums[left1++];
        }

        while (left2 < n) {
            nums1[newT++] = nums2[left2++];
        }
    }
}
