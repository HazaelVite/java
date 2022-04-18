public class StringEjemplo {
    public static void main(String[] args) {
        String curso = "Programacion Java";
        String curso2 = new String("Programacion Java");
        // Son dos instancias distintas, se crean de forma distinta a pesar de tener el mismo valor.
        boolean esIgual = curso == curso2;
        System.out.println("esIgual = " + esIgual);
        // Para comparar el valor de los strings
        esIgual = curso.equalsIgnoreCase(curso2);
        System.out.println("esIgual = " + esIgual);

    }
}
