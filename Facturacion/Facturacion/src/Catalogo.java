public enum Catalogo {
    PORTATIL("Ordenador Portátil i7, 32GB RAM, 1T HDD",799.99f),
    PANTALLA("Pantalla LED FullHD 24\"", 158.00f),
    RATON("Ratón inalámbrico de 1200dpi", 10.45f),
    HDD("Disco SSD 1T SATA", 89.99f);

    // Atributos
    private String descripcion;
    private float precio;

    // Constructor
    Catalogo(String descripcion, float precio) {
        this.descripcion = descripcion;
        this.precio = precio;
    }

    // getters
    public String getDescripcion() {
        return descripcion;
    }

    public float getPrecio() {
        return precio;
    }
}
