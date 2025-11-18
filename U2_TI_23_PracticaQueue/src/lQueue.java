public interface lQueue<T> {
    T poll();
    void offer(T data);
    T peek();
    void print();
    boolean isEmpty();
    int size();
    // No se añade reverse() a la interfaz ya que es una operación de utilidad, no fundamental para la Queue.
}
