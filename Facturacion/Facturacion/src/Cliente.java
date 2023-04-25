public class Cliente {
    // Atributos
    private String nombre;
    private String apellidos;
    private String dni;
    private String direccion;
    private String email;

    // Constructor

    public Cliente(String nombre, String apellidos, String dni, String direccion, String email) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.direccion = direccion;
        this.email = email;
    }

    // toString

    @Override
    public String toString() {
        return "Cliente: \n" +
                nombre + " " + apellidos + '\n' +
                "DNI: " + dni + '\n' +
                direccion + '\n' +
                email + '\n';
    }
}
