package Algorithms.代码随想录.link.链表相交;

import Algorithms.代码随想录.link.Node;

import java.util.HashSet;
import java.util.Set;

/**
 * @author flowerwine
 * @date 2024 年 01 月 20 日
 */
public class Main {
    public static void main(String[] args) {
        Node<Integer> headC = new Node<>(new Node<>(new Node<>(null, 5), 4), 8);
        Node<Integer> headA = new Node<>(new Node<>(headC, 1), 4);
        Node<Integer> headB = new Node<>(new Node<>(new Node<>(headC, 1), 0), 5);

        Set<Node<Integer>> set = new HashSet<>();

        Node<Integer> target = null;
        boolean found = false;
        while(!found && (headA != null || headB != null)) {
            if(!set.contains(headA)) {
                set.add(headA);
            } else {
                found = true;
                target = headA;
            }
            if(!set.contains(headB)) {
                set.add(headB);
            } else {
                found = true;
                target = headB;
            }
            if(headA != null) {
                headA = headA.next;
            }
            if(headB != null) {
                headB = headB.next;
            }
        }
        System.out.println(target);
    }
}
