package sobreescritura;

public class main {
    public static void main(String[] args) {
        System.out.println(" *** ejemplo sobreescritura ***");

        animal animal = new  animal();
        animal.dormir();
        System.out.println();
        System.out.println( " clase perro");
        perro  perro = new perro();
        perro.dormir();
        perro.moverCola();

    }
}
