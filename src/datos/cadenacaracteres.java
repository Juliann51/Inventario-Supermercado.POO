package datos;

public class cadenacaracteres {
    public static void main(String[] args) {
        //manejo de cadenas en java
        var cadena1="hola";
        System.out.println("cadena1 = " + cadena1);
        var cadena2 = new String("mundo");
        System.out.println("cadena2 = " + cadena2);;

        //las cadenas de caracteres (string) son inmutables
        var cadena3= cadena1+cadena2;
        System.out.println("cadena3 = " + cadena3);

        //texto block (multiples lineas)
        var cadena4 = """
                este es un texto
                multilinea
                jajaja
                xd
                """;
        System.out.println("cadena4 = " + cadena4);

        System.out.println(" indices de cadena de caracteres ");
        var cadenaIndice = "hola mundo";
        //recuperar caracter
        var primercaracter = cadenaIndice.charAt(0);
        System.out.println("primercaracter = " + primercaracter);

        //comparacion de cadenas (==) comparar la reerencia
        var cadenacomparacion1 = "java";
        var cadenacomparacion2 = "java";
        System.out.println("cadenacomparacion1 es igual en referencia a cadenacomparacion2");
        System.out.println(cadenacomparacion1==cadenacomparacion2);
        var cadenacomparacion3 = new String("java");
        System.out.println("cadenacomparacion1 es igual en referencia a cadenacomparacion3");
        System.out.println(cadenacomparacion1==cadenacomparacion3);
        var cadenacomparacion4 = new String("java");
        System.out.println("cadenacomparacion1 es igual en referencia a cadenacomparacion3");
        System.out.println(cadenacomparacion4==cadenacomparacion3);

        //comparar contenido metodo equals
        System.out.println("c1 es igual a c3");
        System.out.println(cadenacomparacion1.equals(cadenacomparacion3));
    }
}
