package tp4.SeleccionFutbol;

public class Entrenador extends Integrante {
    private int identificador;

    public Entrenador(String nombre, String apellido, int pasaporte, int fecha, int identificador) {
        super(nombre, apellido, pasaporte, fecha);
        this.identificador = identificador;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }
    

    
}
