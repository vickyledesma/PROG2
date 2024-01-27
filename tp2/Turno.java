package tp2;

public class Turno {
    private Usuario usuario;
    private Cancha cancha;

    public Turno(Usuario usuario, Cancha cancha) {
        this.usuario = usuario;
        this.cancha = cancha;
    }

    public double calcularCosto() {
        double costo = cancha.getPrecio();
        double descuento = cancha.obtenerDescuento();

        costo = costo - (costo * descuento);
        return costo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Cancha getCancha() {
        return cancha;
    }
}


    
    

