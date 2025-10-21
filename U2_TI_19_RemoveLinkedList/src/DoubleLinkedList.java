public class DoubleLinkedList {

    Node head;
    public void add(int data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode; //Guarda el nuevo nodo
        newNode.prev = current; //En el nunevo nodo, guarda la referencia del anterior
    }
    public void printForward(){
        if (head == null) {
            System.out.println("La lista esta vacia");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println("null");
    }
    public void printBackward(){
         if (head == null) {
            System.out.println("La lista essta vacia");
            return;
        }
         Node current = head;
        while (current.next != null) { 
            current = current.next;
        }
        while (current != null) {
            System.out.println(current.data);
            current = current.prev;
        }
        System.out.println("null");
    }

    public void remove(int data){
        // System.out.println("1.- Verificar si la lista esta vacía.");
        if (head== null) {
            System.out.println("La lista esta vacia");
            return;  
        }
        Node current = head;
        // System.out.println("2.- Buscando el primer nodo que contiene el valor a eliminar: " + data);
        while (current != null && current.data != data) {
            current = current.next;
        }
        if (current == null) {
            // System.out.println("3.- El valor " + data + " NO se encontró en la lista. Saliendo del metodo.");
            return;
        }
        if (current == head) {
            // System.out.println("4.- El nodo a eliminar (" + data + ") ES el head. Se actualiza head al siguiente nodo.");
            head = current.next;
            if (head != null) {
                head.prev = null;
            }
        }
        if (current.prev != null) {
            // System.out.println("5.- El nodo a eliminar NO es el head. El nodo anterior salta al siguiente.");
            current.prev.next = current.next;
        }
        if (current.next != null) {
            // System.out.println("6.- El nodo a eliminar NO es el ultimo. El nodo siguiente apunta su prev hacia el nodo anterior.");
            current.next.prev = current.prev;
        }
    }

}
