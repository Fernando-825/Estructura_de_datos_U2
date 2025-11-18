public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        BubbleSort bs = new BubbleSort();
        int[] array = {11,1,2,3,4,5,6,7,8,9,10};
        bs.sort(array);
    }
}
