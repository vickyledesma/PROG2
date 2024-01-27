package tp7.CandyCrush;

public class CondicionPoderMayor extends Condicion {

    private int poder;
    
    public CondicionPoderMayor(int poder) {
        this.poder = poder;
    }

    @Override
    public boolean cumple(Ficha ficha) {
       return ficha.getPoderDestruccion() > poder; 
    }
    
}
