public class General {
    public static void main(String[] args) {
        System.out.println("Math.max(4,8) = " + Math.max(4,8));
        System.out.println("Math.min(4,8) = " + Math.min(4,8));
        System.out.println("Math.sqrt(16) = " + Math.sqrt(16));
        System.out.println("Math.pow(4,4) = " + Math.pow(4,4));
        // Grados -> radianes
        // 360 -> 2*PI
        // radianes = (grados * 2 * PI) / 360
        double radianes = (30 * 2 * Math.PI) / 360;
        System.out.println("Math.sin(radianes) = " + Math.sin(radianes));
        System.out.println("Math.cos(radianes) = " + Math.cos(radianes));
        System.out.println("Math.log(2.71) = " + Math.log(2.71));
        System.out.println("Math.log10(2) = " + Math.log10(2));
        System.out.println("Math.ceil(2.1) = " + Math.ceil(2.1));
        System.out.println("Math.floor(2.9) = " + Math.floor(2.9));
        System.out.println("Math.round(2.5) = " + Math.round(2.5));
        System.out.println("Math.round(2.4) = " + Math.round(2.4));
        System.out.println("Math.abs(2.3) = " + Math.abs(2.3));
        System.out.println("Math.abs(-2.3) = " + Math.abs(-2.3));
        System.out.println("Math.exp = " + Math.exp(2));// potencia de e
    }
}
