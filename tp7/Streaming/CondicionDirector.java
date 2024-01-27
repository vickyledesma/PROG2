package tp7.Streaming;

public class CondicionDirector extends Condicion {
    private String nombreDirector;

    public CondicionDirector(String nombreDirector) {
        this.nombreDirector = nombreDirector;
    }

    @Override
    public boolean cumple(Pelicula pelicula) {
        return pelicula.getActores().contains(nombreDirector);
    }
    
    
}
