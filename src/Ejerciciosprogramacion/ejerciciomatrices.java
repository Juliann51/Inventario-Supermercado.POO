package Ejerciciosprogramacion;
import java.util.Scanner;
public class ejerciciomatrices {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("*** proporcione la cantidad de elementos  ***");
        var largoarreglo = Double.parseDouble(entrada.nextLine().trim().replace(",","."));
        int fil=(int) largoarreglo;
        var columna = Double.parseDouble(entrada.nextLine().trim().replace(",","."));
        int col=(int) columna;

        //crear arreglo
        int[][] edades = new int[fil][col];

        //lectura datos
        System.out.println("-------- Lectura de datos --------");

        for (var i = 0; i < fil; i++) {
            System.out.println("-------- Digite las edad-------- ");
          //  edades[i][j] = Integer.parseInt(entrada.nextLine());
        }


        System.out.println(" -------- impresion edades--------");
        for (int i = 0; i < largoarreglo; i++) {
            System.out.println(" las edades son: "  +edades[i]);
        }

    }
}
