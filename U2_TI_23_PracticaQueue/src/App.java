public class App {
    public static void main(String[] args) throws Exception {

        // 2. Crea una ArrayQueue<Customer> y agrega varios clientes (5–6)
        ArrayQueue<Customer> customerQueue = new ArrayQueue<>();

        customerQueue.offer(new Customer(1, "Ana"));
        customerQueue.offer(new Customer(2, "Luis"));
        customerQueue.offer(new Customer(3, "Maya"));
        customerQueue.offer(new Customer(4, "Carlos"));
        customerQueue.offer(new Customer(5, "Sofía"));

        // 3. Imprime la Queue antes de invertir
        System.out.println("Antes de invertir:");
        System.out.print("Elementos antes = " + customerQueue.size() + "\n");
        customerQueue.print(); // Output: [Customer{id=1,...}, Customer{id=2,...}, ...]
        System.out.println("\n------------------------------------------------");

        // Guarda el tamaño original para la validación final (Punto 5)
        int sizeBefore = customerQueue.size();

        // 4. Invierte la Queue
        customerQueue.reverse();

        // 5. Imprime la Queue demostrando que tiene el mismo numero de elementos.
        System.out.println("Después de invertir:");
        System.out.print("Elementos después = " + customerQueue.size() + "\n");
        customerQueue.print(); // Output: [Customer{id=5,...}, Customer{id=4,...}, ...]
        
        System.out.println("\nValidación de tamaños:");
        System.out.println("Elementos antes = " + sizeBefore + ", elementos después = " + customerQueue.size());
    }
}