public class Valor {
    public static void main(String[] args) {
       int argumento = 45;
       System.out.println("main inicio - argumento = " + argumento);
       int resultado = miMetodo(argumento);
       System.out.println("main final - argumento = " + argumento);
    }

    public static int miMetodo(int argumento){
        System.out.println("miMetodo inicio = " + argumento);
        argumento = 54;
        System.out.println("miMetodo salida = " + argumento);
        return argumento;
    }
}
