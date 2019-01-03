package linkedlist;

public class FindElement {

    public int findMiddleElement(LinkedList ll ) {
        Node fastPtr = ll.getHeadNode();
        Node slowPtr = ll.getHeadNode();
        if (ll.getHeadNode() != null) {
            while (fastPtr.getNext() != null && slowPtr.getNext() != null) {
                    fastPtr = fastPtr.getNext().getNext();
                    System.out.println("FAST PTR: " + fastPtr.getData());
                    slowPtr = slowPtr.getNext();
                    System.out.println("SLOW PTR: " + slowPtr.getData());
                }
            }
        return slowPtr.getData();
        }
}
