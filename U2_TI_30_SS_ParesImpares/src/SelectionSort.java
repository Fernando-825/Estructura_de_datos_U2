import java.util.Arrays;
public class SelectionSort {

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        System.out.println("Array ordenado:");
        System.out.println(Arrays.toString(arr));

        //Contar pares e impares
        int pares=0;
        int impares=0;

        for(int i=0; i<n; i++){
            if(arr[i]%2==0){
                pares++;
            }else{
                impares++;
            }
        }

        //Creamos los arreglos con el tamaño adecuado
        int[] arrB = new int[pares];
        int[] arrC = new int[impares];

        // NUEVO: Contadores de índices para llenar los nuevos arreglos.
        // Son variables independientes que rastrean la posición libre.
        int indexPares = 0;
        int indexImpares = 0;

        // 3. Llenar los arreglos de pares e impares (LÓGICA CORREGIDA)
        // Usamos UN SOLO bucle 'j' para recorrer el arreglo fuente 'arr'.
        for (int j = 0; j < n; j++) {
            
            int elemento = arr[j];
            
            if (elemento % 2 == 0) {
                // Si es par, lo ponemos en el arreglo de pares usando su índice,
                // e incrementamos ese índice para la próxima vez.
                arrB[indexPares] = elemento;
                indexPares++;
            } else {
                // Si es impar, lo ponemos en el arreglo de impares usando su índice,
                // e incrementamos ese índice para la próxima vez.
                arrC[indexImpares] = elemento;
                indexImpares++;
            }
        }


        ascSort(arrB);
        ascSort(arrC);
        System.out.println("Arreglo de pares:");
        System.out.println(Arrays.toString(arrB));
        System.out.println("Arreglo de impares:");
        System.out.println(Arrays.toString(arrC));


    }


        public static void ascSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        }

}
