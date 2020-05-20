package solution.moveelement;


import java.util.Arrays;

/**
 * @author huchenfei
 * @version 1.0
 * @className 283.MoveZeroes
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
 **/
public class MoveZeroes283 {

    public static void main(String... args) {
        int[] nums = new int[]{0, 1, 0, 3, 12};
        System.out.println(Arrays.toString(moveZeroes1(nums)));
    }

    /**
     * 补全数组法
     * 定义一个 index 指针,用来保存数组中所有的非零元素
     * 遍历整个数组,当发现非零元素就与当前的 index 指针进行交换
     * 相应的 index 指针下标也会增加
     * 之后再以 index 为界,后面全部补零
     *
     * @param nums 数组
     * @return int[]
     */
    private static int[] moveZeroes(int[] nums) {
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

    /**
     * 元素交换
     * 定义一个 index 指针,用来保存数组中所有的非零元素
     * 遍历整个数组,当发现非零元素就与当前的 index 指针进行交换
     * 相应的 index 指针下标也会增加
     * 之后再以 index 为界,后面全部补零
     *
     * @param nums 数组
     * @return int[]
     */
    private static int[] moveZeroes1(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                nums[i] = 0;
                index++;
            }
        }
        return nums;
    }
}
