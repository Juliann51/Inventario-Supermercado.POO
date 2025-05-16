package datos;

import java.util.Random;

public class numaleatorio {
    public static void main(String[] args) {
        var random = new Random();

        var numeroaleatorio = random.nextInt(100);
        System.out.println("numeroaleatorio = " + numeroaleatorio);

        var aleatorio = random.nextInt(10)+1;
        System.out.println("numeroaleatorio = " + aleatorio);


    }
}