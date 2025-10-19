
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Pedimos las horas trabajadas de un trabajador
        System.out.print("Introduce las horas trabajadas esta semana: ");
        int horas = teclado.nextInt();

        int salario;

        // Si trabaja 40 horas o menos se pagan a 12 euros la hora
        if (horas <= 40) {
            salario = horas * 12;
        } 
        // Si trabaja más de 40 las horas extras se pagan a 16 euros la hora
        else {
            int horasExtra = horas - 40;
            salario = (40 * 12) + (horasExtra * 16);
        }

        // Calcular el salario total
        System.out.println("Tu salario semanal es: " + salario + " euros");

    }
}
