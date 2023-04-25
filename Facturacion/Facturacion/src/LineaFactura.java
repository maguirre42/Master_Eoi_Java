public class LineaFactura {
    // Atributos
    private int uds;
    private String descripcion;
    private float unitario;
    private float totalLinea;

    // Constructor
    public LineaFactura(int uds, String descripcion, float unitario) {
        this.uds = uds;
        this.descripcion = descripcion;
        this.unitario = unitario;
        this.totalLinea = uds * unitario;
    }

    // Métodos
    public String getDescripcion() {
        return descripcion;
    }

    public float getUnitario() {
        return unitario;
    }

    public float getTotalLinea() {
        return totalLinea;
    }

    public String toString(){
        return uds + "\t\t" + descripcion + "\t\t" + unitario + "\t\t"+ totalLinea;
    }


}
