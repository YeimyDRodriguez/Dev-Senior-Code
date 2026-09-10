
public class Serie extends ContenidoStreaming implements Reproducible {

    private int temporadas;

    public Serie(String titulo, String genero, int duracionMinutos, int temporadas) {
        super(titulo, genero, duracionMinutos);
        this.temporadas = temporadas;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo la serie: " + getTitulo() + " con " + temporadas + " temporadas");
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Temporadas: " + temporadas);
    }

}
