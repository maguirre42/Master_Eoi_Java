import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class EjemploArrayLIst {
    public static void main(String[] args) {
        // Crear ArrayList
        ArrayList<Integer> numeros = new ArrayList<>();

        // Agregar elementos
        numeros.add(3);
        numeros.add(5);
        numeros.add(7);
        numeros.add(9);
        numeros.add(3);
        numeros.add(2);
        numeros.add(4);
        numeros.add(8);

        // Dimensión
        System.out.println(numeros.size());

        // Obtener un valor de una posición determinada
        System.out.println(numeros.get(4));

        // Recorrer ArrayList
        recorrer(numeros);
//        for(int i = 0; i < numeros.size(); i++){
//            System.out.println("numeros.get(" + i + ") = " + numeros.get(i));
//        }
//        for (Integer valor : numeros){
//            System.out.println("valor = " + valor);
//        }

        // Insertar elemento en una posición determinada
        numeros.add(2,11);
        recorrer(numeros);

        // Modificar el valor de una posición
        numeros.set(2,12);
        recorrer(numeros);

        // Eliminar una posición deteerminada
        numeros.remove(2);
        recorrer(numeros);
        
        // Buscar un elemento por su valor
        System.out.println("numeros.indexOf(3) = " + numeros.indexOf(3));
        System.out.println("numeros.lastIndexOf(3) = " + numeros.lastIndexOf(3));
        System.out.println("numeros.indexOf(57) = " + numeros.indexOf(57));

        // Ordenar ArrayList
        Collections.sort(numeros);
        recorrer(numeros);
        recorreIterator(numeros);
        // Si un elemento está contenido en un ArrayList
        System.out.println("numeros.contains(7) = " + numeros.contains(7));
        System.out.println("numeros.contains(57) = " + numeros.contains(57));

        // Eliminar todo el contenido -> Vacia el ArrayList
        System.out.println("numeros.isEmpty() = " + numeros.isEmpty());
        numeros.clear();
        System.out.println("numeros.isEmpty() = " + numeros.isEmpty());
        recorrer(numeros);
        System.out.println("numeros.size() = " + numeros.size());
        numeros.add(87);
        System.out.println("numeros.size() = " + numeros.size());


    }

    public static void recorrer(ArrayList<Integer> num){
        for(int i = 0; i < num.size(); i++){
            System.out.println("num.get(" + i + ") = " + num.get(i));
        }
        System.out.println("-----------------------------");
    }

    public static void recorreIterator(ArrayList<Integer> num){
        Iterator<Integer> iter = num.iterator();
        while (iter.hasNext()){
            System.out.println("iter.next() = " + iter.next());
        }
    }
}
