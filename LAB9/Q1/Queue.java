package LAB9.Q1;

public interface Queue<E> {
    void enqueue( E obj );
    E dequeue();
    boolean isEmpty();
    int size();
}
