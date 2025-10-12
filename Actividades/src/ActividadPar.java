public class ActividadPar {
    // Actividad : Funciones esPar, esDivisible3 y muestra pares divisibles por 3.

    // Función que determina si un número es par
    public static boolean esPar(int n) {
        return n % 2 == 0;
    }

    // Función que determina si un número es divisible entre 3
    public static boolean esDivisible3(int n) {
        return n % 3 == 0;
    }

    // Procedimiento que imprime los números pares y divisibles entre 3 entre 1 y 20
    public static void imprimirParesDiv3() {
        System.out.println("Números pares y divisibles entre 3 del 1 al 20:");
        for (int i = 1; i <= 20; i++) {
            if (esPar(i) && esDivisible3(i)) {
                System.out.println(i);
            }
        }
    }

    // Operación
    public static void main(String[] args) {
        imprimirParesDiv3();
    }
}

