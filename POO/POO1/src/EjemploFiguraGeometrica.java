public class EjemploFiguraGeometrica {
    public static void main(String[] args) {
        FiguraGeometrica triangulo = new FiguraGeometrica("Triangulo",3,2.5f);
        System.out.println(triangulo.info());

        FiguraGeometrica circulo = new FiguraGeometrica("Circulo",0,1.5f);
        System.out.println(circulo.info());
    }
}
