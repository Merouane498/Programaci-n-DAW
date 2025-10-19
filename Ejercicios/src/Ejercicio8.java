import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Pedir cuántos términos quiere ver el usuario
        System.out.print("Cuántos términos de Fibonacci quieres ver? ");
        int n = teclado.nextInt();

        int a = 0, b = 1; // los dos primeros números de la serie
        System.out.print("Serie: " + a + " " + b);

        // Calcular los siguientes términos
        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }

        teclado.close();
    }
}
