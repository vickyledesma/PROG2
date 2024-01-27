package tp4.Avicola;

public class CongeladoPorAgua extends ProductoCyR{
    private String salinidad;

    public CongeladoPorAgua(int fecha, int nroLote, int fechaEnvasado, int codigo, String granjaOrigen, double temp,
            String salinidad) {
        super(fecha, nroLote, fechaEnvasado, codigo, granjaOrigen, temp);
        this.salinidad = salinidad;
    }

    public String getSalinidad() {
        return salinidad;
    }

    public void setSalinidad(String salinidad) {
        this.salinidad = salinidad;
    }
    public String getEtiqueta() {
        return super.getEtiqueta() + "\nSalinidad del Agua (g/L): " + salinidad;
    }

    
}
