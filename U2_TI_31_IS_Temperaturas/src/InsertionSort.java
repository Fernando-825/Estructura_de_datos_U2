import java.util.Arrays;
public class InsertionSort {
    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i]; //Element a insertar
            int j = i - 1;

            // Mueve los elementos de array que sean mayores que key,
            // a una posicion adelante de su posicion actual
            while (j >= 0 && array[j] > key) { //recorrer la parte ordenada e insertar key en su posicion
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key; //insercion del elmento key dentro de la posicion indicada de la parte ordenada
        }
        System.out.println("Arreglo ordenado:");
        System.out.println(Arrays.toString(array));

        System.out.println("Temperatura mas baja: " + array[0]);
        System.out.println("Temperatura mas alta: " + array[n - 1]);
        System.out.println("Rango de temperaturas: " + (array[n - 1] - array[0]));
        
        if(array.length > 5){
            System.out.println("Las tres temperaturas mas bajas son:");
            for(int k = 0; k < 3; k++){
                System.out.println("Temperatura No. " + (k+1) + ": " + array[k]);
            }
            System.out.println("Las tres temperaturas mas altas son:");
            for(int k = n - 3; k < n; k++){
                System.out.println("Temperatura No. " + (k+1) + ": " + array[k]);
            }
        }
        else{
            System.out.println("Imposible mostrar las tres temperaturas mas altas y bajas");
        }

    }

}

