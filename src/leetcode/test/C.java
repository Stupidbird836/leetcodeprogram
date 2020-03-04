package leetcode.test;

/**
 * @author huchenfei
 * @version 1.0
 * @date 2020/2/29 1:15
 * @description
 * @className C
 */
public class C extends B implements A {
    public static void main(String[] args) {
        C c = new C();
        c.test();
    }

    @Override
    public String test() {
        System.out.println("C");
        return "C";
    }

    //
//    @Override
//    public String test1() {
//        System.out.println("C");
//        return "C";
//    }
}
