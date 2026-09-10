

public class App {
    public static void main(String[] args) {
        
        //Creamos un creador de contenido 
        CreadorContenido creador = new CreadorContenido("TechGuru", 150000, "Tecnología");
        creador.mostrarPerfil();
        System.out.println("==============================");

        //Creamos un usuario normal
        UsuarioYout usuario = new UsuarioYout("Yeimy", 20);
        usuario.mostrarPerfil();
    }
}
