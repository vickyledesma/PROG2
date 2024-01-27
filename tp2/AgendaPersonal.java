package tp2;

import java.time.LocalDateTime;

public class AgendaPersonal {
    private Reunion[] reuniones;
    private int cantReuniones;
    final int MAX=10;

    public AgendaPersonal(int MAX){
        reuniones = new Reunion[MAX];
    }

    public void agregarReunion(Reunion reunion){
        for(int i=0;i<reuniones.length;i++){
            if(i<reuniones.length){
                reuniones[i] = reunion;
                cantReuniones++;
            }else{
                System.out.println("La agenda está llena. No se puede agregar más reuniones.");
            }
        }
    }
    public boolean hayConflictoDeHorarios(Reunion nuevaReunion) {
        for (int i = 0; i < reuniones.length; i++) {
            if (reuniones[i] != null && seSuperponen(reuniones[i], nuevaReunion)) {
                return true;
            }
        }
        return false;
    }

    private boolean seSuperponen(Reunion reunion1, Reunion reunion2) {
    LocalDateTime inicio1 = reunion1.getFechaHora();
    LocalDateTime inicio2 = reunion2.getFechaHora();

    return inicio1.isEqual(inicio2);
    }

    public Reunion[] getReuniones() {
        return reuniones;
    }

    public void setReuniones(Reunion[] reuniones) {
        this.reuniones = reuniones;
    }

    public int getCantReuniones() {
        return cantReuniones;
    }

    public void setCantReuniones(int cantReuniones) {
        this.cantReuniones = cantReuniones;
    }

    public int getMAX() {
        return MAX;
    }
    
    
}

