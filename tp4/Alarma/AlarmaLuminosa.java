package tp4.Alarma;

public class AlarmaLuminosa extends Alarma{
    private Luz luz;

    public AlarmaLuminosa(){
        super();
        this.luz = new Luz();
    }

    public void comprobar(){
        if (super.isRoto()|| super.isMovimiento() || super.isApertura()){
            luz.encender();
        }
    }
}
    

