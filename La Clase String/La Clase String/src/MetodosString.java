public class MetodosString {
    public static void main(String[] args) {
        String str1 = "  En un lugar de La Mancha de cuyo ";
        String str2 = "Pepe Muñoz";
        String str3 = "PEPE Muñoz";

        // Longitud
        System.out.println("Longitud = " + str1.length());
        // Igual
        System.out.println("Igual = " + str2.equals(str3));
        // Igual insensitivo
        System.out.println("Igual = " + str2.equalsIgnoreCase(str3));
        // Comparar con
        System.out.println("Comparar = " + str2.compareTo(str3));
        // Comparar con insensitivo
        System.out.println("Comparar insensitivo = " + str2.compareToIgnoreCase(str3));
        // Eliminar espacios al principio u al final
        System.out.println("Con espacios = |" + str1 + "|");
        System.out.println("Sin espacios = |" + str1.trim() + "|");
        // Extraer un caracter determinado
        System.out.println("Extrae el caracter 10 = " + str1.charAt(10));
        // Convertir en matriz
        char[] matriz = str1.toCharArray();
        System.out.println("matriz 10 = " + matriz[10]);
        // Extraer cadena de caracteres
        System.out.println("Extraer con inicio y fin = " + str1.substring(0,9));
        System.out.println("Extraer desde un índice = " + str1.substring(9));
        // Buscar
        System.out.println("Buscar caracter 1ª coincidencia = " + str1.indexOf('u'));
        System.out.println("Buscar caracter 2ª coincidencia = " + str1.indexOf('u',6));
        System.out.println("Buscar palabra = "+ str1.indexOf("lugar"));
        System.out.println("Buscar caracter última coincidencia = " + str1.lastIndexOf('u'));

    }
}
