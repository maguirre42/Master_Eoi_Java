public enum Asignaturas {
    // Declarar nombres asignaturas
    MATEMATICAS(25,"Matematicas"),
    FISICA(43,"Fisica  "),
    QUIMICA(44,"Quimica  "),
    FILOSOFIA(67,"Filosofia"),
    HISTORIA(80,"Historia");

    // Atributos
    private final int codigo;
    private final String nombreAsignatura;

    // Constructor
    Asignaturas(int codigo, String nombreAsignatura) {
        this.codigo = codigo;
        this.nombreAsignatura = nombreAsignatura;
    }

    // Getters y setters
    public String getNombreAsignatura() {
        return nombreAsignatura;
    }
}
