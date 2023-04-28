import javax.swing.*;

public class IntroduciendoDatos {
    public static void main(String[] args) {
        // Leer dato (String)
        String dato;
        dato = JOptionPane.showInputDialog(null,"Introduce un entero");
        //System.out.println("dato = " + dato);

        // Convertir dato a entero y representarlo en los diferentes sistemas
        int numDecimal = Integer.parseInt(dato);
        // System.out.println("numDecimal = " + numDecimal);
        System.out.println("Decimal = " + numDecimal);
        System.out.println("Binario = 0b" + Integer.toBinaryString(numDecimal));
        System.out.println("Octal = 0" + Integer.toOctalString(numDecimal));
        System.out.println("Hexadecimal = 0x" + Integer.toHexString(numDecimal).toUpperCase());
        
    }
}
