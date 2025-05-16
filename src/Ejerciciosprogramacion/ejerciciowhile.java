package Ejerciciosprogramacion;
import java.util.Scanner;

public class ejerciciowhile {
    public static void main(String[] args) {
        float n, ps = 0, pn=0, na=0, nn=0, nc=0, i=1;
        while (i<=10) {
            Scanner entrada = new Scanner(System.in);
            System.out.println(".(digite un número)");
            n=entrada.nextInt();
            if (n>0) {
                na=na+n;
                ps=na/i; }
            if (n<0) {
                nn=nn+n;
                pn=nn/i; }
            if (n==0)  {
                nc=nc+1;
            }
            i++;

        }
        System.out.println("el promedio de los positivos es " + ps );
        System.out.println("el promedio de los negativos es " + pn  );
        System.out.println("la cantidad de ceros es " + nc  );
    }
}
