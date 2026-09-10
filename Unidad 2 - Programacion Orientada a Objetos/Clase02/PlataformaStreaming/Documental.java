
public class Documental extends ContenidoStreaming implements Reproducible {

    private String tema;

    public Documental(String titulo, String genero, int duracionMinutos, String tema) {
        super(titulo, genero, duracionMinutos);
        this.tema = tema;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo el documental: " + getTitulo() + " sobre el tema: " + tema);
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tema: " + tema);
    }

}
