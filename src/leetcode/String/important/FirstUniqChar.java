package leetcode.String.important;

import java.util.HashMap;

/**
 * @Author：huchenfei
 * @ClassName：FirstUniqChar
 * @Description：387. 字符串中的第一个唯一字符
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 * <p>
 * 案例:
 * <p>
 * s = "leetcode"
 * 返回 0.
 * <p>
 * s = "loveleetcode",
 * 返回 2.
 * <p>
 * <p>
 * 注意事项：您可以假定该字符串只包含小写字母。
 * @Date：2019/6/20 20:03
 * @Version： 1.0
 **/
public class FirstUniqChar {
    public static void main(String... args) {
        String s = "loveleetcode";
        System.out.println(firstUniqChar1(s));
    }

    public static int firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (i == j) {
                    continue;
                }
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                }
            }
            if (count == 0) {
                return i;
            }
        }
        return -1;
    }

    public static int firstUniqChar1(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            String s1 = String.valueOf(s.charAt(i));
            if (map.containsKey(s1)) {
                map.put(s1, map.get(s1) + 1);
            } else {
                map.put(s1, 1);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            String s1 = String.valueOf(s.charAt(i));
            if (map.get(s1) == 1) {
                return i;
            }
        }
        return -1;
    }
}
