public class ArrayQueue<T> implements lQueue<T> {

    private Object[] data; //El arreglo
    private int front; // Primero en la fila
    private int rear; // Como un puntero, pa saber donde ira el siguiente dato
    private int size; // tamaño de la queue


    public ArrayQueue(){
        this(10);
    }

    public ArrayQueue(int tan){
        this.data = new Object[tan];
        this.front=0;
        this.rear=0;
        this.size=0;
    }

    @Override
    public T poll() {
        // 
        if(isEmpty()){
            System.out.println("La queue esta vacia");
            return null;
        }

        T result =  (T) data[front]; //Elemento a retirar
        data[front]=null; //Limipiamos elemento en la posicionde front
        front=(front+1)%data.length; //Calculamos el nuevo frente
        size--; //reducimos el tamaño de lam queue
        return result;
    }

    @Override
    public void offer(T element) {
        // Validar si el areglo esta limpio, lo vamos a incrementar
        this.data[rear]=element; //agregar un nuevo elemento en rear (position)
        this.rear=(rear+1)%data.length; // Calculo de rear, si llega al final se reinicia a 0
        size++;
    }

    @Override
    public T peek() {
        //
        if(isEmpty()){
            System.out.println("La queue esta vacia");
            return null;
        }
        return (T) data[front];
    }

    @Override
    public void print() {
        // 
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i=0; i < size; i++){
            sb.append(data[(front+i)%data.length]);
            sb.append("->");
        }
        sb.append("]");
        System.out.println(sb.toString());
    }

    @Override
    public boolean isEmpty() {
        // 
        return size == 0;
    }

    @Override
    public int size() {
        // 
        return this.size;
    }

}
