package solution.q_per_day;

/**
 * @author huchenfei
 * @version 1.0
 * @date 2020/3/17 9:52
 * @description 1160. 拼写单词
 * 给你一份『词汇表』（字符串数组） words 和一张『字母表』（字符串） chars。
 * 假如你可以用 chars 中的『字母』（字符）拼写出 words 中的某个『单词』（字符串），那么我们就认为你掌握了这个单词。
 * 注意：每次拼写时，chars 中的每个字母都只能用一次。
 * 返回词汇表 words 中你掌握的所有单词的 长度之和。
 * <p>
 * 示例 1：
 * 输入：words = ["cat","bt","hat","tree"], chars = "atach"
 * 输出：6
 * 解释：
 * 可以形成字符串 "cat" 和 "hat"，所以答案是 3 + 3 = 6。
 * <p>
 * 示例 2：
 * 输入：words = ["hello","world","leetcode"], chars = "welldonehoneyr"
 * 输出：10
 * 解释：
 * 可以形成字符串 "hello" 和 "world"，所以答案是 5 + 5 = 10。
 *  
 * 提示：
 * 1 <= words.length <= 1000
 * 1 <= words[i].length, chars.length <= 100
 * 所有字符串中都仅包含小写英文字母
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/find-words-that-can-be-formed-by-characters
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @className CountCharacters
 */
public class CountCharacters1160 {

    public static void main(String[] args) {
        String chars = "welldonehoneyr";
        String[] words = {"a", "e", "c"};
        System.out.println(countCharacters(words, chars));
    }

    private static int countCharacters(String[] words, String chars) {
        int[] wordNum = new int[26];
        for (char c : chars.toCharArray()) {
            wordNum[c - 'a'] += 1;
        }
        int totalNum = 0;
        for (String word : words) {
            if (word.length() <= 0 || word.length() > chars.length()) {
                continue;
            }
            int signNum = 0;
            int[] temporaryNum = new int[26];
            for (int i = 0; i < wordNum.length; i++) {
                temporaryNum[i] = wordNum[i];
            }

            for (char c : word.toCharArray()) {
                if (temporaryNum[c - 'a']-- != 0) {
                    signNum++;
                    continue;
                }
                break;
            }
            if (signNum == word.length()) {
                totalNum += signNum;
            }
        }
        return totalNum;
    }
}
