import java.util.Stack; // Esto es necesario para el método reverse()

public class ArrayQueue<T> implements lQueue<T> {

    private Object[] data;
    private int front;
    private int rear;
    private int size;

    // Constructores
    public ArrayQueue(){
        this(10);
    }

    public ArrayQueue(int tan){
        this.data = new Object[tan];
        this.front=0;
        this.rear=0;
        this.size=0;
    }

    // Método Modificado: offer (Incluye control de capacidad)
    @Override
    public void offer(T element) {
        // Validación de capacidad (Mejora añadida)
        if (size == data.length) {
            System.out.println("Error: Cola llena. No se pudo añadir " + element);
            return; 
        }
        
        this.data[rear]=element;
        this.rear=(rear+1)%data.length;
        size++;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T poll() {
        if(isEmpty()){
            return null;
        }
        T result = (T) data[front];
        data[front]=null;
        front=(front+1)%data.length;
        size--;
        return result;
    }

    // (Otros métodos de lQueue: peek, isEmpty, size... se mantienen igual)
    @SuppressWarnings("unchecked")
    @Override
    public T peek() {
        if(isEmpty()){
            return null;
        }
        return (T) data[front];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public void print() {
        if (isEmpty()) {
            System.out.println("[]");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        // Itera 'size' veces, comenzando desde 'front' y usando el módulo para el bucle circular
        for(int i=0; i < size; i++){
            sb.append(data[(front+i)%data.length]);
            if (i < size - 1) { // Añade coma entre elementos, no al final
                sb.append("");
            }
        }
        sb.append("]");
        System.out.println(sb.toString());
    }


    // MÉTODO REQUERIDO: Invertir el orden de la cola usando una pila (Stack) auxiliar
    @SuppressWarnings("unchecked")
    public void reverse() {
        // Se usa Stack de java.util para este propósito específico, ya que no es parte de la Queue.
        Stack<T> tempStack = new Stack<>();
        
        // 1. Descargar la Queue a la Stack (LIFO)
        // El bucle se detiene cuando la Queue está vacía.
        while (!isEmpty()) {
            tempStack.push(this.poll()); // poll() saca el elemento FIFO y lo mete a la pila LIFO
        }
        
        // 2. Cargar la Stack de vuelta a la Queue (FIFO)
        // El bucle se detiene cuando la Stack está vacía.
        while (!tempStack.isEmpty()) {
            this.offer(tempStack.pop()); // pop() saca el último LIFO y lo mete a la Queue (offer)
        }
        
        // El resultado es la cola original pero en orden invertido.
    }
}
