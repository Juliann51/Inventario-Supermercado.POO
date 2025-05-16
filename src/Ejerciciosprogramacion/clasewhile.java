package Ejerciciosprogramacion;

public class clasewhile {
    public static void main(String[] args) {
        // sumar los primeros 5 numeros
        final Integer MAXIMO = 5;
        int acumuladosuma = 0;

        for (var numero = 1; numero <= MAXIMO; numero++) {
            System.out.println(" acumulador suma + numero ="+ acumuladosuma+ " + "+numero);
            acumuladosuma += numero;
            System.out.println("suma parcial acumulado = " + acumuladosuma);
        }
        System.out.println("suma total:"+ acumuladosuma);
    }
}
