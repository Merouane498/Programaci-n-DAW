import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Pedir los datos
        System.out.print("1 - Programador junior\n2 - Programador senior\n3 - Jefe de proyecto\nElige tu cargo: ");
        int cargo = teclado.nextInt();

        System.out.print("Cuántos días has viajado por trabajo? ");
        int dias = teclado.nextInt();

        System.out.print("Estado civil (1-Soltero / 2-Casado): ");
        int civil = teclado.nextInt();

        // El sueldo base según el cargo
        double sueldoBase = 0;
        if (cargo == 1) sueldoBase = 950;
        else if (cargo == 2) sueldoBase = 1200;
        else if (cargo == 3) sueldoBase = 1600;

        // Calculamos dietas y retención
        double dietas = dias * 30;
        double sueldoBruto = sueldoBase + dietas;
        double irpf = (civil == 1) ? 25 : 20; // 25% si es soltero, 20% si casado
        double retencion = sueldoBruto * irpf / 100;
        double sueldoNeto = sueldoBruto - retencion;

        // Mostramos los resultados
        System.out.println("\n--- Nómina ---");
        System.out.println("Sueldo base: " + sueldoBase + " euros");
        System.out.println("Dietas (" + dias + " días): " + dietas + " euros");
        System.out.println("Sueldo bruto: " + sueldoBruto + " euros");
        System.out.println("Retención IRPF (" + irpf + "%): " + retencion + " euros");
        System.out.println("Sueldo neto: " + sueldoNeto + " euros");

        teclado.close();
    }
}
