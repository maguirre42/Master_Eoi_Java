public class EjemploThrow {
    public static void main(String[] args) {
        try {
            comprobarEdad(17);
        }catch(ArithmeticException e){
            System.out.println("e.toString() = " + e.toString());
        }
    }

    static void comprobarEdad(int edad){
        if(edad < 18){
            //System.out.println("Acceso denegado");
            throw new ArithmeticException("Acceso Denegado");
        }else{
            System.out.println("Acceso permitido");
        }
    }
}
