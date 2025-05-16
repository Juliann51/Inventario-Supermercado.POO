package Ejerciciosprogramacion;

import java.util.Arrays;

public class clasematrices2 {
    public static void main(String[] args) {
        //Arreglos
        boolean [] vof = new boolean[5];

        //Modificar elementos
        vof [0] = true ;
        vof[2] = true ;

        System.out.println(" arreglo es = " + Arrays.toString(vof));

        //crar e inicializar
        int [] numeros = new int[]{100,200,300,400,500};
        System.out.println("numeros = " + Arrays.toString(numeros));

        int [] edades = {18,18,18,21,17,21};
        System.out.println("edades = " + Arrays.toString(edades));



        int sumaedades = 0;

        for (var i = 0; i < edades.length; i++) {
            System.out.println("edades = " + (i+ "=" +edades[i]));
            sumaedades = edades[i] + sumaedades;
        }
        int promedio = sumaedades/edades.length;
        System.out.println("sumaedades = " + sumaedades);
        System.out.println("promedio = " + promedio);
    }
}
