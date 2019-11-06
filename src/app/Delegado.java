package app;

public class Delegado extends Alumno{
    private double valoracion;

    public Delegado(){}

    public Delegado(String nombre, String apellido, String dni, String curso, double notaMedia, double valoracion) {
        super(nombre, apellido, dni, curso, notaMedia);
        this.valoracion = valoracion;
    }

    public void setValoracion(double valoracion) {
        this.valoracion = valoracion;
    }

    public double getValoracion() {
        return valoracion;
    }
}