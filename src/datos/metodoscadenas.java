package datos;

public class metodoscadenas {
    public static void main(String[] args) {
        var cadena1 = "hola mundo";

        //obtener el largo de una cadena
        var longitud = cadena1.length();
        System.out.println("longitud = " + longitud);

        //remplazar caracteres
        var nuevacaena = cadena1.replace("a", "o");
        System.out.println("nuevacaena = " + nuevacaena);

        //mayuscula
        var mayuscula = cadena1.toUpperCase();
        System.out.println("mayuscula = " + mayuscula);

        //minuscula
        var minuscula = cadena1.toLowerCase();
        System.out.println("minuscula = " + minuscula);

        //eliminar espacios al inicio y al final de la cadena
        var cadena2 = "frank ortegon";
        System.out.println("cadena2 = " + cadena2);
        System.out.println("cadena2 = " + cadena2.trim());
        System.out.println("cadena2 lomngitud = " + cadena2.length());











































    }
}
