package leetcode.String.ordinary;

/**
 * @Author：huchenfei
 * @ClassName：Reverse
 * @Description：给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 123
 * 输出: 321
 * 示例 2:
 * <p>
 * 输入: -123
 * 输出: -321
 * 示例 3:
 * <p>
 * 输入: 120
 * 输出: 21
 * 注意:
 * <p>
 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
 * @Date：2019/7/2 19:20
 * @Version： 1.0
 **/
public class Reverse {

    public static void main(String... args) {
        int x = 0;
        System.out.println(reverse(x));
    }

    /**
     * x = 999
     * 1. 首先获取余数 9
     * 2. x = 99
     * 3. result = 9
     * 4. 获取余数 9
     * 5. x = 9
     * 6. result = 99
     * ....
     *
     * @param x
     * @return
     */
    private static int reverse(int x) {
        int result = 0;
        while (x != 0) {
            // 获取除以10 的余数
            int y = x % 10;
            // 将x 减少10倍
            x = x / 10;
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && y > 7)) {
                return 0;
            }
            if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && y < -8)) {
                return 0;
            }
            result = result * 10 + y;
        }
        return result;
    }
}
