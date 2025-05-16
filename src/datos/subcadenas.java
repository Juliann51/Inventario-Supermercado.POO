package datos;

public class subcadenas {
    public static void main(String[] args) {
        var cadena1 = "hola mundo";
        System.out.println("cadena1 = " + cadena1);

        //subcadena
        var subcadena = cadena1.substring(0,4);
        System.out.println("subcadena = " + subcadena);

        var cadena2 = cadena1.substring(5);
        System.out.println("cadena2 = " + cadena2);

        //remplazar subcadenas
        var cadena = "hola mundo";
        System.out.println("cadena = " + cadena);

        //remplazar "mundo por "a todos"
        var nuevacadena = cadena.replace("mundo", "a todos");
        System.out.println("nuevacadena = " + nuevacadena);
        //remplazar "hola" por adios
        nuevacadena = cadena.replace("hola", "adios");
        System.out.println("nuevacadena = " + nuevacadena);

    }
}
