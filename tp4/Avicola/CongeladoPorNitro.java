package tp4.Avicola;

public class CongeladoPorNitro extends ProductoCyR{
     private String metodoCongelamiento;
     private int segundosExpuesto;
     
    public CongeladoPorNitro(int fecha, int nroLote, int fechaEnvasado, int codigo, String granjaOrigen, double temp,
            String metodoCongelamiento, int segundosExpuesto) {
        super(fecha, nroLote, fechaEnvasado, codigo, granjaOrigen, temp);
        this.metodoCongelamiento = metodoCongelamiento;
        this.segundosExpuesto = segundosExpuesto;
    }

    public String getMetodoCongelamiento() {
        return metodoCongelamiento;
    }

    public void setMetodoCongelamiento(String metodoCongelamiento) {
        this.metodoCongelamiento = metodoCongelamiento;
    }

    public int getSegundosExpuesto() {
        return segundosExpuesto;
    }

    public void setSegundosExpuesto(int segundosExpuesto) {
        this.segundosExpuesto = segundosExpuesto;
    }
    public String getEtiqueta() {
        return super.getEtiqueta() + "\n Metodo de Congelamiento " + metodoCongelamiento 
        + "Sengundos Expuesto" + segundosExpuesto;
    }
    
}
