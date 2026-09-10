
public class CursoVideo extends Curso implements Calificable {
    public CursoVideo(String nombreCurso, String nombreDocente, int duracionHoras, int cantidadEstudiantes) {
        super(nombreCurso, nombreDocente, duracionHoras, cantidadEstudiantes);
    }

    @Override
    public void Calificar() {
        System.out.println("El curso de video ha sido calificado.");
    }
}
