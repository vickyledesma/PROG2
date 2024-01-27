package tp2;

public class Episodio {
    private String titulo;
    private String descripcion;
    private boolean visto;
    private int calificacion;
    
    public Episodio(){
        titulo = "n";
        descripcion ="m";
        visto = false;
        calificacion = 0;
    }

    public Episodio(String titulo, String descripcion, boolean visto, int calificacion){
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.visto = visto;
        this.calificacion = calificacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean estaVisto() {
        return visto;
    }

    public void setvisto(boolean visto) {
        this.visto = visto;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public String calificarEpisodio(int calificacion){
        if(calificacion> 0 && calificacion<5){
            setCalificacion(calificacion);
            setvisto(true);
            return("se califico con exito");
        }
        else {
            return("error, no se puede calificar");
        }
    }
    

    
}
