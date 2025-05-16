package Ejerciciosprogramacion;
import java.util.Scanner;


public class ejerciciofuncionees {
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Digite La Cantidad De Estudiantes A Evaluar");
        int numeroestudiantes = leer();
        cantidadcalificaciones(numeroestudiantes);
    }















    public static int leer() {
        double numero = Double.parseDouble(entrada.next().strip().replace(",", "."));
        int n = (int) numero;
        while (n < 0) {

            System.out.println("numero invalido vuelvalo a ingresar ");
            numero = Double.parseDouble(entrada.next().strip().replace(",", "."));
            n = (int) numero;
        }
        return n;
    }
    static int cantidadestudiantes() {
        System.out.println("Digite La Cantidad De Estudiantes A Evaluar");
        int numeroestudiantes = leer();
        cantidadcalificaciones(numeroestudiantes);
        return numeroestudiantes;
    }
    public static int cantidadcalificaciones(int cantidadestudiantes)  {
        System.out.println("Digite La Cantidad De Notas A Evaluar");
        int numerocalificaciones = leer();
        for (int i = 0; i < numerocalificaciones; i++) {
            System.out.println("digite la calificacion del estudiante"+i);
            int calificacion = leer();
        }
        return numerocalificaciones;

    }

}
