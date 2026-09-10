
public class Pelicula extends ContenidoStreaming implements Reproducible {

    private String director;

    public Pelicula(String titulo, String genero, int duracionMinutos, String director) {
        super(titulo, genero, duracionMinutos);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo la película: " + getTitulo() + " dirigida por " + director);
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Director: " + director);
    }

}
