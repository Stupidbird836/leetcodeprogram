package solution.twopoint;

/**
 * @author huchenfei
 * @version 1.0
 * @date 2020/4/13 13:06
 * @description 209. 长度最小的子数组
 * 给定一个含有 n 个正整数的数组和一个正整数 s ，找出该数组中满足其和 ≥ s 的长度最小的连续子数组。如果不存在符合条件的连续子数组，返回 0。
 * 示例: 
 * 输入: s = 7, nums = [2,3,1,2,4,3]
 * 输出: 2
 * 解释: 子数组 [4,3] 是该条件下的长度最小的连续子数组。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/minimum-size-subarray-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @className MinSubArrayLen
 */
public class MinSubArrayLen209 {

    public static void main(String[] args) {
        int s = 7;
        int[] nums = {2, 3, 1, 2, 4, 3};
        System.out.println(minSubArrayLen(s, nums));
    }

    /**
     * 双索引技术：滑动窗口
     * 在数组最左侧设定两个索引，判定其中的一个字串，
     * 如果当前子串的和 > s 那么将左边的索引 -1
     * 如果当前子串的和 < s 那么将右边的索引 +1
     *
     * @param s    目标值
     * @param nums 数组
     * @return int
     */
    private static int minSubArrayLen(int s, int[] nums) {
        // 设置两个索引，[left, right] 左闭右闭，保证初始化索引中没有任何的值
        // 所以设置左边的索引最小为 0，右边索引的最小值为 -1，保证初始化索引中没有任何的值
        int left = 0, right = -1;
        // 设置返回值为数组的长度 + 1，保证其初始化为一个最大值
        int arrayLen = nums.length + 1;
        int sum = 0;
        // 保证左边索引小于整个数组的长度，窗口就还有继续滑动的可能
        while (left < nums.length) {
            if (right + 1 < nums.length && sum < s) {
                // sum 小于 目标值，right向右移动，sum + 移动后的数字
                sum += nums[++right];
            } else {
                // sum 大于 目标值，sum 减去当前子串最左侧数据，left 向右移动
                sum -= nums[left++];
            }
            if (sum >= s) {
                arrayLen = Math.min(arrayLen, right - left + 1);
            }
        }
        if (arrayLen == nums.length + 1){
            return 0;
        }
        return arrayLen;
    }
}
