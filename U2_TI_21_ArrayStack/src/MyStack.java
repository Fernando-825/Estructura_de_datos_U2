public interface MyStack<T> {

    void push(T value);
        T pop();
        T peek();
        boolean isEmpty();
        int size();
        void clear();

        //Vamos a crear un nuevo contrato
        public void printPlaylist();

}
