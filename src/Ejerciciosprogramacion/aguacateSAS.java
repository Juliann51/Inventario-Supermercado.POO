package Ejerciciosprogramacion;
import java.util.Scanner;
public class aguacateSAS {
    static Scanner entrada = new Scanner(System.in);
    //funciones normalizar datos

    static double horasnormales() {
        Scanner entrada = new Scanner(System.in);
        double numero = Double.parseDouble(entrada.next().strip().replace(",", "."));
        while (numero < 0.0 || numero > 52.0) {
            System.out.println(" Digite nuevamente horas normales trabajadas");
            numero = Double.parseDouble(entrada.next().strip().replace(",", "."));
        }
        return numero;
    }

    public static int leer() {
        Scanner entrada = new Scanner(System.in);
        double numero = Double.parseDouble(entrada.next().strip().replace(",", "."));
        int n = (int) numero;
        while (n < 0) {

            System.out.println("numero invalido vuelvalo a ingresar ");
            numero = Double.parseDouble(entrada.next().strip().replace(",", "."));
            n = (int) numero;
        }
        return n;
    }
    //------------------------------------------------------------------------------------------------------------
    //funcion principal donde llegan las funciones
    public static void main(String[] args) {
        System.out.println("------ SISTEMA DE NOMINA AGUACATE S.A.S------");

        System.out.println("Digite La Cantidad De Empleados");
        //declaracion variables String
        int numeroempleados = leer();
        String nombre[]= new String[numeroempleados];
        String documento[]=new String[numeroempleados];
        String mayorsueldo = "";
        String menorsueldo="" ;
        //declaracion variables double
        double horasextras[] = new double[numeroempleados];
        double horas[]=new double[numeroempleados];
        double salariobase[]=new double[numeroempleados];
        double salarioextra[]=new double[numeroempleados];
        double salariototal[]=new double[numeroempleados];
        double suma=0;
        double promedio;
        double mayor=0;
        double menor =0;

        //contantes

        final int HORAS = 25000;
        final int HORASEXTRAS = 40000;

        //llamada funciones

        for (int i = 0; i < numeroempleados; i++) {

            System.out.println("----- Empleado " + (i+1) + " -----");
            nombre[i]=nombre(numeroempleados);
            documento[i]=documento(numeroempleados);
            horas[i] = horas(numeroempleados);

            //validacion horas extra

            if ( horas[i] > 40) {
                horasextras[i] = horas[i]- 40;
                horas[i] -= horasextras[i];
            }
            //operaciones salario
            salariobase[i]=horas[i]*HORAS;
            salarioextra[i]=horasextras[i]*HORASEXTRAS;
            salariototal[i]=salariobase[i]+salarioextra[i];
            suma+=salariototal[i];
            //hallar mayor menor
            mayor= salariototal[0];
            menor = salariototal[0];
            if (salariototal[i] > mayor) {
                mayor = salariototal[i];
                mayorsueldo = nombre[i];
            }
            if (salariototal[i] < menor) {
                menor=salariototal[i];
                menorsueldo=nombre[i];
            }
        }

        promedio=suma/numeroempleados;

        // imprimir las cada uno
        for (int i = 0; i < numeroempleados; i++) {

            imprimirempleados(nombre[i],documento[i],horas[i],salariototal[i],salariobase[i],salarioextra[i]);

        }
        // imprimir general
        imprimirdatosempresa(suma,promedio,mayorsueldo,menor,mayor,menorsueldo);

    }
    // Funciones para solicitar datos

    static String nombre(int numeroempleado) {
        String nombre[] = new String[numeroempleado];

        for (int i = 0; i <= numeroempleado; i++) {
            System.out.println(" Digite El Nombre Del empleado");
            nombre[i] = entrada.nextLine().trim();
            return nombre[i];
        }
        return null;

    }

    static String documento(int numeroempleado) {
        String documento[] = new String[numeroempleado];

        for (int i = 0; i < numeroempleado; i++) {
            System.out.println(" Digite El documento Del empleado");
            documento[i] = entrada.nextLine().trim().replace(".", "").replace(",", "");
            while (documento[i].length() != 10) {
                System.out.println("dijite el documento nuevamente ");
                documento[i] = entrada.nextLine().trim().replace(".", "").replace(",", "");
            }
            return documento[i];
        }

        return null;

    }

    static double horas(int numeroempleado) {
        double[] horas = new double[numeroempleado];

        for (int i = 0; i < numeroempleado; i++) {
            System.out.println(" ingrese horas ");
            horas[i] = horasnormales();

            return horas[i];
        }
        return 0;
    }
    //funciones para imprimir

    static void imprimirempleados (String nombre, String documento, double horas, double salariototal, double salariobase, double salariosextra){
        System.out.println("El empleado "+nombre);
        System.out.println("Con numero de documento  "+ documento+" de la empresa aguacates frank SAS");
        System.out.println(" trabajo un total de  "+horas+" horas base a la semana");
        System.out.printf("obteniendo un sueldo base de %.2f pesos\n", salariobase);
        System.out.printf(" y cobrando un total de %.2f pesos en horas extras\n", salariosextra);
        System.out.printf("se le debe pagar un total de %.2f pesos\n",salariototal);
        System.out.println("--------------------------------------------------------------------------------");
    }
    // imprimir general

    static void  imprimirdatosempresa(double suma, double promedio, String mayorsueldo, double menor, double mayor, String menorsueldo  ){
        System.out.println();
        System.out.printf(" El total a pagar es %.2f",suma);
        System.out.printf(" el promedio de los salarios de la semana es %.2f",promedio);
        System.out.printf(" el empleado con mayor sueldo es %s con un sueldo de %.2f\n",mayorsueldo,mayor);
        System.out.printf(" el empleado con menor sueldo es %s con un sueldo de %.2f\n",menorsueldo,menor);
        System.out.println("------------GRACIAS POR UTILIZAR NUESTRO PROGRAMA MERECEMOS UN HERMOSO 5.0-------------------");

    }

}
