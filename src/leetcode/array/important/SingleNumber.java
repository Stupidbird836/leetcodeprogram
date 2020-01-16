package leetcode.array.important;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 重要:
 *
 * @author huchenfei
 * @version 1.0
 * @className SingleNumber
 * @description 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * @date  2019/6/12 20:17
 **/
public class SingleNumber {

    public static void main(String... args) {
        int[] nums = new int[]{2, 2, 1, 3, 4, 1, 1, 1, 3};
        System.out.println(singleNumber3(nums));
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

    /**
     * Hash 表, 在Map里面记录每一个数字出现了几次
     * 不适用于大数据量
     *
     * @param nums
     * @return
     */
    private static int singleNumber2(int[] nums) {
        Map<Integer, Integer> numsMap = new HashMap<>();
        for (int num : nums) {
            Integer numCount = numsMap.get(num);
            numCount = numCount == null ? 1 : ++numCount;
            numsMap.put(num, numCount);
        }
        for (Map.Entry<Integer, Integer> entry : numsMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return -1;
    }

    /**
     * 异或
     * 异或解法：异或运算满足交换律，a^b^a=a^a^b=b,因此ans相当于nums[0]^nums[1]^nums[2]^nums[3]^nums[4].....
     * 然后再根据交换律把相等的合并到一块儿进行异或（结果为0），然后再与只出现过一次的元素进行异或，
     * 这样最后的结果就是，只出现过一次的元素（0^任意值=任意值）
     *
     * @param nums
     * @return
     */
    private static int singleNumber3(int[] nums) {
        int ans = nums[0];
        if (nums.length > 1) {
            for (int i = 1; i < nums.length; i++) {
                ans = ans ^ nums[i];
            }
        }
        return ans;
    }
}
