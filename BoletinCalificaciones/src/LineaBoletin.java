public class LineaBoletin {
    // Atributos
    private int codigo;
    private String asignatura;
    private float nota;
    private String calificacion;

    // Constructor

    public LineaBoletin(int codigo, String asignatura, float nota, String calificacion) {
        this.codigo = codigo;
        this.asignatura = asignatura;
        this.nota = nota;
        this.calificacion = calificacion;
    }

    // Metodos

    @Override
    public String toString() {
        return codigo + "\t\t" + asignatura + "\t\t" + nota + "\t\t" + calificacion;
    }
}
