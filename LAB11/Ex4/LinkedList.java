package LAB11.Ex4;

public class LinkedList<E> {
  
    //doubly linked nodes (static nested class) 
    private static class Node<E> {
    
        private E value;
    
        private Node<E> previous;
        private Node<E> next;
    
        private Node( E value, Node<E> previous, Node<E> next ) {
            this.value = value;
            this.previous = previous;
            this.next = next;
        }
    }
  
    // Instance variables
    private Node<E> head;
    private int size;
  
    /** Constructor for creating a new linked list.
     */
    public LinkedList() {
    
        // the empty list using a dummy node
        head = new Node<E>( null, null, null );
        head.next = head.previous = head;
        size = 0;
    }
  
    
    //  Instance methods
  
    /** 
     * Returns the number of elements currently stored in this list.
     *
     * @return the number of elements of this list.
     */
    public int size() {
        return size;
    }// End of size
  
    /**
     * Returns true if this list is empty
     *
     * @return true if this list is empty
     */
  
    public boolean isEmpty() {
        return size == 0;
    }// End of isEmpty
  
    /** 
     * Adds an element at the end of the list.
     *
     * @throws IllegalArgumentException if elem is null.
     */
    public boolean addLast( E elem ) {
    
        if ( elem == null ) {
            throw new IllegalArgumentException( "null" );
        }
    
        Node<E> before = head.previous;
        Node<E> after = head;
    
        before.next = new Node<E>( elem, before, after );
        after.previous = before.next;
    
        size++;
    
        return true;
    }// End of addLast
  
    /** 
     * Adds an element at the start of the list.
     *
     * @throws IllegalArgumentException if elem is null.
     */
    public boolean addFirst( E elem ) {
    
        if ( elem == null ) {
            throw new IllegalArgumentException( "null" );
        }
    
        Node<E> before = head;
        Node<E> after = head.next;
    
        before.next = new Node<E>( elem, before, after );
        after.previous = before.next;
    
        size++;
    
        return true;
    }// End of addFirst
  
    /** 
     * Returns the element at the specified index; the first
     * element has the index 0.
     *
     * @return the element at the specified index.
     * @throws IndexOutOfBoundsException if index is out of range (index < 0 || index >= size()). 
     */
  
    public E get( int index ) {
    
        if ( index < 0 || index > (size-1) ) {
            throw new IndexOutOfBoundsException( Integer.toString( index ) );
        }
    
        Node<E> p = head.next;
    
        for ( int i=0; i<index; i++ ) {
            p = p.next;
        }
    
        return p.value; 
    }// End of get
    
    
    /** 
     * remove instance method 
     */
    public LinkedList<E> remove( int fromIndex, int toIndex ) {

        if (fromIndex < 0 || toIndex >= size || fromIndex > toIndex) {
            throw new IndexOutOfBoundsException(
                    "fromIndex=" + fromIndex + ", toIndex=" + toIndex + ", size=" + size);
        }
        Node<E> start = head.next;
        for (int i = 0; i < fromIndex; i++) {
            start = start.next;
        }
        Node<E> end = start;
        for (int i = fromIndex; i < toIndex; i++) {
            end = end.next;
        }
        Node<E> before = start.previous;
        Node<E> after = end.next;
        before.next = after;
        after.previous = before;
        int count = toIndex - fromIndex + 1;
        size -= count;
        LinkedList<E> removedList = new LinkedList<E>();
        removedList.head.next = start;
        removedList.head.previous = end;
        start.previous = removedList.head;
        end.next = removedList.head;
        removedList.size = count;
        return removedList;
    } // End of remove

   
    //  toString instance method
    public String toString() {
        StringBuffer input = new StringBuffer( "[" );
        Node<E> p = head.next;
        while ( p != head ) {
            if ( p != head.next ) {
         input.append( "," );
            }
            input.append( p.value );
            p = p.next;
        }
        input.append( "]" );
        return input.toString();
   }// End of toString
  
} // End of  LinkedList

