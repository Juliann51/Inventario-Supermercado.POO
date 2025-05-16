package Ejerciciosprogramacion;

public class PersonaCristiana {

    String nombre;
    String apellido;
    Integer edad;
    String genero;
    String RH;

    public PersonaCristiana(String nombre, String apellido, Integer edad, String genero, String RH){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.genero = genero;
        this.RH = RH;
    }



    public void morstrarPersona(){
        System.out.println("nombre =" +nombre);
        System.out.println("apellido =" +apellido);
        System.out.println("edad =" +edad);
        System.out.println("genero =" +genero);
        System.out.println("RH =" +RH);
    }

    public void saludar(){
        System.out.println("hola soy " +nombre);
    }

    public void cumplirAños(){
        edad = edad + 1;
        System.out.println(" su nueva edas es ="+edad);
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
       this.nombre=nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getRH() {
        return RH;
    }

    public void setRH(String RH) {
        this.RH = RH;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

}
