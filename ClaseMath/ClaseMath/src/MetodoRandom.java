public class MetodoRandom {
    public static void main(String[] args) {
        // Generar numero aletorio
        for(int i = 0; i < 100; i++) {
            System.out.println(Math.random());
        }
        
        // con dos decimales
        for(int i = 0; i < 100; i++) {
            int n = (int)(Math.random() * 100);
            System.out.println("n = " + n);
            float f = n;
            System.out.println("f/100 = " + f/100);
        }

        // Aleatorio del 0 al 100
        for(int i = 0; i < 100; i++){
            int n = (int)(Math.random() * (100 + 1));
            System.out.println("n = " + n);
        }

        // Aleatorio del 1 al 90 (Bingo)
        for(int i = 0; i < 100; i++){
            int n = 1 + (int)(Math.random() * 90);
            System.out.println("n = " + n);
        }

        System.out.println("----------------------------------------------");
        // Juego del Bingo (sin paradas)
        // Solución 1
        int[] bingo = new int[91];
        int cont = 0;
        while(cont < 90){
            int n = 1 + (int)(Math.random() * 90);
            if(bingo[n] != n){
                System.out.println("n = " + n);
                bingo[n] = n;
                cont++;
            }
        }
        System.out.println("----------------------------------------------");

        // Solución 2
        int[] bingo1 = new int[90];
        cont = 0;
        while(cont < 90){
            int n = 1 + (int)(Math.random() * 90);
            if(bingo1[n-1] != n){
                System.out.println("n = " + n);
                bingo1[n-1] = n;
                cont++;
            }
        }

        System.out.println("----------------------------------------------");
        // bingo - Numero a numero
        int[] bingo2 = new int[90];
        // controlado desde la consola. Cada vez pulse un tecla se ejecuta
        boolean salir = false;
        while(!salir) {
            int n = 1 + (int) (Math.random() * 90);
            if (bingo2[n - 1] != n) {
                System.out.println("n = " + n);
                bingo2[n - 1] = n;
                salir = true;
            }
            // salir cuando ya estén todos los números
            // contador
        }
    }
}
