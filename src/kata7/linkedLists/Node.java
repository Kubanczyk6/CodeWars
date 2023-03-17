package kata7.linkedLists;

import java.util.Objects;

public class Node {

    public static void main(String[] args) {
        Node push = Node.push(new Node(1), 2);
        System.out.println(push.data);
        System.out.println(push);
    }

    int data;
    Node next = null;

    Node(final int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }

    public static Node push(final Node head, final int data) {
        if (Objects.isNull(head)) {
            return new Node(data);
        } else {
            Node node = new Node(data);
            node.next = new Node(head.data);
            return node;
        }
    }

    public static Node buildOneTwoThree() {
        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(3);
        return node;
    }
}
