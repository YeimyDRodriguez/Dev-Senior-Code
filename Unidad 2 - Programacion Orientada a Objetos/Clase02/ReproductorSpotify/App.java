
public class App {

    public static void main(String[] args) {

        ContenidoSpotify reproductor01 = new Cancion("Destino Final");
        reproductor01.reproducir();

        ContenidoSpotify reproductor02 = new Podcast("Aventurero");
        reproductor02.reproducir();

    }

}
