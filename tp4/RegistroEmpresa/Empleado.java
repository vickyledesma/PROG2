package tp4.RegistroEmpresa;

public class Empleado extends Datos {
    private int nrolegajo;
    private double sueldo;

    public Empleado(String nombre, String apellido, int edad, int nrolegajo, double sueldo) {
        super(nombre, apellido, edad);
        this.nrolegajo = nrolegajo;
        this.sueldo = sueldo;
    }

    public int getNrolegajo() {
        return nrolegajo;
    }

    public void setNrolegajo(int nrolegajo) {
        this.nrolegajo = nrolegajo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    public String toString() {
        return String.format("Empleado - %s, Legajo: %d, Sueldo: %.2f", super.toString(), nrolegajo, sueldo);
    }

    
    
}
