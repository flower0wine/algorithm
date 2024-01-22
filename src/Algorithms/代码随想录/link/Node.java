package Algorithms.代码随想录.link;

import java.util.Objects;

/**
 * @author flowerwine
 * @date 2024 年 01 月 12 日
 */
public class Node<T> {
    public Node<T> next;
    public T data;

    public Node() {
    }

    public Node(Node<T> next) {
        this.next = next;
    }

    public Node(Node<T> next, T data) {
        this.next = next;
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        return this == o;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
