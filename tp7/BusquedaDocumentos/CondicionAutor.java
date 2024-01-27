import java.util.ArrayList;

public class CondicionAutor extends Condicion {
    private String autor;

    public CondicionAutor(String autor) {
        this.autor = autor.toLowerCase();
    }


    @Override
    public boolean cumple(Documento documento) {
       return documento.getAutores().contains(autor);
    }
               
    
}
