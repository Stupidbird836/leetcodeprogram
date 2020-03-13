package sort;


/**
 * @author huchenfei
 * @version 1.0
 * @className BinarySearch
 * @description 二分查找
 * @date 2019/4/30 16:00
 **/
public class BinarySearch {

    public static void main(String... args) {
        int[] nums = {1, 10, 11, 22, 32, 36, 39, 43, 49, 51, 55, 66, 60, 77, 78, 88};
        int target = 50;
        int index = binarySearch(nums, target);
        System.out.println(index);
    }

    private static int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {

            int middle = left + (right - left) / 2;
            int num = nums[middle];

            if (num == target) {
                return target;
            }

            if (num < target) {
                left = middle + 1;
                while (left <= right && num == nums[left]) {
                    left++;
                }
            }

            if (num > target) {
                right = middle - 1;
                while (left <= right && num == nums[right]) {
                    right--;
                }
            }
        }
        return -1;
    }
}
