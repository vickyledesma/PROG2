package tp4.RegistroEmpresa;

public class Datos {
    private String nombre;
    private String apellido;
    private int edad;

    public Datos(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }
    public String toString() {
        return String.format("%s %s, Edad: %d", nombre, apellido, edad);
    }



    
}
