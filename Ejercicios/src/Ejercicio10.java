// Ejercicio 10: Cuenta cuántos dígitos pares e impares tiene un número

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Pedir número
        System.out.print("Introduce un número: ");
        int num = teclado.nextInt();

        int pares = 0, impares = 0;

        // Contamos los dígitos
        while (num > 0) {
            int digito = num % 10; 
            if (digito % 2 == 0)
                pares++;
            else
                impares++;
            num /= 10; 
        }

        // Mostrar el resultado
        System.out.println("Pares: " + pares + " | Impares: " + impares);
        teclado.close();
    }
}
