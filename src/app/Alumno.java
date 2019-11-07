package app;

public class Alumno extends Persona{
    private String curso;
    private double notaMedia;

    public Alumno(){}

    public Alumno(String nombre, String apellido, String dni, String curso, double notaMedia) {
        super(nombre, apellido, dni);
        this.curso = curso;
        this.notaMedia = notaMedia;
    }

    public String getCurso(){
        return this.curso;
    }

    public void setCurso(String curso){
        this.curso = curso;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

    public void imprime(){
        super.imprime();
        System.out.println(" ,Curso: " + this.curso + ", notaMedia: " + this.notaMedia);
    }
}