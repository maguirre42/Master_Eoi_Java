public class CharYBool {
    public static void main(String[] args) {
        // Tipo char
        char caracter = '@';
        System.out.println("caracter = " + caracter);
        
        char caracter1 = '\u0021';
        System.out.println("caracter1 = " + caracter1);
        
        char caracter2 = 66;
        System.out.println("caracter2 = " + caracter2);

        char caracter3 = 'A';
        System.out.println("caracter3 = " + caracter3);
        
        
        

        // Tipo Booleano
        boolean dato = true; // false
        System.out.println("dato = " + dato);

        int a,b;
        a = 4;
        b = 7;
        dato = a > b;
        System.out.println("dato = " + dato);
        dato = a < b;
        System.out.println("dato = " + dato);
        dato = (b - a) == 3;
        System.out.println("dato = " + dato);
    }
}
