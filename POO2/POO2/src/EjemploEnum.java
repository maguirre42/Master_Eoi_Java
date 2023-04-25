public class EjemploEnum {
    public static void main(String[] args) {
        Color miColor = Color.VERDE;
        System.out.println("miColor = "+ miColor);
        System.out.println("----------------------");

        // Convertir el conhunto de valores en una matriz
        System.out.println(Color.values()[3]);
        System.out.println("----------------------");

        // Recorrer valores enumerador
        for(Color elColor  :Color.values()){
            System.out.println("elColor = " + elColor);
        }
        System.out.println("----------------------");

        miColor = Color.AZUL;
        // Toma de decisiones - Control de flujo
        // if
        if(miColor == Color.AZUL){
            System.out.println("El color es azul");
        }else{
            System.out.println("El color no es azul");
        }
        System.out.println("----------------------");

        // switch - notación 1
        switch(miColor){
            case BLANCO:
                System.out.println("El color es BLANCO");
                System.out.println("otra");
                break;
            case VERDE:
                System.out.println("El color es VERDE");
                System.out.println("otra más");
                break;
            case AZUL:
                System.out.println("El color es AZUL");
                System.out.println("otra más aún");
                break;
            // ...
        }
        System.out.println("----------------------");

        miColor = Color.BLANCO;
        // switch - notación 2
        switch (miColor){
            case BLANCO ->  // una sola instrucción no requiere llaves
                System.out.println("El color es BLANCO");
            case VERDE -> {
                System.out.println("El color es VERDE");
                System.out.println("otra más");
            }
            case AZUL -> {
                System.out.println("El color es AZUL");
                System.out.println("otra más aún");
            }
            // ...
        }
        System.out.println("----------------------");
    }
}
