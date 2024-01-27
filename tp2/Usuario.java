package tp2;

public class Usuario {
    private String nombre;
    private int cantReservas;

    public Usuario(String nombre) {
        this.nombre = nombre;
        cantReservas = 0;
    }

    public boolean esSocio() {
        return cantReservas >= 4;
    }

    public void incrementarReservas() {
        cantReservas++;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantReservas() {
        return cantReservas;
    }
}