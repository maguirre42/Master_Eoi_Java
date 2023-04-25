public class Coche1 {
    // Atributos (estado/características)
    private String marca;
    private String modelo;
    private String color;
    private String carroceria;
    float potencia;
    float cilindrada;
    String combustible;
    float rpm = 0;
    private float km;
    private float deposito;
    final static String eCall = "112";
    static String distintivo = "E";
    private String numeroSerie;

    // Constructores
    public Coche1(){
        this.km = 4;
    }

    public Coche1(String marca){
        this();
        this.marca = marca;
    }

    public Coche1(String marca,String modelo){
    //    this();
    //    this.marca = marca;
        this(marca);
        this.modelo = modelo;
    }

    public Coche1(String marca, String modelo, String color, String carroceria, float potencia, float cilindrada, String combustible, float deposito) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.carroceria = carroceria;
        this.potencia = potencia;
        this.cilindrada = cilindrada;
        this.combustible = combustible;
        this.deposito = deposito;
    }

    public Coche1(String marca, String modelo, String color, String carroceria, float potencia, float cilindrada, String combustible, float deposito, String numeroSerie) {
        this(marca,modelo,color,carroceria,potencia,cilindrada,combustible,deposito);
        this.numeroSerie = numeroSerie;
    }

    public Coche1(String marca, String modelo, String color, String carroceria, float potencia, float cilindrada, String combustible, float rpm, float km, float deposito, String numeroSerie) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.carroceria = carroceria;
        this.potencia = potencia;
        this.cilindrada = cilindrada;
        this.combustible = combustible;
        this.rpm = rpm;
        this.km = km;
        this.deposito = deposito;
        this.numeroSerie = numeroSerie;
    }

    // Getter y Setter (encapsulado)

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }

    public float getKm() {
        return km;
    }

//    public void setKm(float km) {
//        this.km = km;
//    }

    public float getDeposito() {
        return deposito;
    }

    public void setDeposito(float deposito) {
        this.deposito = deposito;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    // Métodos ("comportamiento")
    public void arrancar(){
        this.rpm = 800;
    }

    public void acelerar(float rpm){
        this.rpm += rpm;
    }

    public void frenar(float deceleracion){
        this.rpm -= deceleracion;
    }

    public String detallesCoche(){
        return "Marca: " + this.marca + "\nModelo: " + this.modelo + "\nColor: " + this.color;
    }

    public static void llamarEmergencias(){
        System.out.println("Hago un llamada al " + eCall);
    }

    public float consumo(float distancia){
        // siempre lleno el doposito y siempre lo vacio
        this.km += distancia;
        return (this.deposito / distancia) * 100;
    }

    public float consumo(float distancia, float repostado){
        this.km += distancia;
        return repostado / distancia * 100;
    }

    // toString


    @Override
    public String toString() {
        return "Coche1{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", carroceria='" + carroceria + '\'' +
                ", potencia=" + potencia +
                ", cilindrada=" + cilindrada +
                ", combustible='" + combustible + '\'' +
                ", rpm=" + rpm +
                ", km=" + km +
                ", deposito=" + deposito +
                ", numeroSerie='" + numeroSerie + '\'' +
                '}';
    }
}
