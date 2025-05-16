package Ejerciciosprogramacion;
import java.util.Scanner;

public class clase3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("*** escalera  ***");

        System.out.println("introduzca un numero");
        var destino = entrada.nextLine().strip();
        int n1=Integer.parseInt(destino);
        n1=Math.abs(n1);
        for (int i = 1; i <=n1; i++) {

            System.out.println(" ");

            for (int j = 1; j <= i; j++) {

                System.out.print(j);

                }
            }


        }
    }

