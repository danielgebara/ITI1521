package LAB10.Ex5;

public class DoublyLinkedList implements List {

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
     // a dummy node is created and set with proper links.
        head = new Node(null, null,null);
        head.next = head;
        head.previous = head;
    }

    // Instance methods
    public int size() {
     Node node = head;
     int count = 0;
     while ( node.next!=head ) {
         node = node.next;
         count++;
     }
     return count;
    }
    

    public Object get( int pos ) {
     if (pos < 0) 
         throw new IndexOutOfBoundsException( Integer.toString( pos ) );
     Node node = head;
     for ( int i=0; i<=pos; i++ )
         if ( node.next == head )
      throw new IndexOutOfBoundsException( Integer.toString( pos ) );
         else
      node = node.next;
     return node.value;
    }
    public boolean add( Comparable obj ) {
     if ( obj == null )
         throw new IllegalArgumentException( "null" );
     if ( head.next == head ) { 
         head.next = new Node( obj, head, head );
         head.previous = head.next;    
     } 
     else { 
         Node node1 = head;
         while (node1.next != head && node1.next.value.compareTo( obj ) < 0 ) {
          node1 = node1.next;
         }
      Node node2 = node1.next; 
      node1.next = new Node( obj,node1, node2);
      node2.previous = node1.next;
     }
     return true;
    }
    public void remove( int pos ) {
      if ( pos < 0 ) 
         throw new IndexOutOfBoundsException( Integer.toString( pos ) );
     Node node = head;
     for ( int i=0; i<=pos; i++ ) 
      if ( node.next == head )
          throw new IndexOutOfBoundsException(Integer.toString(pos));
      else
          node = node.next;
         Node move = node;  
         node = node.previous; 
         Node nodeNext = move.next; 
         node.next = nodeNext;
         nodeNext.previous = node;
         move.value = null;
         move.next = null;
         move.previous= null;
    }
  
  public void merge( DoublyLinkedList other ) {
    Node node = head.next;
    Node nodeNext= other.head.next;
    while(nodeNext!=other.head){
      if ( node == head ) {          
        Node newNode = new Node(nodeNext.value, head.previous, head);
        head.previous.next = newNode;
        head.previous = newNode;
        nodeNext = nodeNext.next;
      } 
      else if (nodeNext.value.compareTo(node.value) < 0){
        Node newNode = new Node(nodeNext.value, node.previous, node);
        node.previous.next = newNode;
        node.previous = newNode;
        nodeNext = nodeNext.next;
      } 
      else if (node.next==head){
        Node newNode = new Node(nodeNext.value, node, head);
        node.next = newNode;
        head.previous = newNode;
        nodeNext = nodeNext.next;
      } 
      else {
        node = node.next;
      }
    }
  }
}
