package app;

import java.rmi.server.RemoteStub;

public class Colegio{
    private Aula[] aulas;
    private Director director;
    private String nombre;

    public Colegio(){}

    public Colegio(Aula[] aula, Director director, String nombre){
        this.aulas = aula;
        this.director = director;
        this.nombre = nombre;
    }

    public Aula[] getAulas() {
        return aulas;
    }

    public void setAulas(Aula[] aulas) {
        this.aulas = aulas;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNotaMediaTotal(){
        double total = 0.0;
        for (Aula aula : aulas) {
            total += aula.getNotaMediaAula();
        }

        return (total/aulas.length)*(this.getDirector().getValoracion()*0.3);
    }

    public Alumno getMejorAlumnoColegio(){
        Alumno mejorAlumno = new Alumno();
        double mejorNota = 0.0;
        for (Aula aula : aulas) {
            if (aula.getMejorAlumno().getNotaMedia() > mejorNota) {
                mejorAlumno = aula.getMejorAlumno();
                mejorNota = mejorAlumno.getNotaMedia();
            }
        }

        return mejorAlumno;
    }
}