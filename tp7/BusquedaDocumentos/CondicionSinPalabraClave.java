import java.util.ArrayList;

public class CondicionSinPalabraClave extends Condicion {
    private String palabraClave;

    public CondicionSinPalabraClave(String palabraClave) {
        this.palabraClave = palabraClave.toLowerCase();
    }

    @Override
    public boolean cumple(Documento documento) {
        return !documento.getPalabrasClaves().contains(palabraClave);
            
    }
}