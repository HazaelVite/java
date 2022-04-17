public class PrimitivosFloat {
    public static void main(String[] args) {
//        Se usa 'f' para especificar que la literal es de tipo flotante
        float realFloat = 2120f;
        float exponenteFloat = 3.4028235E38f;
        System.out.println("realFloat = " + realFloat);
        System.out.println("exponenteFloat = " + exponenteFloat);
        System.out.println("Tipo float corresponde en byte a " + Float.BYTES);
        System.out.println("Tipo float corresponde en bites a " + Float.SIZE);
        System.out.println("Valor máximo de un float: "+ Float.MAX_VALUE);
        System.out.println("Valor mínimo de un float: "+ Float.MIN_VALUE);

        double realDouble = 1.7976931348623157E308;
        System.out.println("realDouble = " + realDouble);
        System.out.println("Tipo double corresponde en byte a " + Double.BYTES);
        System.out.println("Tipo double corresponde en bites a " + Double.SIZE);
        System.out.println("Valor máximo de un double: "+ Double.MAX_VALUE);
        System.out.println("Valor mínimo de un double: "+ Double.MIN_VALUE);

        var varFlotante = 3.1416;

    }
}
