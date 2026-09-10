
public class App {
    public static void main(String[] args) {

        Reproducible contenido1 = new Pelicula("Interestellar", "SE", 169, "Ivan");
        Reproducible contenido2 = new Serie("Dark", "PO", 60, 3);
        Reproducible contenido3 = new Documental("Nuestro Planeta", "IU", 50, "Naturaleza");

        contenido1.reproducir();
        contenido2.reproducir();
        contenido3.reproducir();
    }
}

