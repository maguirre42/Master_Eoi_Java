public enum TipoCoche {
    SEDAN("Sedan","Mediano",4),
    STATION_WAGON("Familar","Grande",5),
    HATCHBACH("Hatchback","Compacto",5),
    PICKUP("PickUp","Furgoneta abierta",2),
    COUPE("Coupé","Deportivo",2),
    SUV("SUV","Todo terreno urbano",5);

    private final String nombre;
    private final String descripcion;
    private final int numPuertas;

    TipoCoche(String nombre, String descripcion, int numPuertas) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.numPuertas = numPuertas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getNumPuertas() {
        return numPuertas;
    }
}
