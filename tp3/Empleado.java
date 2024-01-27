package tp3;

public class Empleado {
    private String nombre;
    private int cantEncuestas;

    public Empleado(String nombre){

        this.nombre=nombre;
        cantEncuestas=0;

    }

    public int incrementarEncuestas(){
        return cantEncuestas++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantEncuestas() {
        return cantEncuestas;
    }

    public void setCantEncuestas(int cantEncuestas) {
        this.cantEncuestas = cantEncuestas;
    }
}
