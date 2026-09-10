
public class CursoExamen extends Curso implements Calificable {
    public CursoExamen(String nombreCurso, String nombreDocente, int duracionHoras, int cantidadEstudiantes) {
        super(nombreCurso, nombreDocente, duracionHoras, cantidadEstudiantes);
    }

    @Override
    public void Calificar() {
        System.out.println("El curso de examen ha sido calificado.");
    }
    
}
