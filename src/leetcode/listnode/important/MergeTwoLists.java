package leetcode.listnode.important;

/**
 * @author huchenfei
 * @version 1.0
 * @className MergeTwoLists
 * @description 合并两个有序链表
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的
 * <p>
 * 示例：
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 * @date 2019/12/27 17:15
 **/
public class MergeTwoLists {
    public static void main(String... args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(1);
        listNode.add(2);
        listNode1.add(3);
        listNode1.add(4);
        listNode.add(5);

        ListNode listNode2 = mergeTwoLists(listNode, listNode1);
        listNode2.print();
    }

    private static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode prehead = new ListNode(-1);
        ListNode prev = prehead;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                prev.next = l1;
                l1 = l1.next;
            } else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }
        prev.next = l1 == null ? l2 : l1;
        return prehead.next;
    }
}
