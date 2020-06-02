package search;

import java.util.Stack;

/**
 * @author huchenfei
 * @version 1.0
 * @className DepthFirstSearch
 * @description 二叉树深度遍历算法
 * 先从根节点沿着（左或者右）分支走到底，当再也没有叶子节点之后，返回上一节点
 * 如果上一个节点还有另外一个子节点，那么遍历这个节点分支直至再也没有叶子节点，之后重复上面的过程
 * @date 2020/6/2 15:38
 **/
public class DepthFirstSearch {

    private static class Node {
        /**
         * 节点值
         */
        public int value;
        /**
         * 左节点
         */
        public Node left;
        /**
         * 右节点
         */
        public Node right;

        public Node(int value) {
            this.value = value;
        }

    }

    public static void main(String... args) {
        Node head = new Node(1);
        Node second = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);
        Node six = new Node(6);
        Node seven = new Node(7);

        head.right = three;
        head.left = second;
        second.right = five;
        second.left = four;
        three.right = seven;
        three.left = six;
        System.out.println("递归方式 -> 深度优先遍历结果: ");
        recursiveDfs(head);
        System.out.println();
        System.out.println("非递归方式 -> 深度优先遍历结果: ");
        unRecursiveDfs(head);
        System.out.println();
    }

    /**
     * 递归方式实现 DFS
     *
     * @param head 二叉树
     */
    public static void recursiveDfs(Node head) {
        if (head == null) {
            return;
        }
        System.out.print(head.value);
        System.out.print(" ");
        // 遍历左节点
        recursiveDfs(head.left);
        // 遍历右节点
        recursiveDfs(head.right);
    }

    /**
     * 非递归的使用栈来实现 DFS
     * 依据栈的先进后出特性
     * 1. 将二叉树的头结点放入栈中
     * 2. 将头结点 1 从栈中弹出，并查看头结点是否有左右节点，将右节点和左节点压入栈中【3，2】
     * 3. 将头结点 2 从栈中弹出，并查看 2 节点是否有左右节点，将右节点和左节点压入栈中【3，5，4】
     * 4. 将头结点 4 从栈中弹出，无左右节点【3，5】
     * 5. 将头结点 5 从栈中弹出，无左右节点【3】
     * 6. 将头结点 3 从栈中弹出，并查看 3 节点是否有左右节点，将右节点和左节点压入栈中【7，6】
     * 7. 将头结点 6 从栈中弹出，无左右节点【7】
     * 8. 将头结点 7 从栈中弹出，无左右节点
     *
     * @param head 二叉树
     */
    public static void unRecursiveDfs(Node head) {
        if (head == null) {
            return;
        }

        Stack<Node> stack = new Stack<>();
        // 先将根结点压入栈中
        stack.push(head);
        while (!stack.isEmpty()) {
            Node node = stack.pop();
            System.out.print(node.value);
            System.out.print(" ");

            // 将节点右边的压入栈中
            if (node.right != null) {
                stack.push(node.right);
            }

            // 压入左边的栈中
            if (node.left != null) {
                stack.push(node.left);
            }
        }
    }
}
