package tp4.Avicola;

public class ProductoFresco extends Producto {
    private int fechaEnvasado;
    private String granjaOrigen;
    
    public ProductoFresco(int fecha, int nroLote, int fechaEnvasado, String granjaOrigen) {
        super(fecha, nroLote);
        this.fechaEnvasado = fechaEnvasado;
        this.granjaOrigen = granjaOrigen;
    }

    public int getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(int fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public String getGranjaOrigen() {
        return granjaOrigen;
    }

    public void setGranjaOrigen(String granjaOrigen) {
        this.granjaOrigen = granjaOrigen;
    }

    public String getEtiqueta() {
        return super.getEtiqueta() + "\nFecha de Envasado: " + fechaEnvasado + "\nGranja de Origen: " + granjaOrigen;
    }
}
