package leetcode.listnode.important;

/**
 * @Author：huchenfei
 * @ClassName：ReverseList
 * @Description：反转一个单链表。 示例:
 * <p>
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 * 进阶:
 * 你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
 * @Date：2019/7/25 19:35
 * @Version： 1.0
 **/
public class ReverseList {

    public static void main(String... args) {

    }

    public static ListNode reverseList(ListNode head) {
        return null;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public ListNode getNext() {
            return next;
        }

        public void setNext(ListNode next) {
            this.next = next;
        }
    }
}
