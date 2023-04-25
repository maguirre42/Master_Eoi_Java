public class EjemploCoche {
    public static void main(String[] args) {
        // Método estatico
        Coche.llamarEmergencias();
        System.out.println(Coche.eCall);
        System.out.println("Coche.distintivo = " + Coche.distintivo);

        // "instanciar" (crear)
        Coche miCoche = new Coche();
        Coche tuCoche = new Coche();
        
        miCoche.marca = "Ford";
        miCoche.modelo = "Mondeo";
        miCoche.color = "Negro";
        miCoche.combustible = "Diesel";
        miCoche.cilindrada = 2000;
        miCoche.deposito = 50;

        //miCoche.eCall = "911"; // No se puede cambiar porque es final
        tuCoche.marca = "Renault";

        System.out.println("miCoche.marca = " + miCoche.marca);
        System.out.println("miCoche.modelo = " + miCoche.modelo);
        System.out.println("miCoche.color = " + miCoche.color);
        System.out.println("tuCoche.eCall = " + tuCoche.eCall);

        System.out.println("--------------------------------");

        // modificación de atributos estáticos
        System.out.println("Coche.distintivo = " + Coche.distintivo);
        System.out.println("tuCoche.distintivo = " + tuCoche.distintivo);
        System.out.println("miCoche.distintivo = " + miCoche.distintivo);
        //miCoche.distintivo = "F";
        Coche.distintivo = "G";
        System.out.println("Coche.distintivo = " + Coche.distintivo);
        System.out.println("tuCoche.distintivo = " + tuCoche.distintivo);
        System.out.println("miCoche.distintivo = " + miCoche.distintivo);

        System.out.println(miCoche.detallesCoche());
        System.out.println("--------------------------------");
        System.out.println("consumo = " + miCoche.consumo(600));
        System.out.println("consumo = " + miCoche.consumo(600,50));
    }
}
