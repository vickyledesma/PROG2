package tp6.SistemaAlquiler;

public class Cliente {
    private String nombre;
    private int cantItemsAlquilados;

    
    public Cliente(String nombre, int cantItemsAlquilados) {
        this.nombre = nombre;
        this.cantItemsAlquilados = cantItemsAlquilados;
    }


    public String getNombre() {
        return nombre;
    }


    public int getCantItemsAlquilados() {
        return cantItemsAlquilados;
    }


    public void setCantItemsAlquilados(int cantItemsAlquilados) {
        this.cantItemsAlquilados = cantItemsAlquilados;
    }


    
}
