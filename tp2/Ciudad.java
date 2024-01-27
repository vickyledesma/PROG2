package tp2;

public class Ciudad {
    private String nombre;
    private Impuesto impuestos;
    private int habitantes;
    private double gastoMantenimiento;
    

    public Ciudad(String nombre, Impuesto impuestos, int habitantes, double gastoMantenimiento){
        this.nombre=nombre;
        this.impuestos = impuestos;
        this.habitantes = habitantes;
        this.gastoMantenimiento = gastoMantenimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Impuesto getImpuestos() {
        return impuestos;
    }

    public void setImpuestos(Impuesto impuestos) {
        this.impuestos = impuestos;
    }

    public int getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(int habitantes) {
        this.habitantes = habitantes;
    }

    public double getGastoMantenimiento() {
        return gastoMantenimiento;
    }

    public void setGastoMantenimiento(double gastoMantenimiento) {
        this.gastoMantenimiento = gastoMantenimiento;
    }

    public void controlarHabitantes(int habitantes){
        if(habitantes>100.000){
            Deficit();
        } else {
            System.out.println("No hace falta controlar, porq no tiene mas de 100.000");
        }
    }


    public boolean Deficit(){
        boolean tieneDeficit = false;
        double MontoRecaudado = impuestos.getImp1()+ impuestos.getImp2() + impuestos.getImp3()+ impuestos.getImp4() + impuestos.getImp5();
        if(MontoRecaudado < gastoMantenimiento){
            tieneDeficit=true;
        }
        return tieneDeficit;

    }
    


}
