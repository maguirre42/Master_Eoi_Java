public class EjercicioArchivo {
    public static void main(String[] args) {
        // Dado un archivo mifoto.jpg
        // Imprimir por separado nombre y el tipo de archivo
        String archivo = "esmifoto.jpg";

        // Solución 1
        String[] separado = archivo.split("\\.");
        System.out.println("nombre = " + separado[0]);
        System.out.println("extensión = " + separado[1]);
        
        // Solución 2
        int punto = archivo.lastIndexOf('.');
        System.out.println("nombre = " + archivo.substring(0,punto));
        System.out.println("extensión = " + archivo.substring(punto+1));

        // Simplificicando 2
        System.out.println("nombre = " + archivo.substring(0,archivo.lastIndexOf('.')));
        System.out.println("extensión = " + archivo.substring(archivo.lastIndexOf('.')+1));
    }
}
