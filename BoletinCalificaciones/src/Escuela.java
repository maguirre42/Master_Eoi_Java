 public class Escuela {
    // Atributos de la clase
    private String nombreEscuela = "Centro de Enseñanzas Tecnológicas";
    private String direccion = "C/ Marqués de Cubas, 45 - 37001 Salamanca";
    private String telefono = "Tel. 923 22 55 66";
    private String email = "contacto@cet.es";

    @Override
    public String toString() {
        return  nombreEscuela + '\n' +
                direccion + '\n' +
                telefono + '\t' + email + '\n' +
                "---------------------------------------------";
    }
}
