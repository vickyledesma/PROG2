package tp4.RegistroEmpresa;

public class UsuarioFinal extends Datos{
   private String usuario;
   private String contraseña;

    
    public UsuarioFinal(String nombre, String apellido, int edad, String usuario, String contraseña) {
    super(nombre, apellido, edad);
    this.usuario = usuario;
    this.contraseña = contraseña;
}


    public String getUsuario() {
        return usuario;
    }


    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }


    public String getContraseña() {
        return contraseña;
    }


    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }


    public String toString() {
        return String.format("Usuario Final - %s, Usuario: %s, Password: %s", super.toString(), usuario, contraseña);
    }
    
    
    
    
}
