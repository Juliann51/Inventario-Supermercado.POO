package Ejerciciosprogramacion;
import java.util.Scanner;

public class identificarestacionaño {

    public static void main(String[] args) {

        System.out.println("  estacion del año  ");

        Scanner entrada = new Scanner(System.in);

        String estacion = "";
        int mes;

        System.out.print(" proporciona el valor del mes (1 - 12) : ");
        mes = entrada.nextInt();

        if (mes == 1 || mes == 2 || mes == 12) {
            estacion = "invierno";
        }

        else if (mes == 3 || mes == 4 || mes == 5) {
            estacion = "primavera";
        }

        else if (mes == 6 || mes == 7 || mes == 8) {
            estacion = "verano";
        }
        else if (mes == 9 || mes == 10 || mes == 11) {
            estacion = "otoño";
        }
        else
            estacion = "estacion desconocida";

        //imprimir resultados
        System.out.printf( " la estacion para el mes %d es %s",mes,estacion);
    }
}

