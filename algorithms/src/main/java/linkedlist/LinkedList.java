package linkedlist;

public class LinkedList {

    private Node head;  // Head of LinkedList
    // Linked List Node
    class Node {
        private int data;
        private Node next;

        Node(int data) {
            this.data = data;
        }
    }

    private void add(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    private void show() {
        Node nodes = head;
        while(nodes != null) {
            System.out.print(nodes.data + " -> " );
            nodes = nodes.next;
        }
    }

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();
        ll.add(5);
       // ll.show();
        ll.add(10);
       // ll.show();
        ll.add(6);
        ll.show();

    }
}
