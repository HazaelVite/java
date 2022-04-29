public class StringEjemploExtensionArchivo {
    public static void main(String[] args) {
        String archivo = "algun_archivo.pdf";
        int i = archivo.indexOf(".");
        System.out.println("archivo.length() = " + archivo.length());
        System.out.println("archivo = " + archivo.substring(i + 1));

    }
}
