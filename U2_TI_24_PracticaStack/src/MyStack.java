public class MyStack<T> {
        private Object[] datos;
        private int tope;
        private int capacidad;
    
        public MyStack(int capacidad) {
            this.capacidad = capacidad;
            datos = new Object[capacidad];
            tope = -1;
        }
        public void push(T elemento) {
            if (tope == capacidad - 1) {
                throw new RuntimeException("La pila esta llena");
            }
            datos[++tope] = elemento;
        }
        @SuppressWarnings("unchecked")
        public T pop() {
            if (estaVacia()) {
                throw new RuntimeException("La pila esta vacia");
            }
            return (T) datos[tope--];
        }
        public boolean estaVacia() {
            return tope == -1;
        }
}