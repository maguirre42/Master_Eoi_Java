import java.util.Arrays;

public class MetodosArrays{
    public static void main(String[] args) {
        // En la siguiente clase examinaremos algunos métodos de la clase Arrays
        String[] colores1 = {"aZul","Rojo","verde","amarillo","naranja"};
        int[] numeros = {3,2,5,4,3,6};
        int[] numeros1 = {2,8,3,5,4,9};

        // Buscar solo en arrays ordenados y con valores únicos
//        System.out.println("Arrays.binarySearch(numeros, 6) = " + Arrays.binarySearch(numeros, 2)); // primera coincidencia
//        System.out.println("Arrays.binarySearch(numeros, 6) = " + Arrays.binarySearch(numeros,2,6,4)); // no incluye ni from ni to
//        System.out.println("Arrays.binarySearch(colores1, \"rojo\") = " + Arrays.binarySearch(colores1, "amarillo"));
      
        // Ordenar
        Arrays.sort(numeros);
        for(int a:numeros){
            System.out.println("a = " + a);
        }
        System.out.println("------------------------------");
        Arrays.sort(colores1);
        for(String color:colores1){
            System.out.println("color = " + color);
        }
        System.out.println("------------------------------");
        // Comparar
        System.out.println("Arrays.equals(numeros,numeros1) = " + Arrays.equals(numeros,numeros1));
        System.out.println("Arrays.compare(numeros,numeros1) = " + Arrays.compare(numeros,numeros1));
        System.out.println("------------------------------");
        
        // Copiar
        int[] copia = Arrays.copyOf(numeros,numeros.length);
        for(int a:copia){
            System.out.println("a = " + a);
        }
        System.out.println("------------------------------");
        int[] copiaRango = Arrays.copyOfRange(numeros,2,numeros.length);
        for(int a:copiaRango){
            System.out.println("a = " + a);
        }
        System.out.println("------------------------------");
        // Rellenar array vacio
        int[] miArray = new int[8];
        for(int i:miArray){
            System.out.println("i = " + i);
        }
        System.out.println("------------------------------");
        Arrays.fill(miArray,1);
        for(int i:miArray){
            System.out.println("i = " + i);
        }

        //Bidimensional
        int[][] bidi = new int[4][3];
        bidi[0][0] = 23; // ....

        int[][] bidi1 = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};

        int[][] bidi2 = new int[4][];
        bidi2[0] = new int[4];
        bidi2[1] = new int[3];
        bidi2[2] = new int[7];
        bidi2[3] = new int[2];

        int[][] bidi3 = {{1,2,3,13,14},{4,5,6},{7,8,9,15},{10,11}};
        for(int i = 0; i < bidi3.length; i++){
            for(int j = 0; j < bidi3[i].length; j++){
                System.out.println("bidi3[" + i + "][" + j + "] = " + bidi3[i][j]);
            }
        }
    }
}
