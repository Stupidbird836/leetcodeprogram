package solution.twopoint;

/**
 * @author huchenfei
 * @version 1.0
 * @date 2020/4/13 15:04
 * @description 3. 无重复字符的最长子串
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * <p>
 * 示例 1:
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * <p>
 * 示例 2:
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * <p>
 * 示例 3:
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-substring-without-repeating-characters
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @className LengthOfLongestSubstring3
 */
public class LengthOfLongestSubstring3 {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }

    /**
     * 典型的滑动窗口解法
     * 首先定义两个指针用来标记子串的范围
     * 然后判断当前右指针右侧的字符时候会在当前子串的包含范围内
     * 包含则左指针右移，否则右指针继续右移，这样能够保证这个子串中不会出现重复的字符
     *
     * @param s 字符串
     * @return int
     */
    private static int lengthOfLongestSubstring(String s) {
        // 定义左右两个指针
        int left = 0, right = -1;
        // 字符标记
        int[] freq = new int[256];
        // 长度
        int length = 0;
        while (left < s.length()) {
            if (right + 1 < s.length() && freq[s.charAt(right + 1)] == 0) {
                freq[s.charAt(++right)]++;
            } else {
                freq[s.charAt(left++)]--;
            }
            length = Math.max(length, right - left + 1);
        }
        return length;
    }
}
