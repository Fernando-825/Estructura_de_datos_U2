import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner scanner = new Scanner(System.in);
        BubbleSort sorter = new BubbleSort();

        System.out.println("Ingresa el espacio del arreglo");
        int size = scanner.nextInt();
        int[] array = new int[size];
        int n = array.length;


        for (int i = 0; i < n; i++) {
            System.out.println("Ingresa elemento (numero) " + (i+1) + ":");
            array[i] = scanner.nextInt();
        }

        System.out.println("Arreglo original:");
        for(int num : array){
            System.out.print(num + " ");
        }

        System.out.println("\nArreglo ordenado:");
        sorter.bubbleSort(array);

    }
}

