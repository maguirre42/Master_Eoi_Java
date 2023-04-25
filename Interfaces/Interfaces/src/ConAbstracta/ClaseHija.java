package ConAbstracta;

public class ClaseHija extends Abstracta{
    String fecha;

    @Override
    public void saludo() {
        System.out.println("UNO");
    }

    @Override
    public void metodoInterfaz1() {
        System.out.println("DOS");
    }

    @Override
    public void metodoInterfaz1B() {
        System.out.println("TRES");
    }

    public void metodoInterfaz1B(int a){
        System.out.println("a = " + a);
    }

    
}
