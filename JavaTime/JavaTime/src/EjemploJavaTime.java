import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class EjemploJavaTime {
    public static void main(String[] args) {
        // Fecha
        LocalDate objetoFecha = LocalDate.now();
        System.out.println("objetoFecha = " + objetoFecha);

        // Formato de fecha dd/MM/yyyy
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("objetoFecha = " + objetoFecha.format(formatoFecha));
        
        // Hora
        LocalTime objetoHora = LocalTime.now();
        System.out.println("objetoHora = " + objetoHora);

        // Alternativo pero poco flexible
        System.out.printf("La hora actual es %s y no otra\n",objetoHora.toString().substring(0,8));
        System.out.printf("La hora actual es %.8s y no otra\n",objetoHora);

        // Formato hh:mm:ss
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("hh:mm:ss a");
        System.out.println("objetoHora = " + objetoHora.format(formatoHora));
        
        // Fecha y hora 
        LocalDateTime objetoFechaHora = LocalDateTime.now();
        System.out.println("objetoFechaHora = " + objetoFechaHora);
        DateTimeFormatter formatoFechaHora = DateTimeFormatter.ofPattern("dd/MM/yy hh:mm:ss a G");
        System.out.println("objetoFechaHora = " + objetoFechaHora.format(formatoFechaHora));

        // Establecer Fecha y Hora
        objetoFechaHora = LocalDateTime.of(2022,5,15,10,30,15);
        System.out.println("objetoFechaHora = " + objetoFechaHora.format(formatoFechaHora));

        objetoFechaHora = LocalDateTime.of(2022, Month.MAY,15,18,23,02);
        System.out.println("objetoFechaHora = " + objetoFechaHora.format(formatoFechaHora));

        objetoFecha.
    }
}
