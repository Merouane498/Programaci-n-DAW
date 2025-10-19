import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Pedimos las notas de los dos controles
        System.out.print("Nota del primer control: ");
        double n1 = teclado.nextDouble();

        System.out.print("Nota del segundo control: ");
        double n2 = teclado.nextDouble();

        double media = (n1 + n2) / 2;

        // Si la media es mayor o igual a 5, el alumno está aprobado
        if (media >= 5) {
            System.out.println("Tu nota media es " + media + " = Aprobado");
        } else {
            // Si la media es menos que 5, pedimos la recuperación
            System.out.print("Resultado de la recuperación (apto/no apto) ");
            String rec = teclado.next().toLowerCase();

            if (rec.equals("apto")) {
                System.out.println("Nota final: 5 (aprobado por recuperación)");
            } else {
                System.out.println("Nota final: " + media + " = Suspenso");
            }
        }

        teclado.close();
    }
}
