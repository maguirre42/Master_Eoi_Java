public class Estudiante {
    // Atributos clase
    private String nombreCompleto;
    private String direccion;
    private String datosContacto;
    private String grupo;

    // Constructor
    public Estudiante(String nombreCompleto, String direccion, String datosContacto, String grupo) {
        this.nombreCompleto = nombreCompleto;
        this.direccion = direccion;
        this.datosContacto = datosContacto;
        this.grupo = grupo;
    }

    @Override
    public String toString() {
        return  nombreCompleto + '\n' +
                direccion + '\n' +
                datosContacto + '\n' +
                grupo + '\n' +
                "---------------------------------------------";
    }
}
