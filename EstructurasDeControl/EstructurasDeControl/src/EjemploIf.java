import java.util.Scanner;

public class EjemploIf {
    public static void main(String[] args) {
//        // 1 - Definir los datos válidos de usuario y password
//        String usuario = "moises";
//        String password = "12345";
//
//        // 2 - Solicitar usuario y password por consola
//        Scanner entrada = new Scanner(System.in);
//        System.out.print("Usuario: ");
//        String us = entrada.next();
//        System.out.print("Password: ");
//        String pw = entrada.next();
//
//
//        // 3 - Comprobar Login
//        // Solución 1
//        boolean login = usuario.equals(us) && password.equals(pw);
//        System.out.println("login = " + login);
//
//        // Solución 2
//        String mensaje = (usuario.equals(us) && password.equals(pw)) ? "Has accedido al programa" : "Credenciales erroneas";
//        System.out.println("mensaje = " + mensaje);
//
//        // Variante
//        if(usuario.equals(us) && password.equals(pw)){
//            System.out.println("Has accedido al programa");
//            // instrucciones de acceso
//        }else{
//            System.out.println("Credenciales erroneas");
//            main(args);
//            System.exit(0);
//        }
//        entrada.close();

        // if .. else if ..
//        int a, b, c;
//        a = 2;
//        b = 2;
//        c = 2;

        int a = 2;
        int b = 2;
        int c = 2;

        if(a < b){
            System.out.println("a < b");
        }else if(b < c){
            System.out.println("b < c");
        }else {
            System.out.println("Ninguna de las anteriores");
        }

        // Comentarios en función de las notas
        int nota = 10;
        if(nota < 5){
            System.out.println("Supenso");
        }else if(nota < 7){
            System.out.println("Aprobado");
        }else if(nota < 9){
            System.out.println("Notable");
        }else if(nota < 10){
            System.out.println("Sobresaliente");
        }else{
            System.out.println("Matrícula");
        }

    }
}
