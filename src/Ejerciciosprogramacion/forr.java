package Ejerciciosprogramacion;
import java.util.Scanner;

public class forr {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("*** par  ***");

        //entero
        System.out.print(" Ingrese un numero ");
        int numero = entrada.nextInt();

        //proceso
        for (int i = 1 ;i<=numero; i++) {

                if (i % 2 == 0) {

                    System.out.println("numero  = " + i);

                }
            }
        }
    }

