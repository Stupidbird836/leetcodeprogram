package leetcode.String.ordinary;

import java.util.logging.Level;

/**
 * @Author：huchenfei
 * @ClassName：LongestCommonPrefix
 * @Description：最长公共前缀 编写一个函数来查找字符串数组中的最长公共前缀。
 * <p>
 * 如果不存在公共前缀，返回空字符串 ""。
 * <p>
 * 示例 1:
 * <p>
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 * <p>
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * 说明:
 * <p>
 * 所有输入只包含小写字母 a-z 。
 * @Date：2019/7/15 19:08
 * @Version： 1.0
 **/
public class LongestCommonPrefix {

    public static void main(String... args) {
        String[] strs = new String[]{"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs));
    }

    private static String longestCommonPrefix(String[] strs) {
        if (strs ==null || strs.length <= 0) {
            return "";
        }
        String str0 = strs[0];
        // 获取长度最小的值
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < str0.length()) {
                str0 = strs[i];
            }
        }
        int length = str0.length();
        while (length > 0) {
            // 标记是否能够全员匹配
            int temp = 0;
            // 匹配前缀, 如果能够匹配则将匹配项 + 1
            for (String str : strs) {
                if (!str.startsWith(str0)) {
                    length--;
                    str0 = str.substring(0, length);
                    break;
                } else {
                    temp++;
                }
            }
            // 如果匹配项和数组长度一致,说明该前缀是最长前缀
            if (temp == strs.length) {
                return str0;
            }
        }
        return "";
    }
}
