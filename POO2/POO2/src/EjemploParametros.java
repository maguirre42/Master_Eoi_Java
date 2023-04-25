public class EjemploParametros {
    public static void main(String[] args) {
        TipoCoche miCoche = TipoCoche.SUV;
        System.out.println("miCoche = " + miCoche);
        System.out.println("miCoche.getNombre() = " + miCoche.getNombre());
        System.out.println("miCoche.getDescripcion() = " + miCoche.getDescripcion());
        System.out.println("miCoche.getNumPuertas() = " + miCoche.getNumPuertas());
        System.out.println("----------------------------------");
        
        Amigos miAmigo = Amigos.PEPE;
        System.out.println("miAmigo = " + miAmigo);
        System.out.println("miAmigo.getNombre() = " + miAmigo.getNombre());
        System.out.println("miAmigo.getTelefono() = " + miAmigo.getTelefono());
        System.out.println("miAmigo.getMail() = " + miAmigo.getMail());
        System.out.println("----------------------------------");
        
        // Como atributo en una clase
        Persona companiero = new Persona("Eduardo","Corral","eduardo@corral.es",Amigos.MARTA);
        System.out.println("companiero.getNombre() = " + companiero.getNombre());
        System.out.println("companiero.getApellidos() = " + companiero.getApellidos());
        System.out.println("companiero.getEmail() = " + companiero.getEmail());
        // companiero.setMejorAmigo(Amigos.PEPE); // Se puede modificar elvvalor como a cualquier atributo no final
        System.out.println("companiero.getMejorAmigo().getNombre() = " + companiero.getMejorAmigo());
        muestraAmigo(companiero.getMejorAmigo());
        System.out.println(companiero.getMejorAmigo().toString());

    }

    public static void muestraAmigo(Amigos amigo){
        System.out.println("amigo = " + amigo);
        System.out.println("amigo.getNombre() = " + amigo.getNombre());
        System.out.println("amigo.getTelefono() = " + amigo.getTelefono());
        System.out.println("amigo.getMail() = " + amigo.getMail());
        System.out.println("------------------------------");
    }
}
