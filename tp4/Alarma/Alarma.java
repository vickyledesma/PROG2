package tp4.Alarma;

public class Alarma {
    private boolean roto;
    private boolean movimiento;
    private boolean apertura;
    protected Timbre timbre;

    public Alarma(){
        this.roto = false;
        this.movimiento = false;
        this.apertura = false;
        this.timbre = new Timbre();
    }
    public boolean isRoto() {
        return roto;
    }
    public void setRoto(boolean roto) {
        this.roto = roto;
    }
    public boolean isMovimiento() {
        return movimiento;
    }
    public void setMovimiento(boolean movimiento) {
        this.movimiento = movimiento;
    }
    public boolean isApertura() {
        return apertura;
    }
    public void setApertura(boolean apertura) {
        this.apertura = apertura;
    }
    public void comprobar(){
        if (roto || movimiento || apertura){
            timbre.hacerSonar();
        }
    }
    
    
}
