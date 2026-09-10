
public class App {
    public static void main(String[] args) {
        BuscaGoogle buscador = new BuscaGoogle();

        buscador.buscar("SHA");
        buscador.buscar("Java", 10);
        buscador.buscar("Programación", true);
        buscador.buscar("Yei", false);
    }

}
