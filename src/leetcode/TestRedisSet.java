package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author huchenfei
 * @version 1.0
 * @className TestRedisSet
 * @description
 * @date 2020/1/6 17:40
 **/
public class TestRedisSet {

    public static void main(String... args) {
        Set<String> set1 = new HashSet<String>() {
            {
                add("a");
                add("b");
                add("c");
                add("d");
            }
        };

        Set<String> set2 = new HashSet<String>() {
            {
                add("a");
                add("b");
                add("c");
            }
        };

        // 交集
        retain(set1, set2);

        // 并集
        add(set1, set2);

        // 差集
        remove(set1, set2);
    }

    private static void add(Set<String> set1, Set<String> set2) {
        Set<String> result = new HashSet<String>();
        result.addAll(set1);
        result.addAll(set2);
        System.out.println("并集：" + result);
    }

    private static void remove(Set<String> set1, Set<String> set2) {
        Set<String> result = new HashSet<String>();
        result.addAll(set1);
        result.removeAll(set2);
        System.out.println("差集：" + result);
    }

    private static void retain(Set<String> set1, Set<String> set2) {
        Set<String> result = new HashSet<String>();
        result.addAll(set1);
        result.retainAll(set2);
        System.out.println("交集：" + result);
    }
}
