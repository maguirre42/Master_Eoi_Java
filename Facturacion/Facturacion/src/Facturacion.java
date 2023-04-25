import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Facturacion {
    // 1 - Introducir los datos del cliente por consola y mostarlos
    // a - leo los datos en variables independientes y uso constructor
    // b - creo objeto cliente vacio y voy rellenando con los datos introducidos

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce datos del cliente:");
        String nombre = introduceDato("Nombre", entrada);
        String apellidos = introduceDato("Apellidos",entrada);
        String dni = introduceDato("DNI",entrada);
        String direccion = introduceDato("Dirección",entrada);
        String email = introduceDato("Email",entrada);
        Cliente comprador = new Cliente(nombre,apellidos,dni,direccion,email);
        //System.out.println(comprador.toString());

        System.out.println("\n\nIntroduce los productos:");
        //LineaFactura[] lineasFactura = new LineaFactura[10]; // Dimensión fija - out of bounds
        ArrayList<LineaFactura> lineasFactura = new ArrayList<>();
        boolean salir = false;
        //int indice = 0; // solo para almacenar lines factura en array fijo
        while (salir != true) {
            int uds = Integer.parseInt(introduceDato("Unidades (0=Salir)",entrada));
            if(uds == 0) {
                salir = true;
            }else {
                String tipoProducto = introduceDato("Tipo de producto: 1 - Portátil, 2 - Pantalla, 3 - Ratón, 4 - HDD",entrada);
                Catalogo producto;
                switch (tipoProducto) {
                    case "1":
                        producto = Catalogo.PORTATIL;
                        break;
                    case "2":
                        producto = Catalogo.PANTALLA;
                        break;
                    case "3":
                        producto = Catalogo.RATON;
                        break;
                    case "4":
                        producto = Catalogo.HDD;
                        break;
                    default:
                        producto = Catalogo.RATON;
                }
                LineaFactura linea = new LineaFactura(uds, producto.getDescripcion(), producto.getPrecio());
                lineasFactura.add(linea);
                //lineasFactura[indice] = linea; // Array (estático)
                //indice++;
                //System.out.println(linea.toString());
            }
        }

        // Imprimir factura

        System.out.println("\n\n------------------------------------------\n\n");
        System.out.println(comprador.toString() + '\n');
        System.out.println("Factura Nº: " + numeroFactura(8) + + '\n');
        System.out.println("Fecha: " + fechaHoy() + + '\n');
        System.out.println("Uds     Descripción                 Unitario    Total");
        // imprimir lineas factura
        float totalFactura = 0;
        for (LineaFactura lin:lineasFactura){
            if(lin != null){
                System.out.println(lin.toString());
                totalFactura += lin.getTotalLinea();
            }
        }


        // imprime totales
        float tipoIVA = 21;
        float cantidadPagar = totalFactura * (1 + tipoIVA / 100); //totalFactura + totalFactura * tipoIVA / 100;

/*        System.out.println("totalFactura " + totalFactura +
                            "\nIVA " + (totalFactura * tipoIVA / 100) +
                            "\nA pagar " + cantidadPagar) ;
*/
        System.out.printf("\nTotal Factura \t %.2f\nIVA \t\t\t %.2f\nA pagar \t\t %.2f",totalFactura,(totalFactura * tipoIVA / 100),cantidadPagar);

        entrada.close();
    }

    public static String introduceDato(String mensaje, Scanner ent){
        //Scanner entrada = new Scanner(System.in);
        System.out.print(mensaje + ": ");
        return ent.nextLine();
    }

    public static String numeroFactura(int longitud){
        String base = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random k = new Random();
        String numero = "";
        for(int i = 0; i < longitud; i++){
            int aleatorio = k.nextInt(base.length());
            numero += base.charAt(aleatorio);
        }
        return numero + "/2023";
    }

    public static String fechaHoy(){
        DateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String fecha = formato.format(new Date());
        return fecha;
    }

    // TODO
    // generar el número de factura
    // obtener la fecha actual
    // imprimir factura completa


}
