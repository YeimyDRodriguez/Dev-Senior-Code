
public class CuentaUsuario {
    private String email;
    private String password;
    private int intentosFallidos;
    private boolean bloqueada;

    public CuentaUsuario(String email, String password) {
        this.email = email;
        this.password = password;
        this.intentosFallidos = 0;
        this.bloqueada = false;

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getIntentosFallidos() {
        return intentosFallidos;
    }

    public void setIntentosFallidos(int intentosFallidos) {
        this.intentosFallidos = intentosFallidos;
    }

    public boolean isBloqueada() {
        return bloqueada;
    }

    public void setBloqueada(boolean bloqueada) {
        this.bloqueada = bloqueada;
    }

    public void iniciarSesion(String passwordIngresada) {
        if (this.bloqueada) {
            System.out.println("La cuenta está bloqueada. No se puede iniciar sesión.");
            return;
        }
        if (this.password.equals(passwordIngresada)) {
            System.out.println("Inicio de sesión exitoso.");
            this.intentosFallidos = 0;
        } else {
            this.intentosFallidos++;
            System.out.println("Contraseña incorrecta. Intentos fallidos: " + this.intentosFallidos);
            if (this.intentosFallidos >= 3) {
                this.bloqueada = true;
                System.out.println(
                        "La cuenta ha sido bloqueada debido a múltiples intentos fallidos de inicio de sesión.");

            }
        }
    }

}
