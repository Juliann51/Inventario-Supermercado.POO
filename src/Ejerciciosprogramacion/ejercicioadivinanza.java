package Ejerciciosprogramacion;
import java.util.Scanner;

public class ejercicioadivinanza {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("*** ADIVINANZA  ***");

        // declarar variables
        final int MAX= 10;
        int numero;
        Integer oculto = (int) (Math.random()*99+1);//numero azar

        for (int i = 1; i <= MAX; i++) {
            System.out.println("introduzca un numero de 1 a 100");
            numero= entrada.nextInt();
            if (numero <= 100 && numero < oculto && numero>=0) {
                System.out.println("el numero es menor que numero secreto ");

            } else if ( numero <= 100 && numero > oculto && numero>=0) {
                System.out.println(" el numero ingrresadp es mayor que el numero secreto, llevas "+i+" intentos");

            }
            else if (numero <= 100 && numero>=0 ){
                System.out.println(" felicidades adivinaste a numero secreto, llevas "+i+" intentos");
                i=10;
            }
            else {
                System.out.println("numero invalido");
                i=10;

            }
        }
        System.out.println("el numero oculto era = " + oculto);
    }
}
