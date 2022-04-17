public class PrimitivosCaracteres {
    public static void main(String[] args) {
//        Tipo char solo permite UN SOLO caracter de la A-Z a-z 0-9 (Unicode)
        char caracter = 'H';
        System.out.println("caracter = " + caracter);
        System.out.println("Tipo char corresponde en byte a " + Character.BYTES);
        System.out.println("Tipo char corresponde en bites a " + Character.SIZE);
        System.out.println("Valor máximo de un char: "+ Character.MAX_VALUE);
        System.out.println("Valor mínimo de un char: "+ Character.MIN_VALUE);

        char espacio = '\u0020'; // Espacio en Unicode
        char retroceso = '\b';
        char tabulador = '\t';
        char nuevaLinea = '\n';
        char saltoCarro = '\r';
        System.out.println("Estamos representando" + espacio + "un espacio");
        System.out.println("Aqui va el caracter de retroceso que quita la letra H" + retroceso);
        System.out.println("Aqui representamos el " + tabulador + "tabulador");
        System.out.println("Aqui representamos" + nuevaLinea + "un salto de linea");
        System.out.println("Aqui representamos" + saltoCarro + "un salto de carro, se ve igual en Windows");



    }
}
