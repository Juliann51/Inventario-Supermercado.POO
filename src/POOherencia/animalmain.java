package POOherencia;

public class animalmain {
    public static void main(String[] args) {
        System.out.println(" ** Ejemplo de Herencia **");
        //instanciar objeto con los atributos

        Animal animal1 = new Animal("macho","cafe",false,2);
        animal1.comer();
        animal1.dormir();

        System.out.println("** clase hija**");
        perro perro1= new perro();
        perro1.comer();
        perro1.hacerSonido();
        perro1.setCantidadojos(2);
        System.out.println("la cantidad de ojos de firulais es:"+perro1.getCantidadojos());
    }
}
