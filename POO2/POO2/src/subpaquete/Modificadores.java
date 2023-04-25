package subpaquete;

 public class Modificadores {
    public String nombre;
    protected String apellidos;
    private int edad;

    public void nombreCompleto(){
        System.out.println(nombre + " " + apellidos + " y tiene " + edad + "años");
    }

    public Modificadores(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public void llamaTonteria(){
        tonteria();
    }

    private void tonteria(){
        System.out.println("Hola!");
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

     @Override
     public String toString() {
         return "Modificadores{" +
                 "nombre='" + nombre + '\'' +
                 ", apellidos='" + apellidos + '\'' +
                 ", edad=" + edad +
                 '}';
     }
 }
