public class EjemploCoche1 {
    public static void main(String[] args) {
        Coche1 cocheMaria = new Coche1();
        System.out.println("Km: " + cocheMaria.getKm());
        System.out.println("Marca: " + cocheMaria.getMarca());
        System.out.println("--------------------------");
        cocheMaria.setMarca("Citroen");
        System.out.println("Marca: " + cocheMaria.getMarca());
        cocheMaria.setDeposito(50);
        
        // Solo lectura
        System.out.println("cocheMaria.consumo(800) = " + cocheMaria.consumo(800));
        System.out.println("cocheMaria.consumo(800) = " + cocheMaria.consumo(700));
        // cocheMaria.setKm(400); // no puedo modificar km porque no existe el método setKm
        System.out.println("cocheMaria.getKm() = " + cocheMaria.getKm());
        System.out.println("--------------------------");

        // constructores
        Coche1 elCoche = new Coche1("Ford");
        System.out.println("elCoche.getMarca() = " + elCoche.getMarca());
        System.out.println("elCoche.getKm() = " + elCoche.getKm());
        System.out.println("-------------------------------");

        Coche1 elCocheJuan = new Coche1("Ford","Fiesta");
        System.out.println("elCocheJuan.getMarca() = " + elCocheJuan.getMarca());
        System.out.println("elCocheJuan.getModelo() = " + elCocheJuan.getModelo());
        System.out.println("elCocheJuan.getKm() = " + elCocheJuan.getKm());
    }
}
