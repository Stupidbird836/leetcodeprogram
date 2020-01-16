package leetcode.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 * @author huchenfei
 * @version 1.0
 * @className CollectionsTest
 * @description
 * @date 2019/7/31 10:09
 **/
public class CollectionsTest {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person(7, 5));
        people.add(new Person(0, 5));
        people.add(new Person(7, 1));
        people.add(new Person(0, 5));
        people.add(new Person(0, 1));
        Collections.sort(people, new MyComparator());
        Iterator it = people.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}


class Person {

    private int saleType;
    private int wareId;

    public Person() {
    }

    public Person(int saleType, int wareId) {
        this.saleType = saleType;
        this.wareId = wareId;
    }

    public int getSaleType() {
        return saleType;
    }

    public void setSaleType(int saleType) {
        this.saleType = saleType;
    }

    public int getWareId() {
        return wareId;
    }

    public void setWareId(int wareId) {
        this.wareId = wareId;
    }

    @Override
    public String toString() {
        return "销售类型：" + saleType + ",仓库：" + wareId;
    }

}

class MyComparator implements Comparator<Person> {//实现Comparator接口，自定义比较器，实现compare方法定义比较算法

    @Override
    public int compare(Person o1, Person o2) {
        // 现根据仓库进行从小到大排序
        int result = o1.getWareId() - o2.getWareId();
        if (result == 0) {
            // 然后按照销售类型从大到小排 o1的销售类型比o2的销售类型小不作处理的话会是 o1 也就是小的在前,这样的话就是小的在后
            // 如果 o1的销售类型比o2的销售类型大,那么就需要的返回顺序就是o1 > o2,但是正常的话应该是 o2 > o1 所以做 相反数 处理
            return o1.getSaleType() < o2.getSaleType() ? 1 : (0 - o1.getSaleType() - o2.getSaleType());
        }
        return result;
    }
}
