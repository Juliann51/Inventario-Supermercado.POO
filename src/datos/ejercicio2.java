package datos;
import java.util.Scanner;
public class ejercicio2 {
    public static void main(String[] args) {
        System.out.println("***  valor dentro del rango ***");

        //definir limites
        final var MINIMO = 0;
        final var MAXIMO = 10;

        //solicitar numero a evaluar
        System.out.println("ingrese un numero entero");
        var datos = Integer.parseInt(new Scanner(System.in).nextLine());

        //verificar si el numero esta en el rango
        Boolean dentrorango = datos >= MINIMO && datos <= MAXIMO;
        System.out.println("dentrorango = " + dentrorango);
    }
}
