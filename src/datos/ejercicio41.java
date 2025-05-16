package datos;
import java.util.Scanner;

public class ejercicio41 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //constantes
        final int META = 10000;
        final double CALORIAS = 0.04;
        //variables
        String   nombre;
        int pasos;
        double calorias;
        System.out.println("Digita tu nombre");
        nombre= entrada.nextLine();

        System.out.println("Digita tus pasos caminados en el dia");
        pasos= entrada.nextInt();

        if (pasos >= META) {
            System.out.println("has cumplido tu meta de pasos "+nombre);
        }
        else {
            System.out.println("No has cumplido tu meta " +nombre);
        }

        calorias = pasos*CALORIAS;
        System.out.println("Las calorias quemadas fueron = " + calorias);
    }
}
