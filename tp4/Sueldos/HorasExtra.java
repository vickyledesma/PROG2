package tp4.Sueldos;

public class HorasExtra extends Empleado{
    private int cantHoras;
    private int montoExtra;


    public HorasExtra(int sueldo, int cantHoras, int montoExtra){
        super(sueldo);
        this.cantHoras = cantHoras;
        this.montoExtra =  montoExtra;
    }

    public int getSueldo(){
        return super.getSueldo() + (cantHoras * montoExtra);
    } 



    
}