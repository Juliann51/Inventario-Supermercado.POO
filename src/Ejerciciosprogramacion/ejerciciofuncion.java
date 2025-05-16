package Ejerciciosprogramacion;

import java.util.Scanner;

public class ejerciciofuncion {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("------ SISTEMA DE CALIFICACIONES------");
       // cantidadestudiantes();
        System.out.println("Digite La Cantidad De Estudiantes A Evaluar");
        int numeroestudiantes = leer();
        for (int i = 1; i <= numeroestudiantes; i++) {
            System.out.println("----- Estudiante " + i + " -----");
            datosestudiante();
        }
    }
    //funciones

    static void datosestudiante() {


        System.out.println(" Digite El Nombre Del Estudiante");
        String nombre = entrada.nextLine().trim();
        System.out.println(" Digite La Edad Del Estudiante");
        int edad = leer();
        System.out.println(" Ingrese Curso Al Que Pertenece de 6 a 11(secundaria)");
        int curso = Integer.parseInt(entrada.nextLine().trim());
        while (curso < 6 && curso > 11) {
            System.out.println("Curso No Encontrado Digite Curso Nuevamente ");
            curso = Integer.parseInt(entrada.nextLine().trim());
        }
        System.out.println("Ingrese La Cantidad De Notas");
        int cantidadnotas = leer();

        double suma = 0;
        double mayor = 0;
        double menor = 0;
        double[] notas = new double[cantidadnotas];
        for (int i = 0; i < cantidadnotas; i++) {
            System.out.println("Digite la nota " + (i + 1));
            notas[i] = normalizarnota();
            if (notas[i] > mayor) {
                mayor = notas[i];
            }
            if (notas[i] < mayor) {
                menor = notas[i];
            }
            suma = suma + notas[i];
        }
        double promedio = suma / cantidadnotas;

        //notas
        System.out.println("--- Resultados del estudiante ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Curso: " + curso);
        System.out.printf("Promedio: %.2f", promedio);
        System.out.println("Nota más alta: " + mayor);
        System.out.println("Nota más baja: " + menor);
        System.out.println(promedio >= 3.0 ? "Estado: Aprobado " : "Estado: Reprobado ");
    }

    static double normalizarnota(){
        Scanner entrada = new Scanner(System.in);
        double numero = Double.parseDouble(entrada.next().strip().replace(",", "."));
        while (numero < 0.0 || numero > 5.0) {
            System.out.println(" Digite nuevamente su nota");
            numero = Double.parseDouble(entrada.next().strip().replace(",", "."));
        } return numero;
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
}