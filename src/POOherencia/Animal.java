package POOherencia;

public class Animal {

    public Animal(String genero, String color, Boolean domestico, Integer cantidadojos) {
        this.genero = genero;
        this.color = color;
        this.domestico = domestico;
        this.cantidadojos = cantidadojos;
    }

    private String genero;
    private String color;
    private Boolean domestico;
    private Integer cantidadojos;

    public Animal (){

    }
    //los metodos
    public void comer(){
        System.out.println("estoy comiendo que ricoo!!");
    }
    public void dormir(){
        System.out.println("zzzzz");
    }
    //constructores de los atributos

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getDomestico() {
        return domestico;
    }

    public void setDomestico(Boolean domestico) {
        this.domestico = domestico;
    }

    public Integer getCantidadojos() {
        return cantidadojos;
    }

    public void setCantidadojos(Integer cantidadojos) {
        this.cantidadojos = cantidadojos;
    }

}
//atributos
//constructores
//metodos
//get y set

