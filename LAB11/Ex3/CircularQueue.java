package LAB11.Ex3;

import java.util.NoSuchElementException;

public class CircularQueue<E> implements Queue<E> {
private static final int DEFAULT_CAPACITY = 100;
private int front, rear, size;
private E[] elems;

public CircularQueue(int capacity) {
elems = (E[]) new Object[capacity];
front = 0;
rear = -1;
size = 0;
}


 private class CircularQueueIterator implements Iterator<E> {
     private int current = 0;
     public E next() {
      if ( current >= size ) {
      throw new NoSuchElementException();
      }
      E element = elems[(front + current) % elems.length];
      current++; // Move to the next element for future calls.
      return element;     }
     
     public boolean hasNext() {
         return (current < size);     }
 }// End of CircularQueueIterator

 public Iterator<E> iterator() {
     return new CircularQueueIterator();
 }

 public boolean isEmpty() {
  return ( size == 0 );
 }
 public void enqueue( E value ) {
  rear = ( rear+1 ) % elems.length;
  elems[ rear ] = value;
  size++;
 }

 public E dequeue() {
     E save = elems[ front ];
     elems[ front ] = null; 
     size--;
     front =  ( front+1 ) % elems.length;
     return save;
 }

 public String toString() {

     StringBuffer str = new StringBuffer( "[" );

     if ( size > 0 ) {

  int offset = 0;

  str.append( elems[ front ] );
  offset = offset + 1;

  while ( offset < size ) {
      
      str.append( ", " );
      str.append( elems[ ( front + offset ) % elems.length ] );
      offset = offset + 1;

  }

     }

     str.append( "]" );

     return str.toString();

 }

}// End of CircularQueue
