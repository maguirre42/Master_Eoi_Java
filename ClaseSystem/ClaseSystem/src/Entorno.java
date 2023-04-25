import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

public class Entorno {
    public static void main(String[] args) {
        boolean debug = true;
        // Variables de sistema 1 a 1
        System.out.println("usuario = " + System.getProperty("user.name"));
        System.out.println("directorio = " + System.getProperty("user.dir"));
        System.out.println("versión Java = " + System.getProperty("java.version"));
        System.out.println("-------------------------------------");

        // Todas las variables del sistema
        Properties propiedades = System.getProperties();
        propiedades.list(System.out);
        System.out.println("-------------------------------------");

        // Crear variables del sistema
        propiedades.setProperty("config.puerto.servidor", "8080");
        System.setProperties(propiedades);
        propiedades = System.getProperties();
        propiedades.list(System.out);
        System.out.println("-------------------------------------");

        // Cargar variables de sistema desde un archivo
        try {
            FileInputStream archivo = new FileInputStream("src/config.properties");
            propiedades.load(archivo);
            System.setProperties(propiedades);
            propiedades.list(System.out);
        } catch (FileNotFoundException e) {
            // Tratar el error de archivo no encontrado
            if(debug) System.err.println("File not found: " + e.getMessage());
        } catch (IOException e){
            // todo
            // Tratar el error de lectura del archivo
        }
        System.out.println("-------------------------------------");

        // Variables del Entorno SO
        Map<String,String> varEntorno = System.getenv();
        System.out.println("varEntorno = " + varEntorno);
        System.out.println("Usuario = " + System.getenv("USERNAME"));
        System.out.println("JAVA_HOME = " + System.getenv("JAVA_HOME"));

        System.out.println("varEntorno.keySet() = " + varEntorno.keySet());
        for(String clave: varEntorno.keySet()){
            System.out.println("clave = " + clave + " -> valor = " + System.getenv(clave));
        }
    }
}
