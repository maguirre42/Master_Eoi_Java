import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class EjemploHashSet {
    public static void main(String[] args) {
        // Declaración
        HashSet<Integer> numeros = new HashSet<>();

        // Agregar
        numeros.add(4);
        numeros.add(9);
        numeros.add(12);
        numeros.add(7);
        numeros.add(5);
        numeros.add(23);

        // Agrega duplicado
        System.out.println(numeros.add(7));

        recorrer(numeros);

        // Eliminar
        System.out.println(numeros.remove(23));

        recorrer(numeros);
        recorreIterator(numeros);
        // Buscar
        System.out.println("numeros.contains(5) = " + numeros.contains(5));
        System.out.println("numeros.contains(23) = " + numeros.contains(23));
        
        // Vaciar el HashSet
        System.out.println("numeros.isEmpty() = " + numeros.isEmpty());
        numeros.clear();
        System.out.println("numeros.isEmpty() = " + numeros.isEmpty());


    }

    public static void recorrer(HashSet<Integer> num){
        for(Integer n : num){
            System.out.println("n = " + n);
        }
        System.out.println("-------------------------");
    }

    public static void recorreIterator(HashSet<Integer> num){
        Iterator<Integer> iter = num.iterator();
        while (iter.hasNext()){
            System.out.println("iter.next() = " + iter.next());
        }
    }
}
