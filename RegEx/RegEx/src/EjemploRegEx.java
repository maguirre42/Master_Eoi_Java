import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EjemploRegEx {
    public static void main(String[] args) {
        String texto = "En un lugar de La 579 Mancha de cuyo nombre";
        String patron = "mancha";
        busqueda(patron,texto);

        // Que contenga cualquiera de los textos separados por |
        patron = "lugar|sitio|ubicación";
        busqueda(patron,texto);

        // Que contenga al menos una vez lo que hay detrás del .
        patron = ".de";
        busqueda(patron,texto);

        // Que empiece por lo hay tras ^
        patron = "^en";
        busqueda(patron,texto);

        // Que termine en lo que hay entes del $
        patron = "nombre$";
        busqueda(patron,texto);

        // Que contenga un digito (0..9)
        patron = "\\d";
        busqueda(patron,texto);

        // Que contenga un espacio en blanco
        patron = "\\s";
        busqueda(patron,texto);

        // Que empieza o termina por lo hay delante o tras \b
        patron = "nombre\\b"; // "\\bnombre"
        busqueda(patron,texto);
        patron = "en\\b"; // "en\\b"
        busqueda(patron,texto);

        // Que contenga letras definidas en un rango [a-z]
        patron = "[x-z]";
        busqueda(patron,texto);

        // Que contenga números definidos en un rango [5-9]
        patron = "[5-9]";
        busqueda(patron,texto);

        // Que contenga luggg
        patron = "lug{3}";
        busqueda(patron,texto);

        // Que contenga al menos dos digitos consecutivos comprendidos en el rango
        patron = "[5-9]{2}";
        busqueda(patron,texto);

        // Password con al menos una Mayúscula, una minúscula,
        // un digito y un caracter especial y al menos 8 caracteres
        texto = "44455Acb%";
        patron = "(?=.*[0-9])(?=.*[A-Z])(?=.*[a-z])(?=.*[@#%^&+]).{8,}";
        busquedaInsensitivo(patron,texto);

        // Email
        texto = "eoi@aguirre.es";
        patron = "^[a-z0-9_]+[[a-z0-9_-]\\.]*\\@[a-z0-9_]+((-[a-z0-9_]+)|([a-z0-9_]*))\\.[a-z]{2,}$";

        busquedaInsensitivo(patron,texto);
    }


    public static void busqueda(String patron, String texto){
        Pattern miPatron = Pattern.compile(patron, Pattern.CASE_INSENSITIVE);
        Matcher miMatcher = miPatron.matcher(texto);
        System.out.println("miMatcher.find("+ patron +") = " + miMatcher.find());
    }

    public static void busquedaInsensitivo(String patron, String texto){
        Pattern miPatron = Pattern.compile(patron);
        Matcher miMatcher = miPatron.matcher(texto);
        System.out.println("miMatcher.find("+patron+") = " + miMatcher.find());
    }


}
