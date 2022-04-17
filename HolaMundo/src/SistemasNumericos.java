import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {
        int numeroDecimal = 500;
        System.out.println("numeroDecimal = " + numeroDecimal);

        System.out.println("Numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));

        int numeroBinario = 0b111110100;
        System.out.println("numeroBinario = " + numeroBinario);

        System.out.println("Numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal));
        int numeroOctal = 0764;
        System.out.println("numeroOctal = " + numeroOctal);

        System.out.println("Numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal));
        int numeroHexadecimal = 0x1f4;
        System.out.println("numeroHexadecimal = " + numeroHexadecimal);

//        Entrada de datos desde ventana de dialogo
        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un número entero");

        try {
            int numeroDec = Integer.parseInt(numeroStr);
            // Armamos el string
            String resBinario = "Numero binario de " + numeroDec + " = " + Integer.toBinaryString(numeroDec);
            String resOctal = "Numero octal de " + numeroDec + " = " + Integer.toOctalString(numeroDec);
            String resHexa = "Numero hexadecimal de " + numeroDec + " = " + Integer.toHexString(numeroDec);
            String mensaje =  resBinario + "\n" + resOctal + "\n" + resHexa;
            // Salida de datos desde ventana de dialogo
            JOptionPane.showMessageDialog(null, mensaje);
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un número entero");
            main(args);
            System.exit(0);
        }


    }
}
