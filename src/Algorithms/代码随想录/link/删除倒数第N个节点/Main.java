package Algorithms.代码随想录.link.删除倒数第N个节点;

import Algorithms.代码随想录.link.Node;

/**
 * @author flowerwine
 * @date 2024 年 01 月 19 日
 */
public class Main {
    public static void main(String[] args) {
        Node<Integer> head = new Node<>(new Node<>(new Node<>(new Node<>(null, 4), 3), 2), 1);

        int n = 2;
        Node<Integer> fast = head;
        Node<Integer> slow = head;

        for(int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        while(fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

    }
}
