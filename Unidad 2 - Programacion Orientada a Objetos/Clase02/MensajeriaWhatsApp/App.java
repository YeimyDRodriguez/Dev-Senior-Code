
public class App {
    public static void main(String[] args) {
        Mensajes mensaje = new Mensajes(); 

        mensaje.enviarMensaje("Hola");
        mensaje.enviarMensaje("Hola", "Juan Perez");
        mensaje.enviarMensaje("Hola", "Maria Gomez", true);
    }
}
