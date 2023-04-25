public class DemoInterfaz {
    public static void main(String[] args) {
        // Implementando 1 interfaz
        EjemploInterfaz objetoEduardo = new EjemploInterfaz("Eduardo","Corral");
        System.out.println("objertoEduardo.nombre = " + objetoEduardo.nombre);
        System.out.println("objertoEduardo.nombreCompleto() = " + objetoEduardo.nombreCompleto());
        System.out.println("objertoEduardo.CONSTANTE1 = " + objetoEduardo.CONSTANTE1);
        objetoEduardo.metodoInterfaz1();
        objetoEduardo.metodoInterfaz1B();
        System.out.println("----------------------------");

        // Implementando 2 interfaces
        EjemploInterfazDos objetoPepe = new EjemploInterfazDos("Pepe", "Rodriguez");
        System.out.println("objetoPepe.nombre = " + objetoPepe.nombre);
        System.out.println("objetoPepe.nombreCompleto() = " + objetoPepe.nombreCompleto());
        System.out.println("objetoPepe.CONSTANTE1 = " + objetoPepe.CONSTANTE1);
        objetoPepe.metodoInterfaz1();
        System.out.println("objetoPepe.CONSTANTE2 = " + objetoPepe.CONSTANTE2);
        objetoPepe.metodoInterfaz2();
    }
}
