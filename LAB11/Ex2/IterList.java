package LAB11.Ex2;

import java.util.NoSuchElementException;

// Stores the bits in reverse order!
public class IterList {

    // Constants
    public static final int ZERO = 0;
    public static final int ONE = 1;

    // instance variables
    private Node head;

    // constructors
    public IterList() {  
        head = null;
    }

    public IterList(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c != '0' && c != '1') {
                throw new IllegalArgumentException("Invalid character in string: " + c);
            }
            addFirst(c - '0');
        }
    }

    // instance methods
    /*
     * add an item at the head of the list
     * 
     */
    public void addFirst(int elem) {
        head = new Node(elem, head);
    }// end of addFirst

    /*
     * remove the first item of the list
     * 
     */
    public int removeFirst() {
        int temp = head.value;
        head = head.next;
        return temp;
        // VOTRE CODE VIENT ICI
    }// end of removeFirst
     /*
     * iterator
     * 
     */
    public Iterator iterator() {
        return new IterListIterator();
       }//end of iterator
    
     /*
     * toString
     */
    public String toString() {

        String str = "";

        if ( head == null ) {
            str += ZERO;

        } 
        else {

            Node p = head;

            while ( p!=null ) {
                str = p.value + str; // reverses the order!
                p = p.next;
            }

        }
        return str;
    }//end of toString

    // The implementation of the nodes (static nested class)

    private static class Node {

        private int value; 
        private Node next;

        private Node( int value, Node next ) { 
            this.value = value;
            this.next  = next;
        }
    }//end of Node class

    // The implementation of the iterators (inner class)

    private class IterListIterator implements Iterator {

        private Node current = null;

        private IterListIterator () {
            current = null;
        }

        public boolean hasNext() {
            return ( ( current == null && head != null )   ||
                     ( current != null && current.next != null ) );
        }//end of hasNext

        public int next() {

            if ( current == null ) {
                current = head ;
            } 
            else {
                current = current.next ; // move forward
            }

            if ( current == null ) {
                throw new NoSuchElementException() ;
            }

            return current.value ;
        }//end of next

        public void add( int elem ) {

            if ( ( elem != ZERO ) && ( elem != ONE ) ) {
                throw new IllegalArgumentException( Integer.toString( elem ) );
            }

            Node newNode;

            if ( current == null ) {
                head = new Node( elem, head );
                current = head;
            } 
            else {
                current.next = new Node( elem, current.next );
                current = current.next;
            }
        } //end of add
    } //end of IterListIterator

} //end of IterList calss


