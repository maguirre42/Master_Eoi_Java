public class EjemploWhile {
    public static void main(String[] args) {
        // Recorrer los 20 primeros números naturales
        // while
        int contador = 0;
        while(contador <= 20){
            System.out.println("contador = " + contador);
            contador++;
        }
        System.out.println("--------------------------");

        //do .. while
        contador = 0;
        do{
            System.out.println("contador = " + contador);
            contador++;
        }while(contador <= 20);
        System.out.println("--------------------------");

        // Recorrer matriz
        String[] coches = {"Volvo","Renault","Seat","Citroen"};
        // while
        int i = 0;
        while (i < coches.length){
            System.out.println("coches[" + i +"] = " + coches[i]);
            i++;
        }
        System.out.println("--------------------------");
        // do .. while
        i = 0;
        do{
            System.out.println("coches[" + i +"] = " + coches[i]);
            i++;
        }while(i < coches.length);
        System.out.println("--------------------------");

        // Diferente condicion salida
        boolean salir = false;
        i = 0;
        //while(salir == false){
        while(!salir){
            System.out.println("coches[" + i +"] = " + coches[i]);
            if(coches[i] == "Seat"){
                //salir = true;
                salir = !salir;
            }
            i++;
        }
        System.out.println("--------------------------");

        // break y continue
        // break
        for(String marca:coches){
            if(marca == "Seat"){
                break;
            }
            System.out.println("marca = " + marca);
        }
        System.out.println("--------------------------");

        i = 0;
        while (i < coches.length){
            System.out.println("coches[" + i +"] = " + coches[i]);
            if(coches[i] == "Seat") break;
            i++;
        }
        System.out.println("--------------------------");

        // continue
        for(String marca:coches){
            if(marca == "Seat"){
                continue;
            }
            System.out.println("marca = " + marca);
        }
        System.out.println("--------------------------");

        i = 0;
        while (i < coches.length){
            if(coches[i] == "Seat"){
                i++;
                continue;
            }
            System.out.println("coches[" + i +"] = " + coches[i]);
            i++;
        }

        System.out.println("--------------------------");
        System.out.println("Resto del programa");

    }
}
