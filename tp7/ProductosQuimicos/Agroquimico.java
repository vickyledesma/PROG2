import java.util.ArrayList;

public class Agroquimico {
    private String nombre;
    private ArrayList<Enfermedad> enfermedadAtratar;
    private ArrayList<Cultivo> cultivoNorecomendado;

    public Agroquimico(String nombre, ArrayList<Enfermedad> enfermedadAtratar,
            ArrayList<Cultivo> cultivoNorecomendado) {
        this.nombre = nombre;
        this.enfermedadAtratar = enfermedadAtratar;
        this.cultivoNorecomendado = cultivoNorecomendado;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public ArrayList<Enfermedad> getEnfermedadAtratar() {
        return enfermedadAtratar;
    }
    public void setEnfermedadAtratar(ArrayList<Enfermedad> enfermedadAtratar) {
        this.enfermedadAtratar = enfermedadAtratar;
    }
    public ArrayList<Cultivo> getCultivoNorecomendado() {
        return cultivoNorecomendado;
    }
    public void setCultivoNorecomendado(ArrayList<Cultivo> cultivoNorecomendado) {
        this.cultivoNorecomendado = cultivoNorecomendado;
    }
    @Override
    public String toString() {
        return "Agroquimico [nombre=" + nombre + ", enfermedadAtratar=" + enfermedadAtratar + ", cultivoNorecomendado="
                + cultivoNorecomendado + "]";
    }
    
    public boolean puedeTratarEnfermedad(String nombreEnf) {
        for (int i = 0; i < enfermedadAtratar.size(); i++) {
            Enfermedad enfermedad = enfermedadAtratar.get(i);
            if (enfermedad.equals(nombreEnf)) {
                return true;
            }
        }
        return false;
    }

    
    
}
