package Ejerciciosprogramacion;

public class CalculadoraObjeto {
    Double numeri1;
    Double numero2;

    public CalculadoraObjeto(Double numeri1,Double numero2){
        this.numeri1=numeri1;
        this.numero2=numero2;
    }

    public void suma(){
        Double suma=numeri1+numero2;
        System.out.println("el resultado de la suma es= " +suma);
    }

    public void resta(){
        Double resta=numeri1-numero2;
        System.out.println("el resultado de la resta es= " +resta);
    }

    public void division(){
            Double division=numeri1/numero2;
            System.out.println("el resultado de la division es= " +division);

    }
    public void multiplicacion(){
        Double multiplicacion=numeri1*numero2;
        System.out.println("el resultado de la multiplicacion es= " +multiplicacion);
    }

}
