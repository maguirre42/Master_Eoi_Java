import javax.swing.*;
import java.util.HashMap;


public class EjercicioHashMap {
    // partiendo de una lista email->usuario
    // crear un método que localice el email introduciendo el nombre por consola o emergente
    public static void main(String[] args) {
        // Introducir nombre a buscar
        String nombre;
        nombre = JOptionPane.showInputDialog(null,"Introduce un nombre");

        // Mapa
        HashMap<String,String> emails = new HashMap<>();

        emails.put("juan@eoi.es","Juan");
        emails.put("maria@eoi.es","María");
        emails.put("ana@eoi.es","Ana");
        emails.put("anaperez@eoi.es","Ana");
        emails.put("paco@eoi.es","Paco");

        buscaEmail(nombre,emails);
    }

    public static void buscaEmail(String nom, HashMap<String,String> mapa){
        if(mapa.containsValue(nom)) {
            mapa.forEach((email, nombre) -> {
                if (nombre.equals(nom)) {
                    System.out.println("Nombre = " + nom + " email = " + email);
                }
            });
        }else{
            System.out.println("Nombre no encontrado");
        }
    }

}
