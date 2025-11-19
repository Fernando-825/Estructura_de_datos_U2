import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner leer = new Scanner(System.in);
        SelectionSort ss = new SelectionSort();

        //Usuario declara arreglo de N elementos
        System.out.println("Ingresa el tamaño del arreglo:");
        int tamanio = leer.nextInt();
        int[] arrA = new int[tamanio];
        for (int i = 0; i < tamanio; i++) {
            System.out.println("Ingresa el elemento " + (i+1) + ":");
            arrA[i] = leer.nextInt();
        }

        ss.selectionSort(arrA);

    }
}
