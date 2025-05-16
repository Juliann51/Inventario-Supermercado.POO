package sobreescritura;

public class automain {
    //funcion polimorfica
    public static void acelerarAuto(automovil automovil){
        automovil.acelerar();
    }
    public static void main(String[] args) {
        automovil automovil = new automovil();
        acelerarAuto(automovil);

        deportivo deportivo = new deportivo();
        acelerarAuto(deportivo);

        sedan sedan = new sedan();
        acelerarAuto(sedan);
    }
}
