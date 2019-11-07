package app;

public class App {
    public static void main(String[] args) throws Exception {
        //primer grupo
        Alumno alu = new Alumno("Juan", "Perez", "23199873", "Tercero", 9.0);
        Alumno alu2 = new Alumno("pepe", "rojas", "3422984", "aprende", 7.0);
        Alumno alu3 = new Alumno("manuel", "romas", "3490004", "visual", 8.0);
        Alumno alu4 = new Alumno("gabriel", "tomas", "9837984", "basic", 9.1);

        Alumno[] alumnos = new Alumno[4];
        alumnos[0] = alu;
        alumnos[1] = alu2;
        alumnos[2] = alu3;
        alumnos[3] = alu4;

        Profesor p1 = new Profesor("juan", "ortiz", "001200434", "Matematicas");
        Aula a1 = new Aula(alumnos, p1, "001110");
        a1.imprimeListadoAlumnos();

        //segundo grupo
        Alumno alu5 = new Alumno("carlos", "Peña", "27777873", "html", 6.4);
        Alumno alu6 = new Alumno("alonfo", "lope", "83774324", "java", 5.3);
        Alumno alu7 = new Alumno("majolo", "jomas", "87332444", "visual", 7.1);
        Alumno alu8 = new Alumno("julio", "pasos", "98300000", "basic", 7.4);

        Alumno[] alumnos2 = new Alumno[4];
        alumnos2[0] = alu5;
        alumnos2[1] = alu6;
        alumnos2[2] = alu7;
        alumnos2[3] = alu8;

        Profesor p2 = new Profesor("franco", "escamiilla", "001211134", "Social");
        Aula a2 = new Aula(alumnos2, p2, "001113");
        a2.imprimeListadoAlumnos();

        Aula[] almacenaAulas = new Aula[2];
        almacenaAulas[0] = a1;
        almacenaAulas[1] = a2;

        Director d1 = new Director("Don", "Delinquer", "12131414", 9.0);

        Colegio c1 = new Colegio(almacenaAulas, d1, "Colegio chupi");
        c1.imprimirEstatistica();
    }
}