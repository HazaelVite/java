public class OperadoresIncrementables {
    public static void main(String[] args) {
        int i = 1;
        // Pre incremento
        int j = ++i;    // i = i + 1
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        
        // Post incremento
        i = 2;
        j = i++;    // i va a valer 3 y j se queda en 2
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // Pre decremento
        i = 3;
        j = --i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // Post decremento
        i = 4;
        j = i--;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
    }

}
