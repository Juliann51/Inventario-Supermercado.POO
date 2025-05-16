package Ejerciciosprogramacion;
import java.util.Scanner;

public class ll {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Ingrese la cantidad de estudiantes: ");
        int cantidadEstudiantes = scanner.nextInt();
        scanner.nextLine(); // limpiar buffer

        for (int i = 1; i <= cantidadEstudiantes; i++) {
            System.out.println("\n----- Estudiante " + i + " -----");
            procesarEstudiante();
        }
    }

    public static void procesarEstudiante() {
        // Datos personales
        System.out.print("Nombre del estudiante: ");
        String nombre = scanner.nextLine();

        System.out.print("Edad del estudiante: ");
        int edad = scanner.nextInt();

        int curso;
        do {
            System.out.print("Curso (solo de 6 a 11): ");
            curso = scanner.nextInt();
            if (curso < 6 || curso > 11) {
                System.out.println("⚠ Curso no válido. Intente nuevamente.");
            }
        } while (curso < 6 || curso > 11);

        // Cantidad de notas
        int cantidadNotas;
        do {
            System.out.print("¿Cuántas notas desea ingresar? ");
            cantidadNotas = scanner.nextInt();
            if (cantidadNotas <= 0) {
                System.out.println("⚠ Debe ingresar al menos una nota.");
            }
        } while (cantidadNotas <= 0);

        // Ingreso de notas
        double[] notas = new double[cantidadNotas];
        for (int i = 0; i < cantidadNotas; i++) {
            notas[i] = leerNota(i + 1);
        }

        // Cálculos
        double promedio = calcularPromedio(notas);
        double max = obtenerMaximo(notas);
        double min = obtenerMinimo(notas);

        // Resultados
        System.out.println("\n--- Resultados del estudiante ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Curso: " + curso);
        System.out.printf("Promedio: %.2f\n", promedio);
        System.out.println("Nota más alta: " + max);
        System.out.println("Nota más baja: " + min);
        System.out.println(promedio >= 3.0 ? "Estado: Aprobado ✅" : "Estado: Reprobado ❌");

        scanner.nextLine(); // limpiar buffer final
    }

    public static double leerNota(int numero) {
        double nota;
        do {
            System.out.print("Ingrese la nota " + numero + " (0 a 5): ");
            nota = scanner.nextDouble();
            if (nota < 0 || nota > 5) {
                System.out.println("⚠ Nota inválida. Debe estar entre 0 y 5.");
            }
        } while (nota < 0 || nota > 5);
        return nota;
    }

    public static double calcularPromedio(double[] notas) {
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.length;
    }

    public static double obtenerMaximo(double[] notas) {
        double max = notas[0];
        for (double nota : notas) {
            if (nota > max) {
                max = nota;
            }
        }
        return max;
    }

    public static double obtenerMinimo(double[] notas) {
        double min = notas[0];
        for (double nota : notas) {
            if (nota < min) {
                min = nota;
            }
        }
        return min;
}
}

