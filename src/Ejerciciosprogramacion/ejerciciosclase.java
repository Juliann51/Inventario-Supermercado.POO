package Ejerciciosprogramacion;
import java.util.Scanner;

public class ejerciciosclase {
    public static void main(String[] args) {
        //solicitar valor  dia}

        Scanner entrada = new Scanner(System.in);
        System.out.println("*** SISTEMA LABORAL  ***");

        System.out.print(" Indica del (1 al 7) para los dias de la semana:  ");
        var dias = entrada.nextInt();

        //pasar de domingo a lunes
        if (dias == 7){
            dias=1;
        } else {
            dias++;
        }

        //validar laboral o fin de semana
       var laboral =  switch (dias) {
           case 1,2,3,4,5 -> "DIA LABORAL";
           case 6,7 -> " FIN DE SEMANA ";
           default -> "";

       };
        //validar dia
       var semana =switch (dias){
           case 1 -> "LUNES";
           case 2 -> "MARTES";
           case 3 -> "MIERCOLES";
           case 4 -> "JUEVES";
           case 5 -> "VIERNES";
           case 6 -> "SABADO";
           case 7 -> "DOMINGO";
           default -> "";
       };
        //imprimir resultados
        if (dias >=8) {
            System.out.println("DIA INVALIDO");
        }
        else {
            System.out.printf( " EL DIA  %d ES %s Y ES %s",dias,semana,laboral);
        }
    }
}
