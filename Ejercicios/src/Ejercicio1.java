
import java.time.LocalDateTime;

public class Ejercicio1{
    public static void main(String[] args) {

        //Uso de horas en JAVA
        LocalDateTime ahora = LocalDateTime.now();
        int hora = ahora.getHour(); //Cogemos la hora (de 00.00 a 23.00)

        // Mostrar el saludo(Buenos días,Buenas tardes,Buenas noches) según la hora
        if (hora >= 6 && hora <= 12) {
            System.out.println("Buenos días");
        } else if (hora >= 13 && hora <= 20) {
            System.out.println("Buenas tardes");
        } else {
            System.out.println("Buenas noches");
        }

        // Mostrar la hora actual 
         System.out.println("Hora actual: " + ahora.getHour() + ":" + ahora.getMinute() );
 
    }
}

