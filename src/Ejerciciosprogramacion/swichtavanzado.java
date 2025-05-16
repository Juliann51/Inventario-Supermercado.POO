package Ejerciciosprogramacion;
import java.util.Scanner;

public class swichtavanzado {
    public static void main(String[] args) {
        System.out.println("  estacion del año  ");

        Scanner entrada = new Scanner(System.in);

        int mes;

        System.out.print(" proporciona el valor del mes (1 - 12) : ");
        mes = entrada.nextInt();

        var estacion = switch (mes) {
            case 1,2,12 -> "invierno";
            case 3,4,5 -> "primavera";
            case 6,7,8 -> "verano";
            case 9,10,11 -> "otoño";
            default -> "estacion desconocida";
         };
        //imprimir resultado
        System.out.printf( " la estacion para el mes %d es %s",mes,estacion);
     }
 }
