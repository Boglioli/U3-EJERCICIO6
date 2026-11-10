public class Usuario {
    private String nombreUsuario;
    private String email;
    private String password;
    public Usuario(String nombreUsuario, String email, String password) {
        this.nombreUsuario = nombreUsuario;
        this.email = email;
        this.password = password;
    }
    public boolean cambiarPassword(String passwordActual, String nuevaPassword) {
        if (this.password.equals(passwordActual)) {
            this.password = nuevaPassword;
            return true;
        } else {
            return false;
        }
    }
    public boolean validarCredenciales(String passwordIngresada) {
        return this.password.equals(passwordIngresada);
    }
}
