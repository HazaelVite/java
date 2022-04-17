public class HolaMundo {
//    void es tipo de retorno, solo ejecuta algun proceso
    public static void main(String[] args) {
//       Parametros de entrada o input
        System.out.println("Hola Mundo desde Java");

//        Usando variables
        String saludar = "Soy Hazael Vite";
        System.out.println(saludar);
        System.out.println("saludar.toUpperCase() = " + saludar.toUpperCase());
        
//        Tipos de datos primitivos
        int numero = 10;
        // Integer num = 10;
        System.out.println("numero = " + numero);

//        Contexto de una variable
        boolean valor = true;
        if(valor){
            int numeroDos = 10;
            System.out.println("numero dos = " + numeroDos);
        }

//        Nueva forma de crear variables
//        var numeroTres = 15 ---> el valor influye en el tipo de variable
        var numeroTres = "Nueva forma de crear variables";


    }
}
