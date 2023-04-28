import java.util.Arrays;

public class OrdenDescendente {
    public static void main(String[] args) {
        // Llamada al metodo usando array numeros
        int[] numeros = {2,7,9,3,1,5};
        ordenInverso(numeros);
        for(int i:numeros){
            System.out.println("i = " + i);
        }
        // Llamada al metodo usando array col (colores)
        String[] col = {"azul","rojo","verde","amarillo","naranja"};
        ordenInverso(col);
        for(String color:col){
            System.out.println("color = " + color);
        }
    }

    // Ordenar un array numérico en orden descendente
    public static void ordenInverso(int[] numeros){
        Arrays.sort(numeros);
        int[] aux = Arrays.copyOf(numeros,numeros.length);
        for (int i = 0; i < numeros.length; i++){
            int indice = numeros.length - i - 1;
            numeros[i] = aux[indice];
        }
    }
    // Ordenar un array numérico en orden alfanumerico ascii
    public static void ordenInverso(String[] colores){
        Arrays.sort(colores);
        String[] aux = Arrays.copyOf(colores,colores.length);
        for(int i = 0; i < colores.length; i++){
            colores[i] = aux[colores.length - i - 1];
        }
    }


}
