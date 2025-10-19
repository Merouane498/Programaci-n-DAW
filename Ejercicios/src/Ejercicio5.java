import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;

        // las días de la semana se repiten hasta que el usuario elige salir
        do {
            System.out.println(" 1-Lunes  2-Martes  3-Miércoles  4-Jueves  5-Viernes  6-horario completo  7-cerrar");
            System.out.print("Elige una opción: ");
            opcion = teclado.nextInt();

            // Mostrar las asignaturas del día elegido
            switch (opcion) {
                case 1 -> System.out.println("Lunes: IPE, SI, BDD, Prog");
                case 2 -> System.out.println("Martes: LMSGI, SI, Prog, EDD");
                case 3 -> System.out.println("Miércoles: BDD, SI, Prog");
                case 4 -> System.out.println("Jueves: Prog, EDD, IPE, BDD, Sosten");
                case 5 -> System.out.println("Viernes: BDD, Digita, LMSGI, IPE, Prog");
                case 6 -> System.out.println("Toda la semana: todas las asignaturas");
                case 7 -> System.out.println("Cerrar el programa...");
                default -> System.out.println("Opción no válida");
            }
        } while (opcion != 7);

        teclado.close();
    }
}

