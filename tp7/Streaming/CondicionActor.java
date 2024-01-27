package tp7.Streaming;

public class CondicionActor extends Condicion {
    private String nombreactor;

    public CondicionActor(String nombreactor) {
        this.nombreactor = nombreactor;
    }

    @Override
    public boolean cumple(Pelicula pelicula) {
        return pelicula.getActores().contains(nombreactor);
    }
    
    
}
