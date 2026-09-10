
public class Noticia {

    private String titulo;
    private String categoria;
    private String contenido;
    private int vistas;

    public Noticia(String titulo, String categoria, String contenido, int vistas) {
        this.titulo = titulo;
        this.categoria = categoria;
        this.contenido = contenido;
        this.vistas = 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public int getVistas() {
        return vistas;
    }

    public void setVistas(int vistas) {
        this.vistas = vistas;
    }

    public void actualizarContenido(String nuevoContenido) {
        if (this.vistas <= 100) {
            this.contenido = nuevoContenido;

        } else {
            System.out.println("No se puede actualizar el contenido, la noticia ya tiene más de 100 vistas.");

        }
    }

    public void leer() {
        this.vistas++;

    }
}