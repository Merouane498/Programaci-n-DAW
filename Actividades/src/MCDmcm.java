import java.util.Scanner;

public class MCDmcm {
    // Actividad : Calcula el MCD y el MCM de dos números.

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el primer número : ");
        int a = teclado.nextInt();
        System.out.print("Introduce el segundo número : ");
        int b = teclado.nextInt();

        // Llamar al procedimiento
        CalcularMCDyMostrar(a, b);
        CalcularMCMyMostrar(a, b);

    }

    // Procedimiento  que calcula el MCD
    public static void CalcularMCDyMostrar(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) {
            int resto = a % b;
            a = b;
            b = resto;
        }

        System.out.println("El MCD es: " + a);
    }

    // Procedimiento que calcula el MCM
    public static void CalcularMCMyMostrar(int a, int b) {
        int originalA = Math.abs(a);
        int originalB = Math.abs(b);

        // Reutilizamos el algoritmo de Euclides para obtener el MCD
        int x = originalA;
        int y = originalB;
        while (y != 0) {
            int resto = x % y;
            x = y;
            y = resto;
        }
        int mcd = x;

        // Calcular MCM 
        int mcm = (originalA * originalB) / mcd;

        System.out.println("El MCM es: " + mcm);
    }
}




    
   
