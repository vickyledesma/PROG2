import java.util.ArrayList;

public class CondicionPalabraClave extends Condicion {
    private String palabraClave;

    public CondicionPalabraClave(String palabraClave) {
        this.palabraClave = palabraClave.toLowerCase();
    }

    @Override
    public boolean cumple(Documento documento) {
        return documento.getPalabrasClaves().contains(palabraClave);
         
    }
}