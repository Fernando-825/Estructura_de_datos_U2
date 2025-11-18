import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner scanner = new Scanner(System.in);
        BubbleSort sorter = new BubbleSort();
        int[] array = new int[5];
        int n = array.length;
        System.out.println("--- Ingresar 5 calificaciones al arreglo desordenadas ---");

        for (int i = 0; i < n; i++) {
            System.out.println("Ingresa calificacion " + (i + 1) + ":");
            array[i] = scanner.nextInt();
        }
        System.out.println("--- Arreglo ordenando calificaciones: ---");
        sorter.bubbleSort(array);

    }
}
