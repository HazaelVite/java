public class ConversionDeTipos {
    public static void main(String[] args) {
//        Convertir de cadenas a primitivos
        String numeroStr = "50";
        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        String realStr = "98765.43e-3";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);

        String logicoStr = "true";
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);


//        Convertir de primitivos a cadenas
        var otroNumeroInt = 100;
        var otroNumeroStr = Integer.toString(otroNumeroInt);
        System.out.println("otroNumeroStr = " + otroNumeroStr);
        // Otra forma
        otroNumeroStr = String.valueOf(otroNumeroInt);
        System.out.println("otroNumeroStr otra forma = " + otroNumeroStr);


//        Convertir de primitivos a primitivos
        int primitivo = 32768;
        short s = (short)primitivo;
        System.out.println("s = " + s);
        long l = (long)primitivo;
        System.out.println("l = " + l);

        

    }
}
