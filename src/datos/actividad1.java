package datos;
import java.util.Scanner;
public class actividad1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String n, e, d;
        System.out.println("Ingrese el nomnbre: ");
        n = entrada.nextLine();
        System.out.println("Ingrese su empresa: ");
        e = entrada.nextLine();
        System.out.println("Ingrese el dominio: ");
        d = entrada.nextLine();
        String n1 = n.trim();
        String n2 = n1.replace(" ", ".");
        String e1 = e.replace(" ", "");
        String correo = n2 + "@" + e1 + "." + d;
        String minuscula = correo.toLowerCase();
        System.out.println("tu correo es = " + minuscula);
    }
}
