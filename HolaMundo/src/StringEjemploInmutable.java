public class StringEjemploInmutable {
    public static void main(String[] args) {
        // El String es inmutable, no se modifica el string original
        // Cuando cambiamos el valor creamos otro objeto
        String curso = "Programacion Java";
        String profesor = "Andres Guzman";

        String resultado = curso.concat(profesor);
        System.out.println("resultado = " + resultado);

        // Funcion de flecha o funcion anonima
        String resultado2 = curso.transform(c -> {
            return c + " con " + profesor;
        });
        System.out.println("resultado2 = " + resultado2);

        String resultado3 = resultado.replace("a", "A");
        System.out.println("resultado3 = " + resultado3);

    }
}
