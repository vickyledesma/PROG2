import java.util.ArrayList;

public class LoteEspecial extends Lote{
    private ArrayList<String> especial;

    public LoteEspecial(String nombre, int tamaño, ArrayList<String> mineralesContiene, ArrayList<String> especial) {
        super(nombre, tamaño, mineralesContiene);
        this.especial = especial;
        //TODO Auto-generated constructor stub
    }

    public ArrayList<String> getEspecial() {
        return especial;
    }

    public void setEspecial(ArrayList<String> especial) {
        this.especial = especial;
    }


    public void agregarMineralEspecial(String lote){
        especial.add(lote);
    }
}
