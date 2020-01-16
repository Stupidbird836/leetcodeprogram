package leetcode.array.important;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author huchenfei
 * @version 1.0
 * @className TwoSum
 * @description 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 * <p>
 * 示例:
 * <p>
 * 给定 nums = [2, 7, 11, 15], target = 9
 * <p>
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 * @date  2019/6/12 20:15
 **/
public class TwoSum {

    public static void main(String... args) {
        int[] nums = new int[]{2, 3, 4, 5, 6, 7, 11, 15};
        int[] ints = twoSum(nums, 9);
        System.out.println(Arrays.toString(ints));
    }

    /**
     * 暴力法,双循环
     * 时间复杂度 O(n^2)
     * 空间复杂度 O(1)
     *
     * @param nums   数组
     * @param target 目标值
     * @return int[]
     */
    /*private int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }*/

    /**
     * 两遍哈希
     *
     * @param nums   数组
     * @param target 目标值
     * @return int[]
     */
    /*private int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[]{i, map.get(complement)};
            }
        }
        return null;
    }*/

    /**
     * 一遍哈希
     * 将目标值挨个和数组中的数字进行相减
     * 每次相减完成后和map中的数据对比看看是不是有对应的值
     * 如果没有则使用map存储操作过减法的数据和对应的下标
     * 如果有则返回当前数字的下标和map中的下标
     *
     * 时间复杂度 O(n)
     * 空间复杂度 O(1)
     * @param nums   数组
     * @param target 目标值
     * @return int[]
     */
    /*private static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int count = target - nums[i];
            if (map.containsKey(count)) {
                return new int[]{map.get(count), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }*/

    /**
     * 指针对撞法(该方法只针对已经排好序的数组,且从小到大排)
     * 使用首尾两个指针
     * 当两个指针所对应的数字相加 > 9 的时候,说明右侧指针需要向左移,然后再次判断
     * 当两个指针所对应的数字相加 < 9 的时候,说明左侧指针需要向右移,然后再次判断
     *
     * @param nums   数组
     * @param target 目标值
     * @return int[]
     */
    private static int[] twoSum(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            if (nums[left] + nums[right] == target) {
                return new int[]{left, right};
            } else if (nums[left] + nums[right] > target) {
                right = right - 1;
            } else {
                left = left + 1;
            }
        }
        return null;
    }
}
