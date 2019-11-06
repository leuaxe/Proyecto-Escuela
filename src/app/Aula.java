package app;

public class Aula{
    private Alumno[] alumnos;
    private Profesor profesor;
    private String idAula;

    public Aula(){}

    public Aula(Alumno[] alumno, Profesor profesor, String idAula) {
        this.alumnos = alumno;
        this.profesor = profesor;
        this.idAula = idAula;
    }

    public Alumno[] getAlumnos(){
        return alumnos;
    }

    public void setAlumnos(Alumno[] alumno){
        this.alumnos = alumno;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public String getIdAula() {
        return idAula;
    }

    public void setIdAula(String idAula) {
        this.idAula = idAula;
    }
}