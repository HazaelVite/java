public class OperadoresAsignacion {
    public static void main(String[] args) {
        int i = 5;
        int j = i + 4;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        // Operadores combinados u opuestos
        i = i + 2;
        System.out.println("i = " + i);
        // Atajo
        i += 5;
        System.out.println("i = " + i);
        // Resta
        j -= 4;
        System.out.println("j = " + j);

        /* Otros operadores
        * /=
        * *=
        * %=
        * a /= b es equivalente que a = a / b
        * */

    }
}
