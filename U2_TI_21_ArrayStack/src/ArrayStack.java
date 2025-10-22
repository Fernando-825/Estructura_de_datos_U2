import java.lang.reflect.Array;
import java.nio.channels.Pipe.SourceChannel;
import java.util.Arrays;

public class ArrayStack<T> implements MyStack<T> {

    private Object[] data;
    private int top; //Nos ayudara a saber cual es el puntero y donde poner los datos y para saber el tamaño del arreglo

    public ArrayStack(){ //Contructor 1, este invoca al 2
        this(10);
    }
    public ArrayStack(int initialCapacity){ //
        this.data = new Object[initialCapacity];
    }

    @Override
    public void push(T value) {
        //Top vale 0
        this.data[top++]=value;
        //top vale top+1
    }

    @SuppressWarnings("unchecked") //Esto es para que le digamos que ignore advertencias de errores en T value = (T) data[--top];
    @Override
    public T pop() {
        if(isEmpty()){
            System.out.println("No hay elementos en la stack");
            return null;
        }

        T value = (T) data[--top]; //Hace casting. T es un generico y data es un objeto. Obteniendo el ultimo elenmtto
        data[top]=null;
        return null;
    }

    @Override
    public T peek() {
        if(isEmpty()){
            System.out.println("La pila esta vacia, no puedes obtener ningun elemento");
            return null;
        }
        return (T) data[top];
    }

    @Override
    public boolean isEmpty() {
        return top == 0;
    }

    @Override
    public int size() {
        
        return top;
    }

    @Override
    public void clear() {
    // Recorremos solo los elementos que contienen datos (desde 0 hasta top - 1) y los ponemos en null
    for (int i = 0; i < top; i++) {
        data[i] = null;
    }
    // Reiniciamos el puntero "top" a 0 porque este indicara de nuevo a la posicion inicial
    top = 0;
    }

    //Este nosotros los agregamos, este metodo nos ayudara sa saber cual es el espacio de nuestro arreglo

    public void addCpacity(){
        if(top == data.length){
            //Aqui significa que si el arreglo esta lleno vamos a aumentar la capacidad
            int newCap = data.length*2;
            //vamos a crear un nuevo arreglo y pasarle los datos del anterior al nuevo
            data = Arrays.copyOf(data, newCap);
        }
    }

    public void printPlaylist(){
        System.out.println("Impriendo arreglo: ");

        for(int i=data.length-1; i>=0; i--){
//            if((T) data[i] == null){
//            }
//            else{
            System.out.println((T) data[i]);
//            }
        }
    }

}
