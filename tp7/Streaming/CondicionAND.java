package tp7.Streaming;

public class CondicionAND extends Condicion {
    private Condicion cond1, cond2;


    public CondicionAND(Condicion c1, Condicion c2) {
        this.cond1 = c1;
        this.cond2 = c2;
    }
    @Override
    public boolean cumple(Pelicula pelicula) {
        return this.cond1.cumple(pelicula) && this.cond2.cumple(pelicula);
    }
}