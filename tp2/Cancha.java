package tp2;

public class Cancha {
    private int precio;
    private String tipo;

    public Cancha(int precio, String tipo) {
        this.precio = precio;
        this.tipo = tipo;
    }

    public int getPrecio() {
        return precio;
    }

    public String getTipo() {
        return tipo;
    }

    public double obtenerDescuento() {
        if (tipo.equals("Fútbol")) {
            return 0.1; // 10% de descuento para canchas de fútbol
        } else {
            return 0; // No hay descuento para otros tipos de canchas
        }
    }
}