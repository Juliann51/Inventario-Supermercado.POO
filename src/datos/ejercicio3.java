package datos;
import java.util.Scanner;
public class ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Boolean  vip;
        String af;
        final float DESCCUENTO= 0.1F ;
        int articulos, saldo;
        System.out.println("Ingrese La Cantidad de Articulos Comprados: ");
        articulos = entrada.nextInt();
        System.out.println("Ingrese El Saldo Total de La Factura: ");
        saldo = entrada.nextInt();
        System.out.println("Cuentas Con El VIP (true(si) o false(no)): ");
        vip = entrada.nextBoolean();
        Boolean tienedescuento = articulos>=10 && vip == true;
        float saldofinal=saldo*DESCCUENTO;
        saldofinal= saldo-saldofinal;
        var x = tienedescuento ? saldofinal : saldo;
        var mensaje = tienedescuento? "su descuento es del 10%" : "no aplica al descuento";
        System.out.println( mensaje);
        int saldolconvertido = (int) x;
        System.out.println("El total a pagar = " + saldolconvertido);
        var afiliacion= vip? "" : "no estas afiliado, AFILIATE!!! ";
        System.out.println( afiliacion);

    }
}
