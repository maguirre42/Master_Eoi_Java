public class GeneralidadesArrays {
    public static void main(String[] args) {
        // Declaraciones
        String[] colores1 = {"azul","rojo","verde","amarillo","naranja"};
        String[] colores2 = new String[5];
        // inversa String[] colores1 = {"naranja","amarillo","verde","rojo","azul"};
        // Recorrer las matrices
        for(int i = 0; i < colores1.length; i++){
            System.out.println("colores1[" + i + "] = " + colores1[i]);
        }

        for(int i = 0; i < colores2.length; i++){
            System.out.println("colores2[" + i + "] = " + colores2[i]);
        }
        System.out.println("-------------------------------------");

        // asignar valores
        colores2[0] = "azul";
        colores2[1] = "verde";

        for(int i = 0; i < colores2.length; i++){
            System.out.println("colores2[" + i + "] = " + colores2[i]);
        }
        System.out.println("-------------------------------------");

        // copiar una matriz en otra
        for (int i = 0; i < colores1.length; i++){
            colores2[i] = colores1[i];
        }
        for(int i = 0; i < colores2.length; i++){
            System.out.println("colores2[" + i + "] = " + colores2[i]);
        }
        System.out.println("-------------------------------------");

        // inversa
        // colores2[0] = colores1[4]
        // colores2[1] = colores1[3]
        // colores2[2] = colores1[2]
        // colores2[3] = colores1[1]
        // colores2[4] = colores1[0]
        for (int i = 0; i < colores2.length; i++){
            int indice = colores2.length - i - 1;
            colores2[i] = colores1[indice];
            //System.out.println(" i -> " + i + " | indice = " + indice);
        }
        for(int i = 0; i < colores2.length; i++){
            System.out.println("colores2[" + i + "] = " + colores2[i]);
        }
    }
}
