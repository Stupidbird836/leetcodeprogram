package search;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author huchenfei
 * @version 1.0
 * @className BreadthFirstSearch
 * @description 广度优先遍历
 * 广度优先遍历，指的是从图的一个未遍历的节点出发，
 * 先遍历这个节点的相邻节点，再依次遍历每个相邻节点的相邻节点。
 * @date 2020/6/2 19:14
 **/
public class BreadthFirstSearch {

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
        System.out.println("广度优先遍历结果: ");
        bfs(head);
        System.out.println();
    }

    /**
     * 广度优先遍历
     * 使用队列
     * 1. 先将头结点 1 放入队列
     * 2. 将头结点 1 从队列中拉出，并且查看头结点的左右节点是否有节点，将2，3 放入队列中【2，3】
     * 3. 将左节点 2 从队列中拉出，并且查看2节点的左右是否有节点，将 4，5放入队列中【3，4，5】
     * 4. 将左节点 3 从队列中拉出，并且查看3节点的左右是否有节点，将 6，7放入队列中【4，5，6，7】
     * 5. 将左节点 4 从队列中拉出，4 节点无左右节点【5，6，7】
     * 6. 将左节点 5 从队列中拉出，5 节点无左右节点【6，7】
     * 7. 将左节点 6 从队列中拉出，6 节点无左右节点【7】
     * 8. 将左节点 7 从队列中拉出，7 节点无左右节点
     *
     * @param head 二叉树头结点
     */
    private static void bfs(Node head) {
        if (head == null) {
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(head);
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            System.out.print(node.value);
            System.out.print(" ");
            Node left = node.left;

            if (left != null) {
                queue.add(left);
            }

            Node right = node.right;
            if (right != null) {
                queue.add(right);
            }
        }

    }
}
