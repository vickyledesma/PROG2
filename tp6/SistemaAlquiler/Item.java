package tp6.SistemaAlquiler;

public abstract class Item {
    private boolean estaAlquilado;

    public Item() {
        this.estaAlquilado = false; 
    }


    public boolean estaDisponible() {
        return estaAlquilado;
    }

    public boolean setDisponible(boolean estaAlquilado) {
        return this.estaAlquilado = estaAlquilado;
    }
    

    public void alquilar() {
        this.estaAlquilado = true;
    }

}
