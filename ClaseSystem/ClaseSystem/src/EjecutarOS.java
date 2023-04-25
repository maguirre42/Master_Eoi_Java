public class EjecutarOS {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        Process proceso;
        try {
            if(System.getProperty("os.name").toLowerCase().contains("windows")){ // Windows
                proceso = rt.exec("calc"); // notepad
            }else{ // macOS o Linux
                proceso = rt.exec("open -a Calculator"); // Notes
            }
            proceso.waitFor();
        }catch(Exception e){
            System.out.println("Comando desconocido: " + e.getLocalizedMessage());
            System.exit(1);
        }

    }
}
