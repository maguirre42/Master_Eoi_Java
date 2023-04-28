public class ConversionSistemasNumericos {
    public static void main(String[] args) {
        int numDecimal = 0b1110;
        System.out.println("numDecimal = " + numDecimal);
        System.out.println("Binario = 0b" + Integer.toBinaryString(numDecimal));
        System.out.println("Octal = 0" + Integer.toOctalString(numDecimal));
        System.out.println("Hexadecimal = 0x" + Integer.toHexString(numDecimal).toUpperCase());
    }
}
