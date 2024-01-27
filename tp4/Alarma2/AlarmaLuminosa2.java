package tp4.Alarma2;

import tp4.Alarma.Luz;

public class AlarmaLuminosa2 extends Alarma2 {
    private Luz luz;

    public AlarmaLuminosa2(){
        super();
        this.luz = new Luz();
    }

    public void comprobarLuz(){
        boolean alarmaActiva = super.comprobar(); // Verificar si hay sensores activos
        if (alarmaActiva){
            luz.encender();
        }
    }
}
    

