import java.util.Scanner;

public class Matrices {
    public static void main(String[] args) {
        
        //Vamos a solicitar filas y columnas
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduzca filas: ");
        int filas=teclado.nextInt();
        System.out.println("Introduzca columnas");
        int columnas =teclado.nextInt();

        //Generar la matriz dinámica
        int[][] matriz=new int[filas][columnas];

        for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){
                matriz[i][j]=(int)(Math.random()*100)+1;
            }

        }
        //Imprimir la matriz
        imprimeMatriz(matriz);

        //Suma elementos de cada fila
        int[] resultadoFila = new int[filas];
        int[] resultadoColumna= new int[columnas];

        //Recorrer por filas
        for(int i=0;i<filas;i++){
            int total=0;
            for(int j=0;j<columnas;j++){
                total=total+matriz[i][j];
            }
            resultadoFila[i]=total;

        }
        //Mostrar las sumas
        System.out.println("SUmas por columnas");
        for(int i=0;i<filas;i++){
            System.out.println(resultadoColumna);
        }

    }
    
}
