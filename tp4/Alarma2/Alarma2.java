package tp4.Alarma2;

import tp4.Alarma.Sensor;
import tp4.Alarma.Timbre;

public class Alarma2 {
    private Sensor[] sensores;
    protected Timbre timbre;

    public Alarma2(){
        sensores = new Sensor[2];
        this.timbre = new Timbre();
    }    
    
    public void agregarSensor(Sensor sensor){
        for(int i = 0; i < sensores.length; i++){
            if(sensores[i] == null){
                sensores[i] = sensor;
                break; // Salir del bucle una vez que se agrega el sensor
            }
        }
    }
    public boolean comprobar(){
        for(int i = 0; i < sensores.length; i++){
            if (sensores[i] != null && sensores[i].isActivo()){
                timbre.hacerSonar();
                System.out.println("¡Sensor activo en la zona: " + sensores[i].getNombre() + "!");
                return true;
            }
        }
        return false;
    }
}
    
    
