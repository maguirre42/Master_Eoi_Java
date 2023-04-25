package subpaquete;

public class ejemploMismoPaquete {
    public static void main(String[] args) {
        Persona vecino = new Persona("Ana","García","ana@eoi.es", Amigos.PEPE);
        vecino.setDireccion("mi calle, 33");
        System.out.println(vecino.toString());
    }
}
