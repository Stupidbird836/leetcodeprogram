package leetcode.Array.ordinary;

import java.util.Arrays;

/**
 * @Author：huchenfei
 * @ClassName：ContainsDuplicate
 * @Description：
 * @Date：2019/6/17 18:50
 * @Version： 1.0
 **/
public class ContainsDuplicate {
    public static void main(String... args) {
        int[] nums = new int[]{1, 3, 4, 2, 4};
        System.out.println(containsDuplicate(nums));
    }

    private static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }
}
