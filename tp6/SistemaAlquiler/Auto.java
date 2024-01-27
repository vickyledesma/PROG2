package tp6.SistemaAlquiler;

public class Auto extends Item{
    private String marca;
    private int km;
    private String patente;
    private String tipoMotor;
    private boolean alquilado;
   

    public Auto(String marca, int km, String patente, String tipoMotor) {
        this.marca = marca;
        this.km = km;
        this.patente = patente;
        this.tipoMotor = tipoMotor;
        this.alquilado = false;
       
    }

    public String getMarca() {
        return marca;
    }

    public int getKm() {
        return km;
    }

    public String getPatente() {
        return patente;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public String obtenerInformacion() {
        return   " Marca: " + marca + ", Patente: " + patente;
    }

   

    @Override
    public boolean estaDisponible() {
        return ! this.alquilado;
    }

    @Override
    public void alquilar() {
        this.alquilado = true;
    }

    @Override
    public String toString() {
        return "Marca: " + this.getMarca() + ". Patente: " + this.getPatente() + " Combustible: " + this.getTipoMotor();
    }
}
    

    
    
