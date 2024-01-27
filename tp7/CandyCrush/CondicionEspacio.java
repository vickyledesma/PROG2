package tp7.CandyCrush;

public class CondicionEspacio extends Condicion {
    private int espacio;

    public CondicionEspacio(int espacio) {
        this.espacio = espacio;
    }

    @Override
    public boolean cumple(Ficha ficha) {
        return ficha.getEspacio() > espacio;
    }
    

}
