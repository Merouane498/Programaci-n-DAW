import java.util.Scanner;

public class Ejercicio9 {

    // Función recursiva que calcula Fibonacci
    public static int fibonacci(int n) {
        if (n <= 1) return n;
        else return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Pedir cuántos términos quiere ver el usuario
        System.out.print("Cuántos términos de Fibonacci quieres ver? ");
        int n = teclado.nextInt();

        // Mostrar los valores uno por uno
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        teclado.close();
    }
}
