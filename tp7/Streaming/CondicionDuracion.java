package tp7.Streaming;

public class CondicionDuracion extends Condicion{
    private int duracion;

    public CondicionDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public boolean cumple(Pelicula pelicula) {
        return pelicula.getDuracion() < duracion;
    }
    
}
