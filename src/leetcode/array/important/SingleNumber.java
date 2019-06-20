package leetcode.array.important;

import java.util.Arrays;

/**
 * 重要:
 * @Author：huchenfei
 * @ClassName：SingleNumber
 * @Description：给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * @Date：2019/6/12 20:17
 * @Version： 1.0
 **/
public class SingleNumber {
    public static void main(String... args) {
        int[] nums = new int[]{2, 2, 1, 1, 1, 1, 3};
        System.out.println(singleNumber1(nums));
    }

    public static int singleNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            boolean flag = true;
            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    continue;
                }
                if (nums[i] == nums[j]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return nums[i];
            }
        }
        return -1;
    }

    /**
     * 该方法仅限于有重复数字只重复偶数次,奇数次就会有问题
     *
     * @param nums
     * @return
     */
    public static int singleNumber1(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                i = i + 1;
            } else {
                return nums[i];
            }
        }
        return nums[nums.length - 1];
    }
}
