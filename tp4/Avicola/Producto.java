package tp4.Avicola;

public class Producto {
    private int fecha;
    private int nroLote;
    
    public Producto(int fecha, int nroLote) {
        this.fecha = fecha;
        this.nroLote = nroLote;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public int getNroLote() {
        return nroLote;
    }

    public void setNroLote(int nroLote) {
        this.nroLote = nroLote;
    }

     public String getEtiqueta() {
        return "Fecha de Vencimiento: " + fecha + "\nNúmero de Lote: " + nroLote;
    }
    
}
