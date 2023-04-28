public enum Amigos {
    // Declarar elementos
    PEPE("José Marín","629558897","pepe@eoi.es"),
    MARTA("Marta Pérez","629555552","marta@eoi.es"),
    MARIA("María Corral","629555553","maria@eoi.es"),
    ANTONIO("Antonio Cnales","629555554","antonio@eoi.es");
    // Declarar atributos
    private final String nombre;
    private final String telefono;
    private final String mail;
    // Constructores
    Amigos(String nombre, String telefono, String mail) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.mail = mail;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getMail() {
        return mail;
    }

    @Override
    public String toString() {
        return "Amigos{" +
                "nombre='" + nombre + '\n' +
                ", telefono='" + telefono + '\n' +
                ", mail='" + mail + '\n' +
                '}';
    }


}
