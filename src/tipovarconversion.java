public class tipovarconversion {
    public static void main(String[] args) {
        //conversion implicita : int a long
        int entero = 100;
        long largo = entero;
        System.out.println("largo = " + largo);

        //conversion explicita (casting) double a int
        double decimal = 2.5;
        int decimalconvertido = (int) decimal; //el decimal se borra debido a que es int
        System.out.println("decimalconvertido = " + decimalconvertido);

        //autoboxing y Unboxing
        Integer objetoentero = entero; //Autoboxing : int variable a objeto
        System.out.println("objetoentero = " + objetoentero);
        int numeroprimitivo = objetoentero; //Unboxing: int a integer de objeto a variable
        System.out.println("numeroprimitivo = " + numeroprimitivo);

        Integer numeroentero = 30;
        Double numerodecimal = numeroentero.doubleValue();
        System.out.println("numerodecimal = " + numerodecimal);

        //tipoVAR
        var edad=24;
        System.out.println("edad = " + edad);
        var sumaedad= edad +1;
        var mensaje = "hola mundo";
        System.out.println("mensaje = " + mensaje);
        var texto = mensaje + "!";
        System.out.println("texto = " + texto);

    }
}
