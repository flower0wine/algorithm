package Algorithms.代码随想录.link.环形链表;

import Algorithms.代码随想录.link.Node;

/**
 * @author flowerwine
 * @date 2024 年 01 月 20 日
 */
public class Main {
    public static void main(String[] args) {
        Node<Integer> tail = new Node<>(null, -4);
        Node<Integer> n = new Node<>(new Node<>(tail, 0), 2);
        tail.next = n;
        Node<Integer> head = new Node<>(n, 3);

        Node<Integer> fast = head;
        Node<Integer> slow = head;

        Node<Integer> meet = null;

        boolean loop = false;
        while(!loop) {
            if(fast != null) {
                fast = fast.next;
            } else {
                break;
            }
            if(fast != null) {
                fast = fast.next;
            } else {
                break;
            }
            if(slow != null) {
                slow = slow.next;
            }
            if(slow == fast) {
                loop = true;
                meet = slow;
            }
        }

        if(loop) {
            Node<Integer> node = head;
            while(node != meet) {
                node = node.next;
                meet = meet.next;
            }
        }

        System.out.println();
    }
}
