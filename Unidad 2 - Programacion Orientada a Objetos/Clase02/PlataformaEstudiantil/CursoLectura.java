
public class CursoLectura extends Curso implements Calificable {
    public CursoLectura(String nombreCurso, String nombreDocente, int duracionHoras, int cantidadEstudiantes) {
        super(nombreCurso, nombreDocente, duracionHoras, cantidadEstudiantes);
    }

    @Override
    public void Calificar() {
        System.out.println("El curso de lectura ha sido calificado.");
    }

}
