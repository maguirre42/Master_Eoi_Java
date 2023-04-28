import java.util.ArrayList;
import java.util.function.Consumer;

public class EjemploLambda {
    public static void main(String[] args) {
        // Declaracion ArrayList
        ArrayList<Integer> cifras = new ArrayList<>();
        cifras.add(89);
        cifras.add(8);
        cifras.add(9);
        cifras.add(25);

        // Recorrer sin lambda
        for (Integer valor : cifras) {
            System.out.println("valor = " + valor);
        }

        // Recorrer con lambda
        cifras.forEach((n) -> System.out.println("n = " + n));

        // bloque
        cifras.forEach((n) -> {
            if (n == 89) {
                System.out.println("El 89");
            } else {
                n *= 2;
            }
            System.out.println("n = " + n);
        });

        System.out.println("-------------------------------------");
        // Asignar lamba a variable de tipo emun
        Consumer numerar = (n) -> System.out.println("n = " + n);
        cifras.forEach(numerar);

        System.out.println("-------------------------------------");
        // Interfaz FuncionString 
        FuncionString interrogacion = (s) -> "¿" + s + "?";
        System.out.println("interrogacion.ejecuta(\"Qué tal\") = " + interrogacion.ejecuta("Qué tal"));
        FuncionString admiracion = (s) -> "¡" + s + "!";
        System.out.println("admiracion.ejecuta(\"Muy bien\") = " + admiracion.ejecuta("Muy bien"));

        System.out.println("-------------------------------------");
        // Interfaz FuncionNumeros
        FuncionNumeros sumar = (i,j) -> i + j;
        System.out.println("sumar.ejecuta(4.5f, 5.7f) = " + sumar.ejecuta(4.5f, 5.7f));
        FuncionNumeros multiplicar = (n1,n2) -> n1 * n2;
        System.out.println("multiplicar.ejecuta(2.0f, 3.3f) = " + multiplicar.ejecuta(2.0f, 3.3f));
    }
    
    
}

