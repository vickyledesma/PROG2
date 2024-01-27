package tp4.Alarma;

public class Sensor {
    private String nombre;
    private boolean activo;


    public Sensor(String nombre, boolean activo){
        this.nombre = nombre;
        this.activo = activo;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public boolean isActivo() {
        return activo;
    }


    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
}
