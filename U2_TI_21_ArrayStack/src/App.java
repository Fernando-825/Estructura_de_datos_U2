public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        ArrayStack<Integer> myStack = new ArrayStack<>();

        //Agregando elementos
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);

        System.out.println("Antes de eliminar 4");
        myStack.printPlaylist();

        System.out.println("Despues de eliminar 4");
        myStack.pop();
        myStack.printPlaylist();

        System.out.println("Usando metodo clear() ponemos en null todos los elementos del array");
        myStack.clear();
        myStack.printPlaylist();
    }
}
