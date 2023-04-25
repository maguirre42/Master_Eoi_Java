import subpaquete.Modificadores;
import java.util.*;

public class OtroEjemploPaquetes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // sin importar
        // java.util.Scanner entrada = new java.util.Scanner(System.in)

        Modificadores objeto = new Modificadores("Eduardo", "Corral", 17);
        objeto.nombreCompleto();
        objeto.nombre = "Paco";
        objeto.setApellidos("Pérez");
        objeto.setEdad(20);
        //objeto.tonteria();
        objeto.llamaTonteria();
        System.out.println(objeto.toString());

    }
}
