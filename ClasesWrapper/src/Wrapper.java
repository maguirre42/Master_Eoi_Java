public class Wrapper {
    public static void main(String[] args) {
        // Integer
        Integer i = Integer.valueOf(123456);
        Integer e = 123456;
        System.out.println("e == i -> " + (e == i));
        System.out.println("i.equals(e) = " + i.equals(e));
        System.out.println("i.compareTo(e) = " + i.compareTo(e));

        System.out.println("i = " + i);
        String s = i.toString();
        System.out.println("s = " + s);

        int j = i.intValue();
        long l = i.longValue();
        float f = i.floatValue();
        double d = i.doubleValue();
        System.out.println("int, long, float, double -> " + j + "," + l + "," + f + "," +d);

        int k = Integer.parseInt("123456");
        System.out.println("k = " + k);

        System.out.println("To Hex = " + Integer.toHexString(123456));
        System.out.println("To Oct = " + Integer.toOctalString(123456));
        System.out.println("To Bin = " + Integer.toBinaryString(123456));
        
        // Long
        Long varlong = 1234567899L;
        System.out.println("varlong = " + varlong);
        String str = varlong.toString();
        System.out.println("str = " + str);
        d = varlong.doubleValue();
        System.out.println("d = " + d);
        System.out.println("bits = " + Long.bitCount(12354646));

        // Character
        Character c = Character.valueOf('1');
        Character c1 = 'b';
        System.out.println("c1 = " + c1);
        char c2 = c.charValue();
        System.out.println("c.charValue() = " + c2);
        System.out.println("Character.isDigit(c) = " + Character.isDigit(c));
        System.out.println("Character.isAlphabetic(c) = " + Character.isAlphabetic(c));
        System.out.println("Character.isAlphabetic(c1) = " + Character.isAlphabetic(c1));
        System.out.println("Character.isUpperCase(c1) = " + Character.isUpperCase(c1));
        System.out.println("Character.isLowerCase(c1) = " + Character.isLowerCase(c1));
        System.out.println("Character.toUpperCase(c1) = " + Character.toUpperCase(c1));
    }
}
