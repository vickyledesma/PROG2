package tp6.CentroDeComputos;

public class Barco extends ObjetoComparable {
    private int capacidad;
    private String nombre;
    Camion ejecutando;

    public Barco(int capacidad, String nombre, Camion ejecutando) {
        this.capacidad = capacidad;
        this.nombre = nombre;
        this.ejecutando = null;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void asignarProceso(Camion cam) {
        ejecutando = cam;
    }

    public boolean estaLibre(){
        return ejecutando==null;
    }

    public void liberarComputadora(){
        this.ejecutando = null;
    }



    @Override
    public String toString() {
        return "Barco [capacidad=" + capacidad + ", nombre=" + nombre + "]";
    }
    @Override
    public boolean esMenor(ObjetoComparable otro) {
        return this.getCapacidad() < ((Barco) otro).getCapacidad();
    }

    
}
