package linkedlist;

public class LinkedList {

    private Node head;  // Head of LinkedList
    // Linked List Node

    private void add(int data) {
        Node newNode = new Node(data);
        newNode.setNext(head);
        head = newNode;
    }

    public Node getHeadNode() {
        return head;
    }

    private void show() {
        Node nodes = head;
        while(nodes != null) {
            System.out.print(nodes.getData()+ " -> " );
            nodes = nodes.getNext();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.add(6);
        ll.add(7);
        ll.show();
        FindElement fe = new FindElement();
        int me = fe.findMiddleElement(ll);
        System.out.println("MIDDLE ELEMENT :" + me);
    }
}
