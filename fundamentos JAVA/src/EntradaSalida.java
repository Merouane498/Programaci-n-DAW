import java.text.Format;

public class EntradaSalida {
    public static void main(String[] args) {
      //Instrucciones de salida por pantalla
      int valor=7;
      System.out.print(valor); 

      //Usar printf
      double precio=13.354789;
      System.out.printf("El precio del producto %s tiene un valor de %5.2f y se han comprado %d","tablet",precio,valor);
      //Incluir un icono
      System.out.println("Qué ganas tengo de unas vacaciones  \u26F1");

      //Formato reciente de system
      System.out.println("El precio del producto "+"Tablet "+"tiene un valor de "+precio+" y se han comprado"+valor);
      //Formado salida de texto
      System.out.printf("%15s, %-15s","Merouane","Informático");

      //Formato tabla
      System.out.println("|----------|----------|----------|");
      System.out.printf("|%-10s |%-10s |%-10s |", "Producto","Cantidad","Valor");


    




    }
}
