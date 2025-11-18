public class App {
    public static boolean isPalindrome(String texto) {
        String limpio = "";
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                limpio += Character.toLowerCase(c);
            }
        }
        MyStack<Character> pila = new MyStack<>(limpio.length());
        for (int i = 0; i < limpio.length(); i++) {
            pila.push(limpio.charAt(i));
        }
        for (int i = 0; i < limpio.length(); i++) {
            char desdePila = pila.pop();
            if (desdePila != limpio.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String texto1 = "Anita lava la tina";
        String texto2 = "Hola";

        System.out.println("" + texto1 + " es palindromo -> " + isPalindrome(texto1));
        System.out.println("" + texto2 + " es palindromo -> " + isPalindrome(texto2));
    }
}
