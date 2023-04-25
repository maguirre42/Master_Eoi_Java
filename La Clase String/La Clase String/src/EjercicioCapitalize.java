import java.util.Locale;

public class EjercicioCapitalize {
    public static void main(String[] args) {
        // 1 - Definir variables, nombre, apellido1 y apellido2
        // 2 - COnvertir cada una en nombre propio
        // 3 - Imprimir el nombre completo

        // Solución 1 -> "poco eficaz"
        String nombre = "EDUARDO";
        String apellido1 = "corral";
        String apellido2 = "MuÑoZ";

        nombre = nombre.substring(0, 1).toUpperCase() + nombre.substring(1).toLowerCase();
        apellido1 = apellido1.substring(0, 1).toUpperCase() + apellido1.substring(1).toLowerCase();
        apellido2 = apellido2.substring(0, 1).toUpperCase() + apellido2.substring(1).toLowerCase();
        //System.out.println(nombre.toUpperCase().charAt(0) + nombre.substring(1).toLowerCase());

        System.out.println("Nombre Completo = " + nombre + " " + apellido1 + " " + apellido2);

        // Solución 2 - más eficaz
        nombre = "Juan Antonio";
        apellido1 = "DE LA ROSA";
        apellido2 = "san pablo-parra";
        String nombreCompleto = nombre + " " + apellido1 + " " + apellido2;
        nombreCompleto = nombreCompleto.replace("-"," - ");
        System.out.println("nombreCompleto = " + nombreCompleto);
        String[] matriz = nombreCompleto.split(" ");

        String nombreCapitalizado = "";
        for (int i = 0; i < matriz.length; i++) {
            //System.out.println("matriz[" + i + "] = " + matriz[i]); // Recorrer matriz
            //System.out.println("matriz[" + i + "] = " + matriz[i].substring(0, 1).toUpperCase() + matriz[i].substring(1).toLowerCase());
            nombreCapitalizado += matriz[i].substring(0, 1).toUpperCase() + matriz[i].substring(1).toLowerCase() + " ";
        }
        nombreCapitalizado = nombreCapitalizado.replace(" - ","-");
        System.out.println("nombreCompleto = " + nombreCapitalizado);

    }
}
