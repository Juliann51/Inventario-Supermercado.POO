package Ejerciciosprogramacion;

public class whilesuma {
    public static void main(String[] args) {
        // suma acumulativa
        final Integer MAXIMO = 5;
        Integer acumuladorsuma = 0;

        //variable a iterar
        var numero = 1;

        //estructura de control
        do { System.out.println(" acumulador suma + numero =" + acumuladorsuma + " + " + numero);
            acumuladorsuma += numero++;
            System.out.println("suma parcial acumulado = " + acumuladorsuma);}

            while (numero <= MAXIMO);

            System.out.println("suma total: " + acumuladorsuma);
    }
}
