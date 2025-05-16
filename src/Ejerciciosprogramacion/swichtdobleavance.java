package Ejerciciosprogramacion;
import java.util.Scanner;

public class swichtdobleavance {
    public static void main(String[] args) {
        //constantes
        final Double TARIFA_NACIONAL = 10000.0;
        final Double TARIFA_INTERNACIONAL = 20000.0;

        //solicitar valores de destino y peso}

        Scanner entrada = new Scanner(System.in);
        System.out.println("*** sistema de envios ***");

        System.out.print(" Ingrese el destino del paquete (nacional/internacional):  ");
        var destino = entrada.nextLine().strip().toLowerCase();

        System.out.println(" Ingrese el peso del paquete (en kg). ");
        var peso = Double.parseDouble(entrada.nextLine());

        var costoenvio = switch (destino) {
            case  "nacional" -> peso*TARIFA_NACIONAL;
            case "internacional" -> peso*TARIFA_INTERNACIONAL;
            default ->  {
                System.out.println("Destino es inválido. Ingresa nacional/internacional");
                yield null;
            }
        };
        //mostrar resultado de costo de envio
        if (costoenvio!=null)
        System.out.printf( " El costo de envio de paquete es : $%.2f, ",costoenvio);
    }
}
