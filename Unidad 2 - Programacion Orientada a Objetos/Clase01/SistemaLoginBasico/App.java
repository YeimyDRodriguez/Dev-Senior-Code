
public class App {

    public static void main(String[] args) {

        CuentaUsuario cuenta = new CuentaUsuario(
                "usuario@email.com",
                "12345");

        cuenta.iniciarSesion("1111");
        cuenta.iniciarSesion("2222");
        cuenta.iniciarSesion("3333");
        cuenta.iniciarSesion("12345"); 
    }
}
