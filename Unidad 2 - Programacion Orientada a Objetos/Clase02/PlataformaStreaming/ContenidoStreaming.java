
public class ContenidoStreaming {

    private String titulo;
    private String genero;
    private int duracionMinutos;

    public ContenidoStreaming(String titulo, String genero, int duracionMinutos) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracionMinutos = duracionMinutos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Género: " + genero);
        System.out.println("Duración (minutos): " + duracionMinutos);
    }
}
