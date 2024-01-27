import java.util.ArrayList;
public class Cereal {
    private String nombre;
    private ArrayList<String> mineralesRequeridos;

    public Cereal(String nombre, ArrayList<String> mineralesRequeridos) {
        this.nombre = nombre;
        this.mineralesRequeridos = mineralesRequeridos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getMineralesRequeridos() {
        return mineralesRequeridos;
    }

    public void setMineralesRequeridos(ArrayList<String> mineralesRequeridos) {
        this.mineralesRequeridos = mineralesRequeridos;
    }

    public boolean containsAll(ArrayList<String> mineralesContiene) {
        return false;
    }
    
    
}
