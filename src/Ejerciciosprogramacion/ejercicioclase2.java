package Ejerciciosprogramacion;
import java.util.Scanner;

public class ejercicioclase2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("*** Calculadora  ***");

        //datos de entrada n1 n2 y operador
        System.out.print(" Digite el primer numero:  ");
        var n1= Double.parseDouble(entrada.next().replace(",","."));


        System.out.print(" Digite operacion a realizar(+,-,*,/,%):  ");
        var o = entrada.next().strip().toLowerCase().replace(",",".");

        System.out.print(" Digite el segundo numero:  ");
        var n2= Double.parseDouble(entrada.next().replace(",","."));

        //validar division por 0

         if ( o.equals("/") && n2==0 ) {
            System.out.println("division invalida");
        }
        else if( o.equals("%") && n2==0 ) {

            System.out.println("mod invalida");
        }
         //proceso
        else if(o.equals("+") || o.equals("-") || o.equals("/") || o.equals("*") || o.equals("%")  )  {
             var resultado = switch (o) {
                 case "+" -> n1 + n2;
                 case "-" -> n1 - n2;
                 case "*" -> n1 * n2;
                 case "/" -> n1 / n2;
                 case "%" -> n2 % n1;
                 default -> 0 ;

             };
             //imprimir resultado
             System.out.printf(" la operacion  %.2f %s %.2f es igual %.2f", n1, o, n2, resultado);
         }else {
                 System.out.println("operador invalido");
             }


        }
                 
    }

