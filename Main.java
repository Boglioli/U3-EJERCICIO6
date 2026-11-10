import javax.naming.AuthenticationNotSupportedException;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("martin", "martinBoglioli.com", "123344");
        if (usuario.cambiarPassword("123344", "443321")) {

            System.out.println("cambio de contraseña exitoso");
        } else {
            System.out.println("contraseña actual incorrecta");
        }
        if (usuario.cambiarPassword("123344", "9999")) {
            System.out.println("cambio de contraseña exitosa");
        } else {
            System.out.println("no se pudo cambiar la contraseña");
        }
        if (usuario.validarCredenciales("443321")) {
            System.out.println("inicio de sesion exitoso");
        } else {
            System.out.println("contraseña incorrecta");
        }
        if (usuario.validarCredenciales("121212")) {
            System.out.println("inicio de sesion exitosa");
        } else {
            System.out.println("inicio de sesion rechazado");
        }
    }
}
