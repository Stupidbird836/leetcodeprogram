package leetcode.listnode.important;

/**
 * @author huchenfei
 * @version 1.0
 * @className ListNode
 * @description
 * @date 2019/12/27 16:19
 **/
public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    public void add(int newval) {
        ListNode newNode = new ListNode(newval);
        if (this.next == null) {
            this.next = newNode;
        } else {
            this.next.add(newval);
        }
    }

    public void print() {
        System.out.print(this.val);
        if (this.next != null) {
            System.out.print("-->");
            this.next.print();
        }
    }
}
