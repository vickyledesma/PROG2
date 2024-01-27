import java.util.ArrayList;

public class Enfermedad {
    private String nombre;
    private ArrayList<String> sintomas;

    
    public Enfermedad(String nombre, ArrayList<String> sintomas) {
        this.nombre = nombre;
        this.sintomas = sintomas;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public ArrayList<String> getSintomas() {
        return sintomas;
    }
    public void setSintomas(ArrayList<String> sintomas) {
        this.sintomas = sintomas;
    }
    @Override
    public String toString() {
        return "Enfermedad [nombre=" + nombre + ", sintomas=" + sintomas + "]";
    }

    


}
