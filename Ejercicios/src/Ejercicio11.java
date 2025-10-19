
import java.util.Scanner;

public class Ejercicio11 {

    // Funciones para las operaciones
    public static double sumar(double a, double b) { return a + b; }
    public static double restar(double a, double b) { return a - b; }
    public static double multiplicar(double a, double b) { return a * b; }
    public static double dividir(double a, double b) { return a / b; }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        double a, b;

        // Menú principal
        do {
            System.out.println(" 1-Sumar  2-Restar  3-Multiplicar  4-Dividir  5-Salir");
            System.out.print("Elige una opción: ");
            opcion = teclado.nextInt();

            // Si la opción es válida, pedimos los dos números
            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Introduce el primer número: ");
                a = teclado.nextDouble();
                System.out.print("Introduce el segundo número: ");
                b = teclado.nextDouble();

                // Llamar a la función correspondiente
                switch (opcion) {
                    case 1 -> System.out.println("Resultado: " + sumar(a, b));
                    case 2 -> System.out.println("Resultado: " + restar(a, b));
                    case 3 -> System.out.println("Resultado: " + multiplicar(a, b));
                    case 4 -> System.out.println("Resultado: " + dividir(a, b));
                }
            }

        } while (opcion != 5); // Salir del Programa

        System.out.println("Fin de la calculadora");
        teclado.close();
    }
}
