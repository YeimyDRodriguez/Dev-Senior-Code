
public class Curso {
    private String nombreCurso;
    private String nombreDocente;
    private int duracionHoras;
    private int cantidadEstudiantes;

    public Curso(String nombreCurso, String nombreDocente, int duracionHoras, int cantidadEstudiantes) {
        this.nombreCurso = nombreCurso;
        this.nombreDocente = nombreDocente;
        this.duracionHoras = duracionHoras;
        this.cantidadEstudiantes = cantidadEstudiantes;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getNombreDocente() {
        return nombreDocente;
    }

    public void setNombreDocente(String nombreDocente) {
        this.nombreDocente = nombreDocente;
    }

    public int getDuracionHoras() {
        return duracionHoras;
    }

    public void setDuracionHoras(int duracionHoras) {
        this.duracionHoras = duracionHoras;
    }

    public int getCantidadEstudiantes() {
        return cantidadEstudiantes;
    }

    public void setCantidadEstudiantes(int cantidadEstudiantes) {
        this.cantidadEstudiantes = cantidadEstudiantes;
    }

    public void mostrarInformacion(){
        System.out.println("Curso: " + nombreCurso);
        System.out.println("Docente: " + nombreDocente);
        System.out.println("Duración (horas): " + duracionHoras);
        System.out.println("Cantidad de Estudiantes: " + cantidadEstudiantes);
    }
}
