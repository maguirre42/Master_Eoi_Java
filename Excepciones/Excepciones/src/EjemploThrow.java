public class EjemploThrow {
    public static void main(String[] args) {
    // Try...catch 
        try {
            comprobarEdad(17);
        }catch(ArithmeticException e){
            System.out.println("e.toString() = " + e.toString());
        }
    }
    // Metodo para verificar si alguien tiene 18 años o mas
    static void comprobarEdad(int edad){
        if(edad < 18){
            //System.out.println("Acceso denegado");
            throw new ArithmeticException("Acceso Denegado");
        }else{
            System.out.println("Acceso permitido");
        }
    }
}
