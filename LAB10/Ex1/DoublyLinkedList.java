package LAB10.Ex1;

public class DoublyLinkedList implements List{

    // Implementation of the doubly linked nodes (nested-class)

    private static class Node {

 private Comparable value; //for the value
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
 throw new UnsupportedOperationException( "error!" );
    }

    public boolean add( Comparable o ) {
 throw new UnsupportedOperationException( "error!" );
    }

    public void remove( int pos ) {
 throw new UnsupportedOperationException( "error!" );
    }
}

