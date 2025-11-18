public class App {
    public static void main(String[] args) throws Exception {
    LinkedList listaOriginal = new LinkedList();
        listaOriginal.agregar(1);
        listaOriginal.agregar(2);
        listaOriginal.agregar(3);
        listaOriginal.agregar(4);
        listaOriginal.agregar(5);

        LinkedList listaPares = new LinkedList();
        LinkedList listaImpares = new LinkedList();

        listaOriginal.dividirParesImpares(listaPares, listaImpares);
        System.out.println("Lista original:");
        listaOriginal.imprimir();
        System.out.println("Lista de pares:");
        listaPares.imprimir();
        System.out.println("Lista de impares:");
        listaImpares.imprimir();
    }
}