import java.util.Arrays;
public class InsertionSort {
    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i]; //Element to be inserted
            int j = i - 1;

            // Move elements of array[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && array[j] > key) { //recorrer la parte ordenada e insertar key en su posicion
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key; //insercion del elmento key dentro de la posicion indicada de la parte ordenada
        }
        System.out.println("Arreglo ordenado:");
        System.out.println(Arrays.toString(array));
    }

}
