package ConAbstracta;

public class DemoConAbstracta {
    public static void main(String[] args) {
        ClaseHija objeto = new ClaseHija();
        objeto.direccion = "la mia";
        System.out.println("objeto.direccion = " + objeto.direccion);
        objeto.hola();
        objeto.saludo();
        System.out.println("objeto.CONSTANTE1 = " + objeto.CONSTANTE1);
        objeto.metodoInterfaz1();
        objeto.metodoInterfaz1B();
    }
}
