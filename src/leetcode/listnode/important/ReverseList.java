package leetcode.listnode.important;

/**
 * @author huchenfei
 * @className ReverseList
 * @description 反转一个单链表。
 * <p>
 * 示例:
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 * 进阶:
 * 你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
 * @date  2019/7/25 19:35
 * @version 1.0
 **/
public class ReverseList {

    public static void main(String... args) {
        ListNode listNode = new ListNode(1);
        listNode.add(2);
        listNode.add(3);
        listNode.add(4);
        listNode.add(5);
        listNode.print();
        ListNode listNode1 = reverseList(listNode);
        System.out.println("");
        listNode1.print();
    }

    /**
     * 首先获取到链表信息 curr, 此时的链表是一个完整的链表
     * 第一次循环:
     * curr的头结点为 2
     * 获取链表 curr 当前节点的下游链表 next [2,3,4,5]
     * 将 curr 链表的下一个节点复制为 prev 链表, 此时 curr 链表 为1-->null
     * 将当前链表赋值给 prev, 此时 prev就为 1-->null
     * 然后再将之前截取的下游链表 next 给到 curr ,此时 curr 为 [2,3,4,5]
     * 第二次循环:
     * curr的头结点为 2
     * 获取链表 curr 当前节点的下游链表 next [3,4,5]
     * 将 curr 链表的下一个节点复制为 prev 链表, 此时 curr 链表 为2-->1-->null
     * 将当前链表赋值给 prev, 此时 prev就为 1-->null
     * 然后再将之前截取的下游链表 next 给到 curr ,此时 curr 为 [3,4,5]
     *
     * @param head
     * @return
     */
    private static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            System.out.println("");
            prev.print();
        }
        return prev;
    }

    // 简洁版
//    private static ListNode reverseList(ListNode head) {
//        ListNode prev = null;
//        ListNode curr = head;
//        while (curr != null) {
//            ListNode next = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = next;
//        }
//        return prev;
//    }


}
