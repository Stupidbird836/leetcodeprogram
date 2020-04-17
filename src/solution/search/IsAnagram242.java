package solution.search;

/**
 * @author huchenfei
 * @version 1.0
 * @className IsAnagram242
 * @description 242. 有效的字母异位词
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
 * <p>
 * 示例 1:
 * 输入: s = "anagram", t = "nagaram"
 * 输出: true
 * <p>
 * 示例 2:
 * 输入: s = "rat", t = "car"
 * 输出: false
 * 说明:
 * 你可以假设字符串只包含小写字母。
 * <p>
 * 进阶:
 * 如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？
 * @date 2019/7/10 20:13
 **/
public class IsAnagram242 {

    public static void main(String... args) {
        String s = "anagram";
        String t = "nagbram";
        System.out.println(isAnagram(s, t));
    }

    private static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        // 只有小写字母，定义一个26个字母占位的数组
        int[] alpha = new int[26];
        for (int i = 0; i < s.length(); i++) {
            // 将两个字符串中的字母再这个数组中进行占位和减位
            // 最终应该是一个26位的0数组
            alpha[s.charAt(i) - 'a']++;
            alpha[t.charAt(i) - 'a']--;
        }


        for (int value : alpha) {
            if (value != 0) {
                return false;
            }
        }
        return true;
    }

}
