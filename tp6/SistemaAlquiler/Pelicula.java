package tp6.SistemaAlquiler;

public class Pelicula extends Item {
    private String nombre;
    private String genero;
    private int cantPeliculas;
    private int cantCopias;
   


    public Pelicula(String nombre, String genero, int cantPeliculas) {
        this.nombre = nombre;
        this.genero = genero;
        this.cantPeliculas = cantPeliculas;
        this.cantCopias = 0;
    }


    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    public int getCantCopias() {
        return cantCopias;
    }


    public void setCantCopias(int cantCopias) {
        this.cantCopias = cantCopias;
    }

    public boolean estaDisponible() {
        return this.cantCopias < this.cantPeliculas;
    }

    
    public void alquilar() {
        this.cantCopias+=1;
    }

    public String toString() {
        return this.getNombre();
    }
    

    
}
