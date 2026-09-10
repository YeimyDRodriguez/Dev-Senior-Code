
public class App {

    public static void main(String[] args) {
        Noticia noticia = new Noticia("Título de Ejemplo", "Categoría de Ejemplo", "Contenido inicial de la noticia.",
                0);

        // Simulamos la lectura de la noticia
        for (int i = 0; i < 12; i++) {
            noticia.leer();
        }

        System.out.println("Vistas después de leer la noticia: " + noticia.getVistas());
        // Intentamos actualizar el contenido
        noticia.actualizarContenido("Nuevo contenido de la noticia.");
        System.out.println("Contenido de la noticia: " + noticia.getContenido());

    }
}
