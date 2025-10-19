
    import java.util.Scanner;
public class ActividadArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Definir el array
        int[] numeros = {5, 8, 12, 20, 25, 30};

        // Pedir el número a buscar
        System.out.print("Introduce el número a buscar: ");
        int buscado = sc.nextInt();

        // Llamar a la función
        int posicion = buscarNumero(numeros, buscado);

        // Mostrar el resultado
        if (posicion != -1) {
            System.out.println("El número " + buscado + " está en la posición " + posicion);
        } else {
            System.out.println("El número " + buscado + " no se encuentra en el array.");
        }

        sc.close();
    }

    // Función que busca un número en un array y devuelve su posición
    public static int buscarNumero(int[] array, int numero) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numero) {
                return i; // devuelve la posición
            }
        }
        return -1; // devuelve -1 si no lo encuentra
    }
}

    

