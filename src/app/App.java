package app;

public class App {
    public static void main(String[] args) throws Exception {
        Alumno alu = new Alumno("Juan", "Perez", "23199873", "Tercero", 9.0);

        Alumno[] almacenaAlumnos = new Alumno[1];
        almacenaAlumnos[0] = alu;
        Profesor p1 = null;

        Aula aula1 = new Aula(almacenaAlumnos, p1, "101");
        aula1.imprimeListadoAlumnos();
    }
}