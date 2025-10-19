import java.util.Scanner;

public class Ejercicio12 {

    // Calcular el MCD 
    public static int mcd(int a, int b) {
        while (b != 0) {
            int resto = a % b;
            a = b;
            b = resto;
        }
        return a;
    }

    // Calcular el MCM usando el MCD
    public static int mcm(int a, int b) {
        return (a * b) / mcd(a, b);
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Pedir los dos números
        System.out.print("Introduce el primer número: ");
        int a = teclado.nextInt();
        System.out.print("Introduce el segundo número: ");
        int b = teclado.nextInt();

        // Mostrar el resultado
        System.out.println("El MCM es: " + mcm(a, b));
        teclado.close();
    }
}
