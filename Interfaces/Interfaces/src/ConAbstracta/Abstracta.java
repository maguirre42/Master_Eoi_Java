package ConAbstracta;

abstract public class Abstracta implements Interface1 {
    String direccion;

    public void hola(){
        System.out.println("Hola");
    }

    abstract public void saludo();
}
