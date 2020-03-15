package solution.q_per_day;

import java.util.HashMap;
import java.util.Map;

/**
 * @author huchenfei
 * @version 1.0
 * @date 2020/3/13 15:47
 * @description 给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 * <p>
 * 示例 1:
 * 输入: [3,2,3]
 * 输出: 3
 * <p>
 * 示例 2:
 * 输入: [2,2,1,1,1,2,2]
 * 输出: 2
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/majority-element
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @className MajorityElement169
 */
public class MajorityElement169 {

    public static void main(String[] args) {
        int[] nums = {2};
        System.out.println(majorityElement(nums));
    }

    private static int majorityElement(int[] nums) {
        Map<Integer, Long> countNumMap = new HashMap<>();
        for (int num : nums) {
            countNumMap.put(num, countNumMap.getOrDefault(num, 0L) + 1);
            if (countNumMap.get(num) > nums.length / 2) {
                return num;
            }
        }
        return 0;
    }
}
