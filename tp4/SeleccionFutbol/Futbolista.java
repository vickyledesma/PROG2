package tp4.SeleccionFutbol;

public class Futbolista extends Integrante {
    private String posicion;
    private String manodominante;
    private int cantGoles;

    
    public Futbolista(String nombre, String apellido, int pasaporte, int fecha,String posicion, String manodominante, int cantGoles) {
        super(nombre, apellido, pasaporte, fecha);
        this.posicion = posicion;
        this.manodominante = manodominante;
        this.cantGoles = cantGoles;
    }


    public String getPosicion() {
        return posicion;
    }


    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }


    public String getManodominante() {
        return manodominante;
    }


    public void setManodominante(String manodominante) {
        this.manodominante = manodominante;
    }


    public int getCantGoles() {
        return cantGoles;
    }


    public void setCantGoles(int cantGoles) {
        this.cantGoles = cantGoles;
    }
    
}
