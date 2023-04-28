public class EjemploSwitch {
    public static void main(String[] args) {
        // Declaracion variables
        int mes = 4;
        String nombreMes = "";
        // Declaracion estructura Switch
        switch (mes){
            case 1:
                nombreMes = "Enero";
                break;
            case 2:
                nombreMes = "Febrero";
                break;
            case 3:
                nombreMes = "Marzo";
                break;
            case 4:
                nombreMes = "Abril";
                break;
            case 5:
                nombreMes = "Mayo";
                break;
            default:
                nombreMes = "después de Mayo";
        }
        System.out.println("nombreMes = " + nombreMes);

        // if .. else if
        if(mes == 1){
            nombreMes = "Enero";
        }else if(mes == 2){
            nombreMes = "Febrero";
        }else if(mes == 3){
            nombreMes = "Marzo";
        }else if(mes == 4){
            nombreMes = "Abril";
        }else if(mes == 5){
            nombreMes = "Mayo";
        }else{
            nombreMes = "después de Mayo";
        }
        System.out.println("nombreMes = " + nombreMes);
        
        // Comentarios notas
        int nota = 8;
        String comentario = "";
        
        switch (nota){
            case 10:
                comentario = "Matrícula de Honor";
                break;
            case 9:
                comentario = "Sobresaliente";
                break;
            case 8:
            case 7:
                comentario = "Notable";
                break;
            case 6:
            case 5:
                comentario = "Aprobado";
                break;
            default:
                comentario = "Supenso";
        }
        System.out.println("comentario = " + comentario);


        // con String
        String camiseta = "verde";
        String serigrafia = "";

        switch (camiseta){
            case "roja":
                serigrafia = "blanco";
                break;
            case "verde":
                serigrafia = "amarillo";
                break;
        }
        System.out.println("serigrafia = " + serigrafia);
    }
}
