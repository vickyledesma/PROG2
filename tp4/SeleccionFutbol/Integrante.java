package tp4.SeleccionFutbol;


public class Integrante {
    private String nombre;
    private String apellido;
    private int pasaporte;
    private int fecha;
    private String estado;

    public Integrante(String nombre, String apellido, int pasaporte, int fecha) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.pasaporte = pasaporte;
        this.fecha = fecha;
        this.estado = "En pais de origen";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getPasaporte() {
        return pasaporte;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void viajando() {
        this.estado = "Viajando";
    }

    public void concentracion() {
        this.estado = "En concentración";
    }

    public void enCasa() {
        this.estado = "En país de origen";
    }

    public boolean disponible(){
        if (estado.equals("Viajando") || estado.equals("En concentracion")){
            return false;
        } else {
            return true;
        }
        
    }
    
    
}
