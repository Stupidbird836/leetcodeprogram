package leetcode.array.ordinary;


/**
 * @author huchenfei
 * @className MoveZeroes
 * @description 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * <p>
 * 示例:
 * <p>
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 * 说明:
 * <p>
 * 必须在原数组上操作，不能拷贝额外的数组。
 * 尽量减少操作次数。
 * @date 2019/6/18 20:01
 * @version 1.0
 **/
public class MoveZeroes {
    public static void main(String... args) {
        int[] nums = new int[]{0, 1, 0, 3, 12};
        for (int i : moveZeroes1(nums)) {
            System.out.println(i);
        }
    }

    public static int[] moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] == 0 && nums[j] != nums[j + 1]) {
                    nums[j + 1] = nums[j] + nums[j + 1];
                    nums[j] = nums[j + 1] - nums[j];
                    nums[j + 1] = nums[j + 1] - nums[j];
                }
            }
        }
        return nums;
    }

    public static int[] moveZeroes1(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }
        for (int i = index; i < nums.length; i++) {
            nums[i] = 0;
        }
        return nums;
    }
}
