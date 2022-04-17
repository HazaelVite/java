// Clase scanner para usar datos desde la terminal
import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosEntradaScanner {
    public static void main(String[] args) {
        // Clase scanner para usar datos desde la terminal
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el numero, desde terminal
        System.out.println("Ingrese un numero entero");
        // String numeroStr = scanner.nextLine();
        int numeroDec = 0;
        try {
            // Convertir el String en Int
            // numeroDec = Integer.parseInt(numeroStr);
            numeroDec = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Error! Debe ingresar un numero entero");
            main(args);
            System.exit(0);
        }
        System.out.println("Numero Decimal = " + numeroDec);
        // Armamos el string
        String resBinario = "Numero binario de " + numeroDec + " = " + Integer.toBinaryString(numeroDec);
        String resOctal = "Numero octal de " + numeroDec + " = " + Integer.toOctalString(numeroDec);
        String resHexa = "Numero hexadecimal de " + numeroDec + " = " + Integer.toHexString(numeroDec);
        String mensaje =  resBinario + "\n" + resOctal + "\n" + resHexa;
        // Salida en consola
        System.out.println(mensaje);

    }
}
