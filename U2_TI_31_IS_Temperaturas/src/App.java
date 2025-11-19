public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        InsertionSort sorter = new InsertionSort();
        int[] array = {5, 2, 3, 1, 5, 4};

        System.out.println("Arreglo original:");
        System.out.print("[ ");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println("]");

        sorter.insertionSort(array);
        
    }
}

