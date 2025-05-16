package datos;
public class tipowrapper {
    public static void main(String[] args) {
        //tipo wrapper
        Integer numero= 456;
        System.out.println("numero = " + numero);
        numero = numero +1;
        System.out.println("numero = " + numero);

        //conversion de string a integer
        String texto = "123";
        System.out.println("texto = " + texto);
        Integer textonumerico= Integer.parseInt(texto);
        textonumerico=500;
        System.out.println("textonumerico = " + textonumerico);

        //comparacion de valores usando compareto
        int numerocomparacion = numero.compareTo(textonumerico);
        System.out.println("numerocomparacion = " + numerocomparacion);
        //integer a string
        Integer edad=40;
        edad.toString();
        String casa="masella";
        System.out.println("casa.length() = " + casa.length());
        System.out.println("casa = " + casa);



    }
}
