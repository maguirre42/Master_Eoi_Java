public class EjemploTryCatch {
    public static void main(String[] args) {
        int[] numeros = {1,2,0,4,5};
        try {
            for (int i = 0; i < numeros.length; i++) {
                //System.out.println("numeros[" + i + "] = " + numeros[i]);
                System.out.println("(1/numeros[" + i + "]) = " + (1/numeros[i]));
            }
        }catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Fuera de límites");
        }catch(ArithmeticException e){
            System.out.println("Hay una división por cero");
        }catch (Exception e){
            System.out.println("Un error no definido en el catch");
        }finally{
            System.out.println("Bloque de código que se ejecuta siempre");
        }

        System.out.println("Bloque final del programa");
    }

}
