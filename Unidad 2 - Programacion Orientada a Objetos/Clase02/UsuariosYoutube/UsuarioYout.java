

public class UsuarioYout {

    private String nombreUsuario;
    private int numeroSuscriptores;

    public UsuarioYout(String nombreUsuario, int numeroSuscriptores) {
        this.nombreUsuario = nombreUsuario;
        this.numeroSuscriptores = numeroSuscriptores;
    }
    public String getNombreUsuario() {
        return nombreUsuario;
    }
    public int getNumeroSuscriptores() {
        return numeroSuscriptores;
    }
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    public void setNumeroSuscriptores(int numeroSuscriptores) {
        this.numeroSuscriptores = numeroSuscriptores;
    }
    public void mostrarPerfil(){
        System.out.println("Nombre de usuario: " + nombreUsuario);
        System.out.println("Número de suscriptores: " + numeroSuscriptores);
    }

}
