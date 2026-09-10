
public class App {
    public static void main(String[] args) {
        Calificable cursoVideo = new CursoVideo("Java Básico", "Yeimy Rodriguez", 40, 100);
        cursoVideo.Calificar();
        Calificable cursoLectura = new CursoLectura("Patrones de Diseño", "Carlos Perez", 30, 80);
        cursoLectura.Calificar();
        Calificable cursoExamen = new CursoExamen("Estructuras de Datos", "Ana Gomez", 50, 120);
        cursoExamen.Calificar();
    }
}
