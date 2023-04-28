public class Generalidades {
    public static void main(String[] args) {
        // Declaraciones
        String nombre = new String("Moises");
        System.out.println("nombre = " + nombre);
        String apellido = "Aguirre";
        System.out.println("apellido = " + apellido);
        
        // "escapar" las comillas
        String bienvenida = "El nombre auténtico de Pepe es \"José\" Martín";
        System.out.println("bienvenida = " + bienvenida);

        // Concatenar
        System.out.println("El nombre completo es = " + nombre + " " + apellido);
        String nombreCompleto = nombre + " " + apellido;
        System.out.println("nombreCompleto = " + nombreCompleto);
        
        // Comparar
        String uno = "Moises Aguirre";
        String dos = new String("Moises Aguirre");
        //String dos = "Eduardo Corral";
        System.out.println("uno = " + uno);
        System.out.println("dos = " + dos);
        System.out.println("uno == dos -> " + (uno == dos)); // "Incorrecto"
        System.out.println("uno.equals(dos) -> " + uno.equals(dos)); // Correcto

    }

}
