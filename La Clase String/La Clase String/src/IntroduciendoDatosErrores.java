import java.util.Scanner;

public class IntroduciendoDatosErrores {
    public static void main(String[] args) {
        // Leer dato por consola
        String dato;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un entero: ");
        dato = entrada.nextLine();
        //System.out.println("dato = " + dato);

        // Convertir dato a entero
        int numDecimal = 0;
        
        // Control de error en la conversión de dato a entero
        try{
            // Detectar sistema numérico
            if(dato.charAt(0)!='0'){
                // decimal 14
                numDecimal = Integer.parseInt(dato);
            } else if (dato.charAt(1)=='b') {
                // binario 0b1110
                dato = dato.substring(2);
                numDecimal = Integer.parseInt(dato,2);
            } else if (dato.charAt(1)=='x') {
                // hexadecimal 0x0E
                dato = dato.substring(2);
                numDecimal = Integer.parseInt(dato,16);
            }else{
                //octal 016
                numDecimal = Integer.parseInt(dato,8);
            }
        }catch(NumberFormatException e){
            System.out.println("e.getMessage() = " + e.getMessage());
            System.out.println("ERROR - Has de introducir un número entero");
            main(args);
            System.exit(0);
        }

        // y representarlo en diferentes sistemas
        System.out.println("Decimal = " + numDecimal);
        System.out.println("Binario = Ob" + Integer.toBinaryString(numDecimal));
        System.out.println("Octal = 0" + Integer.toOctalString(numDecimal));
        System.out.println("Hexadecimal = 0x" + Integer.toHexString(numDecimal));
    }

}
