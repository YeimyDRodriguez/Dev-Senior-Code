

public class CreadorContenido extends UsuarioYout {

    private String categoria;

    public CreadorContenido(String nombreUsuario, int numeroSuscriptores, String categoria) {
        super(nombreUsuario, numeroSuscriptores);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public void mostrarPerfil() {
        super.mostrarPerfil();
        System.out.println("Categoría de contenido: " + categoria);
    }

}
