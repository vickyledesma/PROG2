package tp4.Sueldos;

public class Comision extends Empleado {
    private int cantVentas;
    private int montoExtra;


    public Comision(int sueldo, int cantVentas, int montoExtra){      
        super(sueldo);
        this.cantVentas = cantVentas;
        this.montoExtra = montoExtra;
    }
    
    public int getSueldo(){
        return super.getSueldo() + (cantVentas * montoExtra);
    }
}
