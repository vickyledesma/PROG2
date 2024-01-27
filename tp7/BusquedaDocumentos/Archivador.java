import java.util.ArrayList;

public class Archivador {
    private ArrayList<Documento> documentos;

    public Archivador(ArrayList<Documento> documentos) {
        documentos = new ArrayList<>();
    }

    public ArrayList<Documento> getDocumentos() {
        return new ArrayList<Documento>();
    }

    public void setDocumentos(ArrayList<Documento> documentos) {
        this.documentos.addAll(documentos);
    }
    
    public ArrayList<Documento> buscador(Condicion condicion){
        ArrayList<Documento> lista = new ArrayList<>();
        for(int i=0; i<documentos.size();i++){
            Documento doc = documentos.get(i);
            if(condicion.cumple(doc)){
                lista.add(doc);

            }
        }
        return lista;
    }

    
}
