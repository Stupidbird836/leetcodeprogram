package solution.search;

import leetcode.array.important.Intersect;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author huchenfei
 * @version 1.0
 * @date 2020/4/14 17:34
 * @description 349. 两个数组的交集
 * 给定两个数组，编写一个函数来计算它们的交集。
 * <p>
 * 示例 1:
 * 输入: nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出: [2]
 * <p>
 * 示例 2:
 * 输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 输出: [9,4]
 * <p>
 * 说明:
 * 输出结果中的每个元素一定是唯一的。
 * 我们可以不考虑输出结果的顺序。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/intersection-of-two-arrays
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @className Intersection349
 */
public class Intersection349 {

    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5}, nums2 = {9, 4, 9, 8, 4};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }

    /**
     * 典型的查找类问题
     * 使用set
     *
     * @param nums1 数组1
     * @param nums2 数组2
     * @return int[]
     */
    private static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for (int i : nums1) {
            set1.add(i);
        }
        Set<Integer> set2 = new HashSet<>();
        for (int num : nums2) {
            if (set1.contains(num)) {
                set2.add(num);
            }
        }
        int[] nums3 = new int[set2.size()];
        if (set2.size() > 0) {
            int index = 0;
            for (Integer integer : set2) {
                nums3[index++] = integer;
            }
        }
        return nums3;
    }
}
