package leetcode.Array.ordinary;

/**
 * @ClassName DeleteRepeatNum
 * @Description 数组的操作：从排序数组中删除重复项
 * <p>
 * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 * <p>
 * 示例 1:
 * 给定数组 nums = [1,1,2],
 * 函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2。
 * 你不需要考虑数组中超出新长度后面的元素。
 * <p>
 * 示例 2:
 * 给定 nums = [0,0,1,1,1,2,2,3,3,4],
 * 函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。
 * 你不需要考虑数组中超出新长度后面的元素。
 * <p>
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/21/
 * @Author huchenfei
 * @Date 2019/4/10 15:20
 * @Version 1.0
 **/
public class DeleteRepeatNum {
    public static void main(String... args) {
        int[] nums = new int[]{1, 1, 2};

        int len = removeDuplicates(nums);
        for (int i = 0; i < len; i++) {
            System.out.println(nums[i]);
        }
    }

    /**
     * nums数组会发生改变的方式
     *
     * @param nums
     * @return
     */
    private static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    /**
     * nums元素发生变化的方式
     *
     * @param nums
     * @return
     */
//    private static int removeDuplicates(int[] nums) {
//        if (nums.length == 0) return 0;
//        int i = 0;
//        for (int j = 1; j < nums.length; j++) {
//            if (nums[j] != nums[i]) {
//                i++;
//                int a = nums[i];
//                int b = nums[j];
//                nums[i] = b;
//                nums[j] = a;
//            }
//        }
//        return i + 1;
//    }
}
