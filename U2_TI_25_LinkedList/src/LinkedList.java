public class LinkedList {
    private Node head;

    public LinkedList() {
        head = null;
    }
    public void agregar(int data) {
        Node nuevo = new Node(data);
        if (head == null) {
            head = nuevo;
        } else {
            Node actual = head;
            while (actual.next != null) {
                actual = actual.next;
            }
            actual.next = nuevo;
        }
    }
    public void dividirParesImpares(LinkedList listaPares, LinkedList listaImpares) {
        Node actual = head;

        while (actual != null) {
            if (actual.data % 2 == 0) {
                listaPares.agregar(actual.data);
            } else {
                listaImpares.agregar(actual.data);
            }
            actual = actual.next;
        }
    }
    public void imprimir() {
        Node actual = head;
        while (actual != null) {
            System.out.print(actual.data + " -> ");
            actual = actual.next;
        }
        System.out.println("null");
    }
}