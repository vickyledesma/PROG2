package tp6.CentroDeComputos;

import java.time.LocalDate;

public class Camion extends ObjetoComparable{
    private String nombre;
    private LocalDate fecha;


    public String getNombre() {
        return nombre;
    }
  
    public LocalDate getFecha() {
        return fecha;
    }

    @Override
    public String toString() {
        return "Camion [nombre=" + nombre + ", fecha=" + fecha + "]";
    }
    @Override
    public boolean esMenor(ObjetoComparable otro) {
        LocalDate thisfecha = this.getFecha();
        LocalDate fechaOtro = ((Camion) otro).getFecha();
        return thisfecha.isBefore(fechaOtro);
    }



    
}
