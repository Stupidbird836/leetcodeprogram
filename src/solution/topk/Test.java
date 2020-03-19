package solution.topk;

import java.util.HashMap;
import java.util.Map;

/**
 * @author huchenfei
 * @version 1.0
 * @date 2020/3/18 20:40
 * @description
 * @className Test
 */
public class Test {
    public static void main(String[] args) {
        Map<String, String> a = new HashMap<>();
        a.put("a", "a");
        Map<String, String> b = new HashMap<>(a);
        b.put("a", "b");
        System.out.println(a.get("a"));
        System.out.println(b.get("a"));
    }
}
