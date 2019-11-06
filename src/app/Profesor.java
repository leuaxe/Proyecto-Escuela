package app;

public class Profesor extends Persona{
    private String especialidad;

    public Profesor(){
    }

    public Profesor(String nombre, String apellido, String dni, String especialidad) {
        super(nombre, apellido, dni);
        this.especialidad = especialidad;
    }

    
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}