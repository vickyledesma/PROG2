import java.util.ArrayList;

public class Cultivo {
    private String nombre;
    private ArrayList<Enfermedad> enfermedadFrecuente;
    
    public Cultivo(String nombre, ArrayList<Enfermedad> enfermedadFrecuente) {
        this.nombre = nombre;
        this.enfermedadFrecuente = enfermedadFrecuente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Enfermedad> getEnfermedadFrecuente() {
        return enfermedadFrecuente;
    }

    public void setEnfermedadFrecuente(ArrayList<Enfermedad> enfermedadFrecuente) {
        this.enfermedadFrecuente = enfermedadFrecuente;
    }

    @Override
    public String toString() {
        return "Cultivo [nombre=" + nombre + ", enfermedadFrecuente=" + enfermedadFrecuente + "]";
    }

    public boolean tieneEnfermedad(String nombreEnf) {
        for (int i = 0; i < enfermedadFrecuente.size(); i++) {
            Enfermedad enfermedad = enfermedadFrecuente.get(i);
            if (enfermedad.equals(nombreEnf)) {
                return true;
            }
        }
        return false;
    }

    
    
    
}
