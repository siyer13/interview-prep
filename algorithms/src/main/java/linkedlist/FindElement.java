package linkedlist;

public class FindElement {

    public int findMiddleElement(LinkedList ll ) {
        Node fastPtr = ll.getHeadNode();
        Node slowPtr = ll.getHeadNode();
        if (ll.getHeadNode() != null) {
            while (fastPtr.getNext() != null && fastPtr != null) {
                    fastPtr = fastPtr.getNext().getNext();
                    System.out.println("FAST PTR: " + fastPtr.getData());
                    slowPtr = slowPtr.getNext();
                    System.out.println("SLOW PTR: " + slowPtr.getData());
                }
            }
        return slowPtr.getData();
        }

        public boolean isCyclic(LinkedList ll) {
            Node fastPtr = ll.getHeadNode();
            Node slowPtr = ll.getHeadNode();

            while(fastPtr != null && fastPtr.getNext() != null) {
                fastPtr = fastPtr.getNext().getNext();
                slowPtr = slowPtr.getNext();

                if(fastPtr == slowPtr) {
                    return true;
                }
            }
            return false;
        }
}
