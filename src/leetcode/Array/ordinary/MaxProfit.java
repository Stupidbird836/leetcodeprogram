package leetcode.Array.ordinary;

/**
 * @Author：huchenfei
 * @ClassName：MacProfit
 * @Description：
 * @Date：2019/6/17 18:35
 * @Version： 1.0
 **/
public class MaxProfit {

    public static void main(String... args) {
        int[] nums = new int[]{7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(nums));
    }

    private static int maxProfit(int[] nums) {
        int max = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                max += nums[i] - nums[i - 1];
            }
        }
        return max;
    }
}
