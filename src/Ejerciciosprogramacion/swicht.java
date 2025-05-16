package Ejerciciosprogramacion;
import java.util.Scanner;

public class swicht {
    public static void main(String[] args) {

        System.out.println("  estacion del año  ");

        Scanner entrada = new Scanner(System.in);

        String estacion = "";
        int mes;

        System.out.print(" proporciona el valor del mes (1 - 12) : ");
        mes = entrada.nextInt();

       switch (mes) {
           case 1,2,12 :
               estacion= "invierno";
               break;

           case 3,4,5:
            estacion="primavera";
            break;

           case 6,7,8 :
               estacion="verano";
               break;

           case 9,10,11 :
               estacion="otoño";
               break;
           default:
            estacion="estacion desconocida";

       }
       //imprimir resultado
        System.out.printf( " la estacion para el mes %d es %s",mes,estacion);
    }
}
