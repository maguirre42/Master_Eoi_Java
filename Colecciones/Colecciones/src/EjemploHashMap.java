import java.util.HashMap;

public class EjemploHashMap {
    public static void main(String[] args) {
        // Declaración
        HashMap<Integer,String> listin = new HashMap<>();
        
        // Agregar
        listin.put(609609609,"Pepe");
        listin.put(609609610,"Berta");
        listin.put(609609611,"Ana");
        listin.put(609609619,"Juan");
        listin.put(609609629,"Evaristo");

        // Obtener un valor
        System.out.println("listin.get(609609610) = " + listin.get(609609610));
        System.out.println("-----------------------------");

        // Obtener todas las claves
        System.out.println("listin.keySet() = " + listin.keySet());
        System.out.println("-----------------------------");

        // Obtener todos los valores
        System.out.println("listin.values() = " + listin.values());
        System.out.println("-----------------------------");

        recorrer(listin);

        recorrer2(listin);

        // Buscar
        System.out.println("listin.containsValue(\"Juan\") = " + listin.containsValue("Juan"));
        System.out.println("listin.containsValue(\"Eduardo\") = " + listin.containsValue("Eduardo"));
        System.out.println("listin.containsKey(609609609) = " + listin.containsKey(609609609));
        System.out.println("listin.containsKey(609609609) = " + listin.containsKey(649649649));

        // Modificar
        listin.replace(609609609,"José");
        recorrer2(listin);
        System.out.println("listin.replace(609609609,\"Pepe\",\"Paco\") = " + listin.replace(609609609,"José","Paco"));
        recorrer2(listin);

        // Borrar una clave determinada
        System.out.println("listin.remove(60960699) = " + listin.remove(609609609));
        recorrer2(listin);

        
    }

    public static void recorrer(HashMap<Integer,String> mapa){
        for(Integer clave : mapa.keySet()){
            System.out.println("clave = " + clave + " ---> " + mapa.get(clave));
        }
        System.out.println("------------------------------");
    }

    public static void recorrer2(HashMap<Integer,String> mapa){
        mapa.forEach((telefono,nombre) -> {
            System.out.println("telefono = " + telefono + " nombre = " + nombre);
        });
        System.out.println("------------------------------");
    }
}
