package leetcode.test;

/**
 * @author huchenfei
 * @version 1.0
 * @date 2020/2/29 1:14
 * @description
 * @className B
 */
public abstract class B implements A{

    @Override
    public String test() {
        System.out.println("a");
        return test1();
    }

    public String test1() {
        System.out.println("B");
        return "B";
    }
}
