package Ejerciciosprogramacion;
import java.util.Scanner;

public class ejemplofunciones {
    static Scanner entrada = new Scanner(System.in);
    //----------------------------------------------------------------------------------------------------
    //leer

    public static int curso (){
        Scanner entrada = new Scanner(System.in);
        double numero = Double.parseDouble(entrada.next().strip().replace(",", "."));
        int n=(int) numero;
        while (n < 6 || n>11) {

            System.out.println("curso invalido vuelvalo a ingresar ");
            numero = Double.parseDouble(entrada.next().strip().replace(",", "."));
            n=(int) numero;

        }
        return n;
    }
    public static double normalizarnota(){
        Scanner entrada = new Scanner(System.in);
        double numero = Double.parseDouble(entrada.next().strip().replace(",", "."));

        while (numero < 0 || numero>5 ) {

            System.out.println("nota invalida vuelvala a ingresar ");
            numero = Double.parseDouble(entrada.next().strip().replace(",", "."));


        }
        return numero;
    }
    public static int normalizar(){
        Scanner entrada = new Scanner(System.in);
        double numero = Double.parseDouble(entrada.next().strip().replace(",", "."));
        int n=(int) numero;
        while (n <= 0 ) {

            System.out.println("numero invalido vuelvalo a ingresar ");
            numero = Double.parseDouble(entrada.next().strip().replace(",", "."));
            n=(int) numero;

        }
        return n;
    }
    //_---------------------------------------------------------------------------------------------------

    //proceso


    //main
    public static void main(String[] args) {
        System.out.println("cuantos estudiantes... ");
        int estudiantes= normalizar();
        datosestudiante(estudiantes);

    }

    //ingresar datos del estudiante(nombre, edad, curso, cantidad de notas, notas) (FUNCION PRINCIPAL)
    public static int datosestudiante(int estudiantes) {
        int numeronotas = 0;
        String nombres[] = new String[estudiantes];
        int edades[] = new int[estudiantes];
        int cursos[] = new int[estudiantes];
        for (int i = 0; i < estudiantes; i++) {
            System.out.println("nombre del estudiante " + (i + 1));
            nombres[i] = entrada.nextLine().trim();
            System.out.println("digite la edad del estudiante " + nombres[i]);
            edades[i] = normalizar();

            System.out.println("ingrese la cantidad de notas de " + nombres[i]);
            numeronotas = normalizar();

            //pedir notas
            double notas[] = new double[numeronotas];
            double suma = 0;
            double mayor = 0, menor = 0;
            for (int j = 0; j < numeronotas; j++) {

                System.out.println("ingrese nota numero "+(i+1)+" de (0 a 5) " );
                notas[j] = normalizarnota();
                if (notas[j] > mayor) {
                    mayor=notas[j];
                }
                if (notas[j] < mayor) {
                    menor=notas[j];
                }
                suma += notas[j];

            }
            double promedio = suma / numeronotas;
            boolean pasar = pasa(promedio);
            imprimir(estudiantes, edades[i], nombres[i], cursos[i], pasar, promedio,mayor,menor);
            System.out.println("---------------------------------------------");
        }
        return numeronotas;
    }


    //el estudiante pasa??
    public static boolean pasa (double promedio) {
        if (promedio >= 3) {
            return true;
        }
        return false;
    }


    //imprimir_todo

    public static void imprimir(int estudiantes, int edad, String nombres, int curso, boolean pasa, double promedio, double mayor, double menor){
        for (int i = 0; i < estudiantes; i++) {
            System.out.println(" el estudiante "+nombres+" tiene "+ edad+ " años y es del curso "+curso+
                    " el estudiante "+ (pasa?"pasa el curso":"no pasa el curso ")+" con un promedio de "+promedio+", su " +
                    "nota mayor fue "+ mayor+ " y su nota menor fue " + menor);
        }
    }



}

