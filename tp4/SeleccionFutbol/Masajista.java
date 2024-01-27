package tp4.SeleccionFutbol;

public class Masajista extends Integrante {
    private String titulo;
    private int cantAños;


    public Masajista(String nombre, String apellido, int pasaporte, int fecha,String titulo, int cantAños) {
        super(nombre, apellido, pasaporte, fecha);
        this.titulo = titulo;
        this.cantAños = cantAños;
    }


    public String getTitulo() {
        return titulo;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public int getCantAños() {
        return cantAños;
    }


    public void setCantAños(int cantAños) {
        this.cantAños = cantAños;
    }
    

    
}
