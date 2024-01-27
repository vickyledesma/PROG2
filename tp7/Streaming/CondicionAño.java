package tp7.Streaming;

public class CondicionAño extends Condicion {
    private int año;

    public CondicionAño(int año) {
        this.año = año;
    }

    @Override
    public boolean cumple(Pelicula pelicula) {
        return pelicula.getAñoestreno() == (año);
    }

    
}
