package tp2;

public class Provincia {
    private String nombre;
    private Ciudad[] ciudades;
    private int cantCiudades;
    
    
    
    public Provincia(String nombre, int capacidadCiudades){
        this.nombre=nombre;
        ciudades = new Ciudad[capacidadCiudades];
        cantCiudades = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Ciudad[] getCiudades() {
        return ciudades;
    }

    public void setCiudades(Ciudad[] ciudades) {
        this.ciudades = ciudades;
    }

    public int getCantCiudades() {
        return cantCiudades;
    }

    public void setCantCiudades(int cantCiudades) {
        this.cantCiudades = cantCiudades;
    }

    public void agregarCiudad(Ciudad ciudad) {
        if (cantCiudades < ciudades.length) {
            ciudades[cantCiudades] = ciudad;
            cantCiudades++;
        }
    }

    public boolean masDeLaMitadEnDeficit() {
        int ciudadesEnDeficit = 0;

        for (int i = 0; i < cantCiudades; i++) {
            if (ciudades[i].Deficit()) {
                ciudadesEnDeficit++;
            }
        }

        return ciudadesEnDeficit > cantCiudades / 2;
    }
}



