package tp7.CandyCrush;

public class Ficha {
    private int fortaleza;
    private int espacio;
    protected int poderDestruccion;

    
    public Ficha(int fortaleza, int espacio, int poderDestruccion) {
        this.fortaleza = fortaleza;
        this.espacio = espacio;
        this.poderDestruccion = poderDestruccion;
    }
   


    public int getFortaleza() {
        return fortaleza;
    }


    public void setFortaleza(int fortaleza) {
        this.fortaleza = fortaleza;
    }


    public int getEspacio() {
        return espacio;
    }


    public void setEspacio(int espacio) {
        this.espacio = espacio;
    }


    public int getPoderDestruccion() {
        return poderDestruccion;
    }


    public void setPoderDestruccion(int poderDestruccion) {
        this.poderDestruccion = poderDestruccion;
    }
    
    
}
