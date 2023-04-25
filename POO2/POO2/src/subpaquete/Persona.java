package subpaquete;


public class Persona {
    // Atributos
    private String nombre;
    private String apellidos;
    private String email;
    private Amigos mejorAmigo;
    private String direccion;

    // Constructor
    public Persona(String nombre, String apellidos, String email, Amigos mejorAmigo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.mejorAmigo = mejorAmigo;
    }

    // Setter y Getter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Amigos getMejorAmigo() {
        return mejorAmigo;
    }

    public void setMejorAmigo(Amigos mejorAmigo) {
        this.mejorAmigo = mejorAmigo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\n' +
                ", apellidos='" + apellidos + '\n' +
                ", email='" + email + '\n' +
                ", mejorAmigo=" + mejorAmigo + '\n' +
                ", direccion='" + direccion + '\n' +
                '}';
    }
}
