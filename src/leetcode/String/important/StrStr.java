package leetcode.String.important;

/**
 * @Author：huchenfei
 * @ClassName：StrStr
 * @Description： 28. 实现strStr()
 * <p>
 * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
 * <p>
 * 示例 1:
 * <p>
 * 输入: haystack = "hello", needle = "ll"
 * 输出: 2
 * 示例 2:
 * <p>
 * 输入: haystack = "aaaaa", needle = "bba"
 * 输出: -1
 * 说明:
 * <p>
 * 当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。
 * <p>
 * 对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与C语言的 strstr() 以及 Java的 indexOf() 定义相符。
 * @Date：2019/6/27 19:29
 * @Version： 1.0
 **/
public class StrStr {

    public static void main(String... args) {
        String haystack = "mississippi";
        String needle = "pi";
        System.out.println(strStr(haystack, needle));
    }

    public static int strStr(String haystack, String needle) {
        int length = haystack.length();
        int length1 = needle.length();
        if (length < length1) {
            return -1;
        }
        if (length == length1 && haystack.equals(needle)) {
            return 0;
        }
        for (int i = 0; i <= length - length1; i++) {
            int j;
            for (j = 0; j < length1; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
            }
            if (j == length1) {
                return i;
            }
        }
        return -1;
    }
}
