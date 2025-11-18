public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        SelectionSort ss = new SelectionSort();
        int[] arr = {64, 25, 12, 22, 11};
        ss.selectionSort(arr);

    }
}
