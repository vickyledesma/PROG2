package tp7.Streaming;

public class CondicionGenero extends Condicion{
    private String genero;

    public CondicionGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public boolean cumple(Pelicula pelicula) {
        return pelicula.getGeneros().contains(genero);
    }
    
    
}
