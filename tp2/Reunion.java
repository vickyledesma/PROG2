package tp2;

import java.time.LocalDateTime;

public class Reunion {
    private LocalDateTime fechaHora;  
    private String lugar;
    private String tema;
    private Participante[] participantes;

    public Reunion(LocalDateTime fechaHora, String lugar, String tema, int i, Participante[] participantes) {
        this.fechaHora = fechaHora;
        this.lugar = lugar;
        this.tema = tema;
        this.participantes = participantes;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public Participante[] getParticipantes() {
        return participantes;
    }

    public void setParticipantes(Participante[] participantes) {
        this.participantes = participantes;
    }


     
}
