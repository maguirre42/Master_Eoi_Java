public class EjemploFor {
    public static void main(String[] args) {
        // Mostrar del 1 al 20 con diferentes incrementos
        // incremento 1
        for(int i = 1; i <= 20; i++){
            System.out.println("i = " + i);
        }
        System.out.println("--------------------------");

        // incremento 2
        for(int i = 1; i <= 20; i = i + 2){
            System.out.println("i = " + i);
        }
        System.out.println("--------------------------");

        // incremento 5
        for(int i = 1; i <= 20; i += 5){
            System.out.println("i = " + i);
        }
        System.out.println("--------------------------");

        // incremento negativo
        for(int i = 20; i > 0; i--){
            System.out.println("i = " + i);
        }
        System.out.println("--------------------------");

        // Sumar del 1 al 20
        int suma = 0;
        for(int i = 1; i <= 20; i++){
            //suma = suma + i;
            suma += i;
        }
        System.out.println("suma = " + suma);
        System.out.println("--------------------------");

        // mostrar caracteres cuyo ASCII 65 al 90
        char caracter = 'k';
        for(int i = 65; i <= 90; i++){
            caracter = (char)i;
            System.out.println("caracter = " + caracter);
        }
        System.out.println("--------------------------");

        // mostrar caracteres cuyo ASCII 65 al 90
        for(int i = 90; i >= 65; i--){
            caracter = (char)i;
            System.out.println("caracter = " + caracter);
        }

        // recorrer matriz
        String[] coches = {"Volvo","Renault","Seat","Citroen"};
        for(int i = 0; i < coches.length; i++){
            System.out.println("coches [" + i +"] = " + coches[i]);
        }

        // for each
        for(String marca: coches){
            System.out.println("marca = " + marca);
        }

        // Bucles for anidados
        int[][] numeros = {{1,2,3},{4,5,6},{7,8,9,10}};
        for(int i = 0; i < numeros.length; i++){
            for(int k = 0; k < numeros[i].length; k++){
                System.out.println("numeros [" + i + "][" + k + "]= " + numeros[i][k]);
            }
        }

        // Poco útil
        for(int[] mat:numeros){
            for(int valor:mat){
                System.out.println("valor = " + valor);
            }
        }

    }
    
}
