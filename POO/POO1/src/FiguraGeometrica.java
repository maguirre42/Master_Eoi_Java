public class FiguraGeometrica {
    // Atributos
    String nombre;
    int numLados;
    float lado;
    final float PI = 3.1415929f;

    // Métodos de la clase ("comportamiento")
    // perímetro, superficie, info, constructor
    public float perimetro(){
        float perimetro = 0;
        if(numLados > 0){
            perimetro = numLados * lado;
        }else{
            perimetro = PI * lado;
        }
        return perimetro;
    }

    public float superficie(){
        float superficie = 0;
        // TODO
        return superficie;
    }

    public String info() {
        return "FiguraGeometrica{" +
                "nombre='" + nombre + '\'' +
                "\nnumLados=" + numLados +
                "\nlado=" + lado +
                "\nperimetro = " + perimetro() +
                "\nsuperficie = " + superficie() +
                '}';
    }

    public FiguraGeometrica(String nombre, int numLados, float lado) {
        this.nombre = nombre;
        this.numLados = numLados;
        this.lado = lado;
    }
}
