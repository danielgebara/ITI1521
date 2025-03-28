package LAB10.Ex4;

public class DoublyLinkedList implements List{

    // Implementation of the doubly linked nodes (nested-class)

    private static class Node {

 private Comparable value;

 private Node previous;   //for the previous node
 private Node next; //for the next node

 private Node ( Comparable value, Node previous, Node next ) {
     this.value = value;
     this.previous = previous;
     this.next = next;
 }
    }

    // Instance variables
    private Node head;

    // Empty list.
    public DoublyLinkedList() {
     // a dummy node is created
        head = new Node(null, null,null);
        head.next = head;
        head.previous = head;
    }

     // Instance methods
     public int size() {
        int count = 0;
        Node current = head.next;
        while (current != head) {
            count++;
            current = current.next;
        }
        return count;
   }
 
   public Object get( int pos ) {
     if (pos < 0 || pos >= size()) {
        throw new IndexOutOfBoundsException(Integer.toString(pos));
    }
    Node current = head.next;
    for (int i = 0; i < pos; i++) {
        current = current.next;
    }
    return current.value;
   }

   public boolean add( Comparable o ) {
     if (o == null) {
        throw new IllegalArgumentException("Element cannot be null");
    }
    Node current = head.next;
    while (current != head && o.compareTo(current.value) > 0) {
        current = current.next;
    }
    Node newNode = new Node(o, current.previous, current);
    current.previous.next = newNode;
    current.previous = newNode;
    return true;
   }

   public void remove( int pos ) {
     if (pos < 0 || pos >= size()) {
        throw new IndexOutOfBoundsException(Integer.toString(pos));
    }
    Node current = head.next;
    for (int i = 0; i < pos; i++) {
        current = current.next;
    }
    current.previous.next = current.next;
    current.next.previous = current.previous;
   }
}

