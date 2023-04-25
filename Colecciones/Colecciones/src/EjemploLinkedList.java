import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class EjemploLinkedList {
    public static void main(String[] args) {
        // Declaración
        LinkedList<Integer> numeros = new LinkedList<>();

        // Agregar
        numeros.add(3);
        numeros.add(5);
        numeros.add(1);
        numeros.add(12);
        numeros.add(3);

        recorrer(numeros);

        numeros.add(2,23);

        recorrer(numeros);

        // add especificos de LinkedList
        numeros.addFirst(56);
        numeros.addLast(48);
        recorrer(numeros);

        // Ordenar
        Collections.sort(numeros);
        recorrer(numeros);

        // Eliminar
        numeros.remove(3);
        recorrer(numeros);
        //remove especificos de LinkedList
        numeros.removeFirst();
        numeros.removeLast();
        recorrer(numeros);

        // Buscar
        System.out.println("numeros.indexOf(3) = " + numeros.indexOf(3));
        System.out.println("numeros.indexOf(80) = " + numeros.indexOf(80));
        System.out.println("numeros.lastIndexOf(3) = " + numeros.lastIndexOf(3));
        System.out.println("numeros.contains(23) = " + numeros.contains(23));
        System.out.println("numeros.contains(80) = " + numeros.contains(80));

        recorreIterator(numeros);

        numeros.clear();
        System.out.println("numeros.isEmpty() = " + numeros.isEmpty());


    }

    public static void recorrer(LinkedList<Integer> num){
        for(int i = 0; i < num.size(); i++){
            System.out.println("num.get(" + i + ") = " + num.get(i));
        }
        System.out.println("-----------------------------------");
    }

    public static void recorreIterator(LinkedList<Integer> num){
        Iterator<Integer> iter = num.iterator();
        while (iter.hasNext()){
            System.out.println("iter.next() = " + iter.next());
        }
    }
}
