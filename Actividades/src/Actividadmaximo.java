public class Actividadmaximo {
    // Actividad : El máximo de 3 y 5 números.


    // Máximo de 2 números
    public static int maximo(int numero1, int numero2) {
        if (numero1 >= numero2) return numero1;
        return numero2;
    }

    // Máximo de 3 números usando la anterior
    public static int maximo3(int a, int b, int c) {
        return maximo(maximo(a, b), c);
    }

    // Máximo de 5 números
    public static int maximo5(int a, int b, int c, int d, int e) {
        return maximo(maximo3(a, b, c), maximo(d, e));
    }


    public static void main(String[] args) {
        // Operación
        System.out.println("Máximo de (5, 8): " + maximo(5, 8));
        System.out.println("Máximo de (7, 4, 9): " + maximo3(7, 4, 9));
        System.out.println("Máximo de (3, 12, 9, 5, 10): " + maximo5(3, 12, 9, 5, 10));
    }
}
