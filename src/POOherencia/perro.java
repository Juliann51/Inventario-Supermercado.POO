package POOherencia;

public class perro extends Animal{
    private String raza;

    public perro(){
    }
    public perro(String raza){
        this.raza = raza;
    }
    public void hacerSonido(){
        System.out.println("wuau");
    }
    public String getRaza(){

        return "";
    }
}
