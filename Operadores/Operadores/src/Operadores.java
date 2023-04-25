public class Operadores {
    public static void main(String[] args) {
        // Incremento y decremento
        int a = 10;
        System.out.println("a = " + a); // 10
        System.out.println("++a = " + ++a); // 11
        System.out.println("a = " + a); // 11
        System.out.println("a++ = " + a++); // 11
        System.out.println("a = " + a); // 12
        System.out.println("--a = " + --a); // 11
        System.out.println("a-- = " + a--); // 11
        System.out.println("a = " + a); // 10

        // módulo resto de la división entera
        int b = 2;
        int c = 8;
        System.out.println("módulo = " + (c % b));

        // += y -=
        c += b; // c = c + b;
        System.out.println("c += b -> " + c);
        c -= b; // c = c - b;
        System.out.println("c -= b -> " + c);

        // *= y /=
        c *= 2; // c = c * 2;
        System.out.println("c *= 2 -> " + c);
        c /= 4; // c = c / 4;
        System.out.println("c /= 4 -> " + c);

        // %=
        c %= 3; // c = c % 3;
        System.out.println("c %= 3 -> " + c);

        // Operadores relacionales
        System.out.println("b > c = " + (b > c)); // true
        System.out.println("b >= c = " + (b >= c)); // true
        System.out.println("b < c = " + (b < c)); // false
        System.out.println("b <= c = " + (b <= c)); // false
        System.out.println("b == c = " + (b == c)); // false
        System.out.println("b != c = " + (b != c)); // true

        // Operador ternario
        // tipo variable = (condición) ? valor1(true) : valor2(false);
        // if(condición) then {variable = valor1;} else {variable = valor2;}
        int resultado = (c < a) ? 3 : 5;
        System.out.println("resultado = " + resultado);

        // Operadores lógicos
        System.out.println("(c < a) AND (b < a) = " + ((c < a) && (b < a)));
        // false && false = false
        // false && true = false
        // true && false = false
        // true && true = true

        System.out.println("(c > a) OR (b > a) = " + ((c > a) || (b > a)));
        // false || false = false
        // false || true = true
        // true || false = true
        // true || true = true

        System.out.println("NOT(b > a) = " + !(b > a));
    }
}
