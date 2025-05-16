package Ejerciciosprogramacion;

import java.util.Scanner;

public class maincalculadora {
    static double leer() {
        Scanner entrada = new Scanner(System.in);
        double numero = Double.parseDouble(entrada.next().strip().replace(",", "."));

        return numero;
    }
    public static void main(String[] args) {
        System.out.println(" *** Sistema Calculadora ***");
        System.out.println(" Digite numero 1");

        Double numero1 = leer();
        System.out.println(" Digite numero 2");
        Double numero2 = leer();

        CalculadoraObjeto calcular = new CalculadoraObjeto( numero1, numero2);

        calcular.suma();
        calcular.resta();
        if (numero2 != 0) {
            calcular.division();
        }else
            System.out.println("division invalida");

        calcular.multiplicacion();
    }
}
