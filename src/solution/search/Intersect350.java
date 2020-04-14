package solution.search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author huchenfei
 * @version 1.0
 * @date 2020/4/14 17:52
 * @description 350. 两个数组的交集 II
 * 给定两个数组，编写一个函数来计算它们的交集。
 * <p>
 * 示例 1:
 * 输入: nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出: [2,2]
 * <p>
 * 示例 2:
 * 输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 输出: [4,9]
 * <p>
 * 说明：
 * 输出结果中每个元素出现的次数，应与元素在两个数组中出现的次数一致。
 * 我们可以不考虑输出结果的顺序。
 * <p>
 * 进阶:
 * 如果给定的数组已经排好序呢？你将如何优化你的算法？
 * 如果 nums1 的大小比 nums2 小很多，哪种方法更优？
 * 如果 nums2 的元素存储在磁盘上，磁盘内存是有限的，并且你不能一次加载所有的元素到内存中，你该怎么办？
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/intersection-of-two-arrays-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @className Intersect350
 */
public class Intersect350 {

    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5}, nums2 = {9, 4, 9, 8, 4};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }

    private static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list1 = new ArrayList<>();
        for (int i : nums1) {
            list1.add(i);
        }
        List<Integer> list = new ArrayList<>();
        for (int num : nums2) {
            if (list1.contains(num)) {
                list.add(num);
                list1.remove(Integer.valueOf(num));
            }
        }
        int[] nums3 = new int[list.size()];
        if (list.size() > 0) {
            int index = 0;
            for (Integer integer : list) {
                nums3[index++] = integer;
            }
        }
        return nums3;
    }
}
