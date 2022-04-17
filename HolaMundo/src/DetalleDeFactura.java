import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Reciba el nombre de la factura o descripción, utilizar método nextLine() para obtener el nombre de la factura con espacios.
        System.out.println("Ingrese el nombre de la factura: ");
        String nombre = scanner.nextLine();

        // Reciba 2 precios de productos de tipo double, utilizar método nextDouble() para obtener precios con decimales (,).
        double producto1 = 0, producto2 = 0;

        try {
            System.out.println("Ingrese el precio del producto 1 (Con decimales)");
            producto1 = scanner.nextDouble();
            System.out.println("Ingrese el precio del producto 2 (Con decimales)");
            producto2 = scanner.nextDouble();

        } catch (Exception e) {
            System.out.println("Error al ingresar nombre de factura, intentelo de nuevo!");
            main(args);
            System.exit(0);
        }

        // Calcule el total, sume ambos precios y agregue un valor de impuesto del 19%
        double totalBruto = 0, impuesto = 0, totalNeto = 0;
        double tax = 0.19, taxFinal = 1.19;
        try {
            totalBruto = producto1 + producto2;
            impuesto = totalBruto * tax;
            totalNeto = totalBruto * taxFinal;
        } catch (Exception e) {
            System.out.println("Error al realizar las operaciones :(");
            main(args);
            System.exit(0);
        }

        System.out.println("La factura " + nombre + " tiene un total bruto de: $" + totalBruto + ", con un impuesto de $" + impuesto + " y el monto despues de impuesto es de $" + totalNeto);
    }
}
