import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num, pos = 0, neg = 0;

        // Pedir números hasta poner 0
        do {
            System.out.print("Introduce un número (0 para salir): ");
            num = teclado.nextInt();

            if (num > 0)
                pos++; // si es positivo, sumamos 1
            else if (num < 0)
                neg++; // si es negativo, sumamos 1

        } while (num != 0); // cuando escribe 0, se para

        // Mostrar los resultados
        System.out.println("Positivos: " + pos + " | Negativos: " + neg);
        teclado.close();
    }
}

