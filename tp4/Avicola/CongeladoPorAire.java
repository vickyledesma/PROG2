package tp4.Avicola;

public class CongeladoPorAire extends ProductoCyR {
    private double porcentajeOxigeno;
    private double porcentajeNitrogeno;
    private double porcentajeDioxido;
    private double porcentajeVapor;


    public CongeladoPorAire(int fecha, int nroLote, int fechaEnvasado, int codigo, String granjaOrigen, double temp,
            double porcentajeOxigeno, double porcentajeNitrogeno, double porcentajeDioxido, double porcentajeVapor) {
        super(fecha, nroLote, fechaEnvasado, codigo, granjaOrigen, temp);
        this.porcentajeOxigeno = porcentajeOxigeno;
        this.porcentajeNitrogeno = porcentajeNitrogeno;
        this.porcentajeDioxido = porcentajeDioxido;
        this.porcentajeVapor = porcentajeVapor;
    }


    public double getPorcentajeOxigeno() {
        return porcentajeOxigeno;
    }


    public void setPorcentajeOxigeno(double porcentajeOxigeno) {
        this.porcentajeOxigeno = porcentajeOxigeno;
    }


    public double getPorcentajeNitrogeno() {
        return porcentajeNitrogeno;
    }


    public void setPorcentajeNitrogeno(double porcentajeNitrogeno) {
        this.porcentajeNitrogeno = porcentajeNitrogeno;
    }


    public double getPorcentajeDioxido() {
        return porcentajeDioxido;
    }


    public void setPorcentajeDioxido(double porcentajeDioxido) {
        this.porcentajeDioxido = porcentajeDioxido;
    }


    public double getPorcentajeVapor() {
        return porcentajeVapor;
    }


    public void setPorcentajeVapor(double porcentajeVapor) {
        this.porcentajeVapor = porcentajeVapor;
    }
    public String getEtiqueta() {
        return super.getEtiqueta() + "\nPorcentaje de Nitrógeno: " + porcentajeNitrogeno
                + "\nPorcentaje de Oxígeno: " + porcentajeOxigeno
                + "\nPorcentaje de Dióxido de Carbono: " + porcentajeDioxido
                + "\nPorcentaje de Vapor de Agua: " + porcentajeVapor;
    }
    
    
}
    