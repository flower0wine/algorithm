package Algorithms.代码随想录.link.反转链表;

import Algorithms.代码随想录.link.Node;

/**
 * @author flowerwine
 * @date 2024 年 01 月 12 日
 */
public class Main {
    public static void main(String[] args) {
        Node head = new Node(new Node(new Node(new Node())));
        head = reverse(head);
        System.out.println(head);
    }

    public static Node reverse(Node node) {
        if(node.next == null) {
            return node;
        }
        Node tail = reverse(node.next);
        node.next.next = node;
        node.next = null;
        return tail;
    }
}
