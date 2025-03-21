package LAB9.Q2;

public interface Queue<E> {
    void enqueue( E obj );
    E dequeue();
    boolean isEmpty();
    int size();
}
