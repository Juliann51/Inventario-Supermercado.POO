package sobreescritura;

public class perro extends animal{

    public void moverCola(){
        System.out.println("perreo intenso");
    }
    //notacion
    @Override
    protected void dormir(){
        System.out.println("yyyy!");
        System.out.println(" metodo original");
        super.dormir();
    }
}
