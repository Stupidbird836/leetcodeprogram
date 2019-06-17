package leetcode.Array.important;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author：huchenfei
 * @ClassName：Intersect
 * @Description：给定两个数组，编写一个函数来计算它们的交集。 示例 1:
 * <p>
 * 输入: nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出: [2,2]
 * 示例 2:
 * <p>
 * 输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 输出: [4,9]
 * 说明：
 * <p>
 * 输出结果中每个元素出现的次数，应与元素在两个数组中出现的次数一致。
 * 我们可以不考虑输出结果的顺序。
 * 进阶:
 * <p>
 * 如果给定的数组已经排好序呢？你将如何优化你的算法？
 * 如果 nums1 的大小比 nums2 小很多，哪种方法更优？
 * 如果 nums2 的元素存储在磁盘上，磁盘内存是有限的，并且你不能一次加载所有的元素到内存中，你该怎么办？
 * @Date：2019/6/14 19:11
 * @Version： 1.0
 **/
public class Intersect {

    public static void main(String... args) {
        int[] num1 = new int[]{1, 2, 2, 1};
        int[] num2 = new int[]{2, 2};
        System.out.println(intersect(num1, num2));
    }

    /**
     * 排序之后的数据, 用二分查找
     */
    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums1) {
            int left = 0, right = nums2.length - 1;
            while (left <= right) {
                int middle = left + (left + right) / 2;
                if (num == nums2[middle]) {
                    list.add(nums2[middle]);
                }
                if (nums2[middle] > num) {
                    right = middle - 1;
                }
                if (nums2[middle] < num) {
                    left = middle + 1;
                }
            }
        }
        int[] nums = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }
        return nums;
    }

    /**
     * 不排序的数组,循环遍历
     */
    public static int[] intersect1(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums1) {
            list.add(num);
        }
        List<Integer> list1 = new ArrayList<>();
        for (int i : nums2) {
            if (list.contains(i)) {
                list1.add(i);
                list.remove(Integer.valueOf(i));
            }
        }
        int[] nums = new int[list1.size()];
        for (int i = 0; i < list1.size(); i++) {
            nums[i] = list1.get(i);
        }
        return nums;
    }
}
