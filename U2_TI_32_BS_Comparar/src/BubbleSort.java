import java.util.Arrays;
public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped by inner loop, then break
            if (!swapped) break;
        }
        System.out.println(Arrays.toString(arr));

        System.out.println("Primer elemento: " + arr[0]);
        System.out.println("Ultimo elemento: " + arr[n - 1]);
        System.out.println("Diferencia entre el primer y ultimo elemento: " + (arr[n - 1] - arr[0]));

    }

}
