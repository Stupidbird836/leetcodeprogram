package solution.q_per_day;

/**
 * @author huchenfei
 * @version 1.0
 * @date 2020/3/19 16:04
 * @description 409. 最长回文串
 * 给定一个包含大写字母和小写字母的字符串，找到通过这些字母构造成的最长的回文串。
 * 在构造过程中，请注意区分大小写。比如 "Aa" 不能当做一个回文字符串。
 * 注意:
 * 假设字符串的长度不会超过 1010。
 * <p>
 * 示例 1:
 * 输入:"abccccdd"
 * 输出:7
 * 解释:
 * 我们可以构造的最长的回文串是"dccaccd", 它的长度是 7。
 * @className LongestPalindrome
 */
public class LongestPalindrome {

    public static void main(String[] args) {
        String s = "abccccdd";
        System.out.println(longestPalindrome(s));
    }

    private static int longestPalindrome(String s) {
        int[] sChars = new int[128];
        for (char c : s.toCharArray()) {
            sChars[c]++;
        }
        int longest = 0;
        for (int sChar : sChars) {
            longest += sChar / 2 * 2;
            if (sChar % 2 == 1 && longest % 2 == 0) {
                longest++;
            }
        }
        return longest;
    }
}