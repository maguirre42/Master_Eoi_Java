import java.util.Random;

public class ClaveAlatoria {
    public static void main(String[] args) {
        System.out.println("El password es -> " + generaPass(10));
    }

    public static String generaPass(int longitud){
        // Generar un clave aleatoria de n digitos
        // y que contenga a..z, A..Z, 0..1, &%$_
        // y se almacena en String password
        String password = "";
        String base = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghihklmnopqrstuvwxyz0123456789&%$_";
        Random objRnd = new Random();
        for(int i = 0; i < longitud; i++){
            int n = objRnd.nextInt(base.length());
            password += base.charAt(n);
        }
        return password;
    }
}
