public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        DoubleLinkedList doubleList = new DoubleLinkedList();

        System.out.println("\n 1. Imprimiendo lista VACÍA (printForward):");
        doubleList.printForward();
        doubleList.add(1);
        doubleList.add(2);
        doubleList.add(3);
        doubleList.add(5);

        System.out.println("--------------------");
        System.out.println("\n 2. Imprimiendo lista ANTES de eliminar (printForward):");        
        doubleList.printForward();
        
        System.out.println("--------------------");
        System.out.println("\n 3. Imprimiendo lista ANTES de eliminar (printBackward):");
        doubleList.printBackward();

        System.out.println("--------------------");
        System.out.println("\n 4. Eliminar el valor: 1");
        doubleList.remove(1);

        System.out.println("--------------------");
        System.out.println("\n 5. Imprimiendo lista DESPUÉS de eliminar (printForward):");
        doubleList.printForward();

        System.out.println("--------------------");
        System.out.println("\n 6. Imprimiendo lista DESPUÉS de eliminar (printBackward):");
        doubleList.printBackward();
            
            
    }
}
