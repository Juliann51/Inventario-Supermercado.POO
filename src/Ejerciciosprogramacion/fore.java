package Ejerciciosprogramacion;
import java.util.Scanner;

public class fore {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        System.out.println("*** numero mayor  ***");

        //entero
        System.out.print(" cuanto numeros desea  introducir");
        var x = entrada.nextLine().strip();
        var contador=Integer.parseInt(x);
        contador=Math.abs(contador);

        System.out.println("introduzca esos numeros separados por enter");
        var n1=entrada.nextInt();
        for (int i = 0; i <= contador ; i++) {
            var n= entrada.nextInt();
            if (n <n1) {

                System.out.printf("el %d es menor que el %d ",n,n1);

            } else if (n==n1) {
                System.out.printf("el %d es igual que el %d ",n,n1);

            }


        }




        //System.out.println("n1 = " + n1);
        }
    }

