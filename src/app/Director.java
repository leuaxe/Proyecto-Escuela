package app;

public class Director extends Persona{
    private double valoracion;

    public Director(){
    }

    public Director(String nombre, String apellido, String dni, double valoracion){
        super(nombre, apellido, dni);
        this.valoracion = valoracion;
    }

    public double getValoracion(){
        return this.valoracion;
    }

    public void setValoracion(double valoracion){
        this.valoracion = valoracion;
    }
}