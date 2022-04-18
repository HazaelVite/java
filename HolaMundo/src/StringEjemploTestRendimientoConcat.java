public class StringEjemploTestRendimientoConcat {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = a;
        // Mas optimizado para concatenar gran cantidad de strings
        StringBuilder sb = new StringBuilder(a);

        long inicio = System.currentTimeMillis();

        for (int i = 0; i < 1000; i++) {
            // c = c.concat(a).concat(b).concat("\n"); // 500 => 2 ms, 1000 => 5 ms
            // c += a + b + "\n"; // 500 => 10 ms, 1000 => 12 ms
            sb.append(a).append(b).append("\n"); // 500 => 0 ms, 1000 => 0 ms
        }

        long fin = System.currentTimeMillis();
        System.out.println(fin - inicio);
        //System.out.println("c = " + c);
        //System.out.println("sb = " + sb.toString());


    }
}
