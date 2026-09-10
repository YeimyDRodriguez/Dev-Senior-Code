
public class Mensajes {
    public void enviarMensaje(String texto) {
        System.out.println("Enviando mensaje de texto: " + texto);
    }

    public void enviarMensaje(String texto, String contacto) {
        System.out.println("Enviando mensaje de texto: " + texto);
        System.out.println("Al contacto: " + contacto);
    }

    public void enviarMensaje(String texto, String contacto, boolean esUrgente) {
        System.out.println("Enviando mensaje de texto: " + texto);
        System.out.println("Al contacto: " + contacto);
        if (esUrgente) {
            System.out.println("Este es un mensaje URGENTE");
        } else {
            System.out.println("Este no es un mensaje urgente");
        }
    }

}
