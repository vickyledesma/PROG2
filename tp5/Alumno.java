import java.util.ArrayList;

public class Alumno {
    private String nombre;
    private ArrayList<String> cualidades;
    private ArrayList<Casa> familiares;

    public Alumno(String nombre, ArrayList<String> cualidades, ArrayList<Casa> familiares) {
        this.nombre = nombre;
        this.cualidades = cualidades;
        this.familiares = familiares;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getCualidades() {
        return cualidades;
    }

    public void setCualidades(ArrayList<String> cualidades) {
        this.cualidades = cualidades;
    }

    public ArrayList<Casa> getFamiliares() {
        return familiares;
    }

    public void setFamiliares(ArrayList<Casa> familiares) {
        this.familiares = familiares;
    }
    public void agregarFamiliar(Casa casa) {
        familiares.add(casa);
    }
    public String toString() {
        return "Alumno: " + nombre; // Cambiar "nombre" por el atributo correcto
    }

    
    
}
