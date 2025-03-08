package LAB7.Ex1;

public class ArrayStack<E> implements Stack<E> {

    // Instance variables
    private E[] items;  // Used to store the elements of this ArrayStack
    private int top;    // Designates the first free cell

    @SuppressWarnings( "unchecked" )

    // Constructor
    public ArrayStack( int size ) {
        items = (E[]) new Object[size];
        top = 0;
    }

    // Returns true if this ArrayStack is empty
    public boolean isEmpty() {
        return top == 0;
    }

    // Returns the top element of this ArrayStack without removing it
    public E peek() {
        // pre-conditions: ! isEmpty()
        return items[top-1];
    }

    // Removes and returns the top element of this stack
    public E pop() {
        // pre-conditions: ! isEmpty()  
        return items[--top];
    }

    // Puts the element onto the top of this stack.
    public void push( E item ) {
        // Pre-condition: the stack is not full
        items[top++] = item;
    }

    public void clear() {
        top = 0;
    }

}
