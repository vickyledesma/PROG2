import java.util.ArrayList;
import java.util.List;

public class Cooperativa {
    private ArrayList<Lote> Lotes;
    private ArrayList<Cereal> Cereales;
    public ArrayList<Lote> getLotes() {
        return Lotes;
    }
    public void setLotes(ArrayList<Lote> lotes) {
        Lotes = lotes;
    }
    public ArrayList<Cereal> getCereales() {
        return Cereales;
    }
    public void setCereales(ArrayList<Cereal> cereales) {
        Cereales = cereales;
    }

    public void addLote (Lote lote){
        Lotes.add(lote);
    }
    public void addCereal (Cereal cereal){
        Cereales.add(cereal);
    }

    public void semillasEnLote(Cereal cereales, Lote lote){ //Que semillas se pueden sembrar en que lote
        List<String> mineralesRequeridos = cereales.getMineralesRequeridos();
        List<String> mineralesLote = lote.getMineralesContiene();

        if (mineralesLote.containsAll(mineralesRequeridos)) {
            System.out.println("Se puede sembrar el cereal " + cereales.getNombre() + " en el lote " + lote.getNombre());
        } else {
            System.out.println("No se puede sembrar el cereal " + cereales.getNombre() + " en el lote " + lote.getNombre());
        }
    }

    public void loteEnSemillas(Cereal cereales, Lote lote){ //Que lote es apto para sembrar las semillas
        List<String> mineralesRequeridos = cereales.getMineralesRequeridos();
        List<String> mineralesLote = lote. getMineralesContiene();

        if (mineralesLote.containsAll(mineralesRequeridos)) {
            System.out.println("El lote  " + lote.getNombre() + " es apto para sembrar" + cereales.getNombre());
        } else {
            System.out.println("El lote  " + lote.getNombre() + " no es apto para sembrar" + cereales.getNombre());
        }
    }

    public boolean esEspecial(Lote lote, LoteEspecial especiales){
        List<String> lotes = lote. getMineralesContiene();
        List<String> especial = especiales.getEspecial();

        return (lotes.containsAll(especial));
    }




}
