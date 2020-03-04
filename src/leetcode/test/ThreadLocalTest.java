package leetcode.test;

/**
 * @author huchenfei
 * @version 1.0
 * @date 2020/3/4 16:34
 * @description
 * @className ThreadLocalTest
 */
public class ThreadLocalTest {

    /**
     * 因为 initValue 时类变量，所以当每个 线程去修改 initValue 的 set 值得时候
     * 按理说应该是逐步递增，但是由于使用了 ThreadLocal，ThreadLocal会在每一个线程得内部创建一个副本
     * 而每个线程的副本只能被自己所使用，所以也就不存在类变量共享一说，所以只会通过ThreadLocal的最原始值来进行操作
     *
     * @param args args
     */
    public static void main(String[] args) {
        new Thread("Thread1") {
            @Override
            public void run() {
                update();
            }
        }.start();
        new Thread("Thread2") {
            @Override
            public void run() {
                update();
            }
        }.start();
        new Thread("Thread3") {
            @Override
            public void run() {
                update();
            }
        }.start();
    }

    private static ThreadLocal<Integer> initValue = new ThreadLocal<Integer>() {
        @Override
        protected Integer initialValue() {
            return 10;
        }
    };

    private static void update() {
        initValue.set(initValue.get() + 66);
        System.out.println(initValue.get());
    }
}
