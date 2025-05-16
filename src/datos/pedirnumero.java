package datos;

import java.util.Scanner;

public class pedirnumero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int c;

        System.out.println("*** multiiplo de 3  ***");

        //entero
        System.out.print(" Ingrese un numero ");
        var numero = entrada.next().strip();
        var contador=Integer.parseInt(numero);
        contador=Math.abs(contador);
        System.out.println("ingresa un texto");
        var texto = entrada.next().strip().toLowerCase();
        c=texto.length();
        //proceso
        for (int i = 1; i <= contador; i++) {
            if (i%3==0 && i%5==0) {
                System.out.println(c);

            }else if (i%3==0) {
                System.out.println(texto.toLowerCase());

            }else if (i%5==0) {
                System.out.println(texto.toUpperCase());

            }else
            System.out.println(i);

        }

    }
}



