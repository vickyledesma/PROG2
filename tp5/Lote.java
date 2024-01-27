import java.util.ArrayList;
import java.util.List;

public class Lote {
    private String nombre;
    private int tamaño;
    private ArrayList<String> mineralesContiene;


    public Lote(String nombre, int tamaño, ArrayList<String> mineralesContiene) {
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.mineralesContiene = mineralesContiene;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getTamaño() {
        return tamaño;
    }


    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }


    public ArrayList<String> getMineralesContiene() {
        return mineralesContiene;
    }

    public void setMineralesContiene(ArrayList<String> mineralesContiene) {
        this.mineralesContiene = mineralesContiene;
    }

   
    
    
}
