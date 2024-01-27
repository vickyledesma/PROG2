import java.util.ArrayList;
import java.util.List;

public class SistemaAgroquimico{
    private ArrayList<Agroquimico> agroquimicos;
    private ArrayList<Enfermedad> enfermedades;
    private ArrayList<Cultivo> cultivos;


    public SistemaAgroquimico(ArrayList<Agroquimico> agroquimicos, ArrayList<Enfermedad> enfermedades,
            ArrayList<Cultivo> cultivo) {
        this.agroquimicos = agroquimicos;
        this.enfermedades = enfermedades;
        this.cultivos = cultivos;
    }

    public ArrayList<Agroquimico> ListaAgroquimicoParEnfermedad(String nombreEnf){
        ArrayList<Agroquimico> agroquimicoxenfermedad = new ArrayList<>();
        for(int i=0;i< agroquimicos.size();i++){
            Agroquimico agro = agroquimicoxenfermedad.get(i);
            if(agro.puedeTratarEnfermedad(nombreEnf)){
                agroquimicoxenfermedad.add(agro);
            }
        }

        return agroquimicoxenfermedad;
    }

    public List<Agroquimico> listarAgroquimicosParaCultivoYEnfermedad(String nombreCultivo, String nombreEnfermedad) {
    List<Agroquimico> agroquimicosParaCultivoYEnfermedad = new ArrayList<>();
    for (int i = 0; i < cultivos.size(); i++) {
        Cultivo cultivo = cultivos.get(i);
        if (cultivo.getNombre().equals(nombreCultivo) && cultivo.tieneEnfermedad(nombreEnfermedad)) {
            for (int j = 0; j < agroquimicos.size(); j++) {
                Agroquimico agroquimico = agroquimicos.get(j);
                if (agroquimico.puedeTratarEnfermedad(nombreEnfermedad)) {
                    agroquimicosParaCultivoYEnfermedad.add(agroquimico);
                }
            }
        }
    }
    return agroquimicosParaCultivoYEnfermedad;
}

}

    
