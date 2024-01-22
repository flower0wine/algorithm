package Algorithms.代码随想录.link.两两交换链表中的节点;

import Algorithms.代码随想录.link.Node;

/**
 * @author flowerwine
 * @date 2024 年 01 月 13 日
 */
public class Main {
    public static void main(String[] args) {
        Node<Integer> head = new Node<>(new Node<>(new Node<>(new Node<>(new Node<>(null, 5), 4), 3), 2), 1);

        head = exchange(head);
        System.out.println(head);
    }

    public static <T> Node<T> exchange(Node<T> node) {
        if (node == null || node.next == null) {
            return node;
        }
        Node<T> n = node;
        Node<T> t;
        Node<T> head = node.next;
        t = n.next;
        n.next = t.next;
        t.next = n;
        while (n.next != null) {
            t = n.next;
            if(t.next != null) {
                n.next = t.next;
                t.next = t.next.next;
                n.next.next = t;
                n = n.next.next;
            } else {
                break;
            }
        }
        return head;
    }
}
