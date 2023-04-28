import java.util.Scanner;

public class IntroduciendoDatosConsola {
    public static void main(String[] args) {
        // Leer dato desde consola
        String dato;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un entero: ");
        dato = entrada.nextLine();
        // System.out.println("dato = " + dato);

        // Convertir dato a entero y representarlo en los diferentes sistemas
        int numDecimal = Integer.parseInt(dato);
        System.out.println("Decimal = " + numDecimal);
        System.out.println("Binario = 0b" + Integer.toBinaryString(numDecimal));
        System.out.println("Octal = 0" + Integer.toOctalString(numDecimal));
        System.out.println("Hexadecimal = 0x" + Integer.toHexString(numDecimal).toUpperCase());
    }
}
