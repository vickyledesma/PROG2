package tp4.Avicola;

public class ProductoCyR extends Producto{
    private int fechaEnvasado;
    private int codigo;
    private String granjaOrigen;
    private double temp;

    
    public ProductoCyR(int fecha, int nroLote, int fechaEnvasado, int codigo, String granjaOrigen, double temp) {
        super(fecha, nroLote);
        this.fechaEnvasado = fechaEnvasado;
        this.codigo = codigo;
        this.granjaOrigen = granjaOrigen;
        this.temp = temp;
    }


    public int getFechaEnvasado() {
        return fechaEnvasado;
    }


    public void setFechaEnvasado(int fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }


    public int getCodigo() {
        return codigo;
    }


    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }


    public String getGranjaOrigen() {
        return granjaOrigen;
    }


    public void setGranjaOrigen(String granjaOrigen) {
        this.granjaOrigen = granjaOrigen;
    }


    public double getTemp() {
        return temp;
    }


    public void setTemp(double temp) {
        this.temp = temp;
    }

    public String getEtiqueta() {
        return super.getEtiqueta() + "\nCódigo de Organismo de Supervisión: " + codigo
                + "\nFecha de Envasado: " + fechaEnvasado + "\nTemperatura Recomendada: " + temp
                + "\nGranja de Origen: " + granjaOrigen;
    }
    
    
}
