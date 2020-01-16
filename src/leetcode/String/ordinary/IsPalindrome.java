package leetcode.String.ordinary;

/**
 * @author huchenfei
 * @version 1.0
 * @className IsPalindrome
 * @description 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。 <p><p/>
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "A man, a plan, a canal: Panama"
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: "race a car"
 * 输出: false
 * @date 2019/6/27 19:57
 **/
public class IsPalindrome {

    public static void main(String... args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        s = s.toLowerCase();
        for (int i = 0, j = s.length() - 1; i <= j; ) {
            char p = s.charAt(i);
            char q = s.charAt(j);
            // p不为数字或字符时i往后找到第一个符合条件
            if (!((p >= '0' && p <= '9') || (p >= 'a' && p <= 'z'))) {
                i++;
                continue;
            }
            // q不为数字或字符时i往前找到第一个符合条件
            if (!((q >= '0' && q <= '9') || (q >= 'a' && q <= 'z'))) {
                j--;
                continue;
            }
            //当pq所指字符为数字和字母时才比较，如果字符或数字不相等立刻返回false
            if (p != q) {
                return false;
            } else {
                i++;
                j--;
            }
        }
        return true;
    }
}
