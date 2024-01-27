package tp1;
public class Electrodomestico {
    private String nombre;
    private int precio;
    private String color;
    private int consumoEnergetico;
    private double peso;


    public Electrodomestico(){
        this.nombre = "n";
        this.precio = 100;
        this.color = "gris plata";
        this.consumoEnergetico = 45;
        this.peso = 2;

    }
    public Electrodomestico(String nombre, int precio, String color, int consumo, double peso){
        this.nombre = nombre;
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumo;
        this.peso = peso;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(int consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean esBajoConsumo(){
        boolean esbajo;
        if(this.consumoEnergetico<45){
            esbajo = true;
        } else {
            esbajo = false;
        }
        return esbajo;
    }
    public double balance(){
        double balance = this.precio/this.peso;
        return balance;

    }
    public boolean esAltaGama(){
        boolean esAltaGama;
        if(balance()>3){
            esAltaGama = true;
        } else{
            esAltaGama = false;
        }
        return esAltaGama;
    }
}



