public class Coche {
    // Atributos (estado/características)
    String marca;
    String modelo;
    String color;
    String carroceria;
    float potencia;
    float cilindrada;
    String combustible;
    float rpm = 0;
    float km;
    float deposito;
    final static String eCall = "112";
    static String distintivo = "E";

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
        return (this.deposito / distancia) * 100;
    }

    public float consumo(float distancia, float repostado){
        return repostado / distancia * 100;
    }
}
