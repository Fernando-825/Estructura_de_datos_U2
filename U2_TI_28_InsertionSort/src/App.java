public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        InsertionSort sorter = new InsertionSort();
        int[] array = {5, 2, 3, 1, 5, 4};
        sorter.insertionSort(array);
        
    }
}
