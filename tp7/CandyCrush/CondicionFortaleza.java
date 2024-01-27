package tp7.CandyCrush;


public class CondicionFortaleza extends Condicion {
    private int fortaleza;

    public CondicionFortaleza(int fortaleza) {
        this.fortaleza = fortaleza;
    }

    @Override
    public boolean cumple(Ficha ficha) {
        return ficha.getFortaleza() > fortaleza;
    }
    

}
