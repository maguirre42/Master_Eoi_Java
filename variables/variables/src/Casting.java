public class Casting {
    public static void main(String[] args) {

        // Widenning casting
        byte miByte = 68; // 1 Byte 
        System.out.println("miByte = " + miByte);
        
        short miShort = miByte; // de 1 a 2 bytes
        System.out.println("miShort = " + miShort);

        int miInt = miByte; // de 1 a 4 bytes
        System.out.println("miInt = " + miInt);
        
        long miLong = miByte; // de 1 a 8 bytes
        System.out.println("miLong = " + miLong);
        
        float miFloat = miByte; // de 1 a 4 bytes real
        System.out.println("miFloat = " + miFloat);
        
        double miDouble = miByte; // de 1 a 8 butes real
        System.out.println("miDouble = " + miDouble);
        System.out.println("-------------------------------------");

        // Narrowing casting
        miDouble = 456468.56e38d;
        System.out.println("miDouble = " + miDouble);

        miFloat = (float) miDouble;
        System.out.println("miFloat = " + miFloat);

        miLong = (long) miDouble;
        System.out.println("miLong = " + miLong);

        miInt = (int) miDouble;
        System.out.println("miInt = " + miInt);

        miShort = (short) miDouble;
        System.out.println("miShort = " + miShort);

        miByte = (byte) miDouble;
        System.out.println("miByte = " + miByte);
    }
}
