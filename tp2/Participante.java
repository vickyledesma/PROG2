package tp2;

public class Participante {
    private String nombre;
    private Asistente asistente;

    public Participante(String nombre, Asistente asistente) {
        this.nombre = nombre;
        this.asistente = asistente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Asistente getAsistente() {
        return asistente;
    }

    public void setAsistente(Asistente asistente) {
        this.asistente = asistente;
    }

    
}
