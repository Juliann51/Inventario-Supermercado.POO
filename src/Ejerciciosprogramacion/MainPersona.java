package Ejerciciosprogramacion;

import java.util.Scanner;

public class MainPersona {
    public static void main(String[] args) {
        System.out.println(" *** Sistema para pedir datos de personas ***");
        Scanner sc = new Scanner(System.in);
        System.out.println(" *** Digite su nomber ***");


        PersonaCristiana persona1 = new PersonaCristiana("julian", "perez",15,"maculino","o+");
        PersonaCristiana persona2 = new PersonaCristiana("julian", "perez",15,"maculino","o+");
//
//        persona1.nombre = "juan";
//        persona1.apellido= "perez";
//        persona1.edad = 20;
//        persona1.genero = "masculino";
//        persona1.RH = "0+";
        persona1.setNombre("sebastian");

        persona1.morstrarPersona();
        System.out.println(" el nombre de la persona es:"+persona1.nombre);

        persona2.nombre = "carlos";
        persona1.apellido= "sanchez";
        persona2.edad = 40;
        persona2.genero = "masculino";
        persona2.RH = "0+";

        persona2.morstrarPersona();
        System.out.println(" el nombre de la persona es:"+persona2.nombre);


    }
}
