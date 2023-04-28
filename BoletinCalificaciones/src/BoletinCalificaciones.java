
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class BoletinCalificaciones
{
    public static void main(String[] args)
    {
        // Main donde se ejecutan todos los metodos
        String datosEsc = datosEscuela();
        String datosAlumno = datosEstudiante();
        String datosBol = datosBoletin();
        imprimeBoletin(datosEsc,datosAlumno,datosBol);
    }
    public static String datosBoletin()
    {
        // Asigna codigos a cada asignatura con su respectiva calificacion
        System.out.println("Codigos de asignatura: Matematicas = 25, Fisica = 43, Quimica = 44, Filosofia = 67, Historia = 88: ");
        ArrayList<LineaBoletin> boletin = new ArrayList<LineaBoletin>();
        float promedio = 0.0f;
        int codigo = 0;
        Asignaturas datosMaterias = null;
        float nota = 0.0f;
        String calificacion = "";
        String calificacionFinal = "";
        for (int i = 0; i < 5; i++) {
            do {
                codigo = Integer.parseInt(introduceDato("Introduce el codigo de asignatura: "));
                switch (codigo) {
                    case 25:
                        datosMaterias = Asignaturas.MATEMATICAS;
                        break;
                    case 43:
                        datosMaterias = Asignaturas.FISICA;
                        break;
                    case 44:
                        datosMaterias = Asignaturas.QUIMICA;
                        break;
                    case 67:
                        datosMaterias = Asignaturas.FILOSOFIA;
                        break;
                    case 88:
                        datosMaterias = Asignaturas.HISTORIA;
                        break;
                    default:
                        System.out.println("Codigo de asignatura invalido, por favor intentelo de nuevo");
                }
            } while (datosMaterias == null);
            nota = Float.parseFloat(introduceDato("Introduce la nota de la asignatura (En formato decimal siendo 0.1 el minimo y 10.0 el maximo) " + datosMaterias.getNombreAsignatura() + ""));
            if (nota >= 10) {
                calificacion = "Matrícula de honor";
            } else if (nota >= 9 && nota < 10) {
                calificacion = "Sobresaliente";
            } else if (nota >= 7 && nota < 9) {
                calificacion = "Notable";
            } else if (nota >= 6 && nota < 7) {
                calificacion = "Bien";
            } else if (nota >= 5.5 && nota < 6) {
                calificacion = "Aprobado";
            } else if (nota >= 5 && nota < 5.5) {
                calificacion = "Aprobado";
            } else if (nota < 5) {
                calificacion = "Suspenso";
            }
            LineaBoletin linea = new LineaBoletin(codigo, datosMaterias.getNombreAsignatura(), nota, calificacion);
            boletin.add(new LineaBoletin(codigo, datosMaterias.getNombreAsignatura(), nota, calificacion));
            promedio += nota / 5;
        }
        StringBuilder sb = new StringBuilder();
        for (LineaBoletin linea : boletin) {
            sb.append(linea.toString()).append("\n");
        }
        if (promedio == 10) {
            calificacionFinal = "Matrícula de honor";
        } else if (promedio >= 9 && nota < 10) {
            calificacionFinal = "Sobresaliente";
        } else if (promedio >= 7 && nota < 9) {
            calificacionFinal = "Notable";
        } else if (promedio >= 6 && nota < 7) {
            calificacionFinal = "Bien";
        } else if (promedio >= 5.5 && nota < 6) {
            calificacionFinal = "Aprobado";
        } else if (promedio >= 5 && nota < 5.5) {
            calificacionFinal = "Aprobado";
        } else if (promedio < 5) {
            calificacionFinal = "Suspenso";
        }
        return sb.toString() + "\t\t\t\t\t" + "Calificacion: " + calificacionFinal + "\n" + "\t\t\t\t\t" + "Promedio: " + promedio;
    }
    // Imprime en consola el boletin
    public static void imprimeBoletin(String escuela, String alumno, String bol)
    {
        System.out.println("\n" + escuela);
        System.out.println(alumno);
        System.out.println("\t\t\t\t\t" + "Salamanca a, " + fechaHoy());
        System.out.println("     BOLETIN DE CALIFICACIONES TRIMESTRAL");
        System.out.println("               CALIFICACIONES             ");
        System.out.println("Cod     Asignatura      Nota    Calificacion");
        System.out.println(bol);

    }
    // Recibe como input los datos sobre la escuela
    public static String datosEscuela()
    {
        Escuela miEscuela = new Escuela();
        return miEscuela.toString();
    }
    // Recibe como input los datos del estudiante
    public static String datosEstudiante()
    {
        System.out.println("Introduce los datos del alumno");
        String nombreCompleto = introduceDato("Introduce nombre completo");
        String direccion = introduceDato("Introduce direccion del alumno");
        String datosContacto = introduceDato("Introduce los datos de contacto del alumno");
        String grupo = introduceDato("Introduce el grupo del alumno");
        Estudiante miEstudiante = new Estudiante(nombreCompleto,direccion,datosContacto,grupo);
        return miEstudiante.toString();
    }
    // Metodo para abstraer la solicitud de datos en consola
    public static String introduceDato(String mensaje)
    {
        Scanner entrada = new Scanner(System.in);
        System.out.print(mensaje + ": ");
        return entrada.nextLine();
    }
    // Define fecha
    public static String fechaHoy(){
        DateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String fecha = formato.format(new Date());
        return fecha;
    }
}
