package leetcode.String.important;

/**
 * @Author： huchenfei
 * @ClassName： ReverseString
 * @Description： 344. 反转字符串
 * 编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 char[] 的形式给出。
 * 不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
 * 你可以假设数组中的所有字符都是 ASCII 码表中的可打印字符。
 * <p>
 * 示例 1：
 * <p>
 * 输入：["h","e","l","l","o"]
 * 输出：["o","l","l","e","h"]
 * <p>
 * 示例 2：
 * 输入：["H","a","n","n","a","h"]
 * 输出：["h","a","n","n","a","H"]
 * @Date： 2019/6/19 20:16
 * @Version： 1.0
 **/
public class ReverseString {

    public static void main(String... args) {
        char[] s = new char[]{'h', 'e', 'l', 'l', 'o'};
        reverseString(s);
    }

    private static void reverseString(char[] s) {
        swap(0, s.length - 1, s);
        for (char c : s) {
            System.out.println(c);
        }
    }

    private static void swap(int start, int end, char[] s) {
        if (start > end) {
            return;
        }
        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;
        swap(start + 1, end - 1, s);
    }
}
