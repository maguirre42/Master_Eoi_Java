import java.util.Scanner;

public class IntroduciendoDatosErrores {
    public static void main(String[] args) {
        // Leer dato desde consola
        String dato;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un entero: ");
        dato = entrada.nextLine();
        // System.out.println("dato = " + dato);

        // Convertir dato a entero
        int numDecimal = 0;

        // Control de error en la conversión de dato a entero
        try{
            numDecimal = Integer.parseInt(dato);
        }catch(NumberFormatException e){
            System.out.println("e.getMessage() = " + e.getMessage());
            System.out.println("ERROR - Has de introducir un número entero");
            main(args);
            System.exit(0);
        }

        // y representarlo en los diferentes sistemas
        System.out.println("Decimal = " + numDecimal);
        System.out.println("Binario = 0b" + Integer.toBinaryString(numDecimal));
        System.out.println("Octal = 0" + Integer.toOctalString(numDecimal));
        System.out.println("Hexadecimal = 0x" + Integer.toHexString(numDecimal).toUpperCase());
    }
}
