package tp2;

public class Pais {
    private Provincia[] provincias;
    private int cantidadProvincias;
    
    public Pais(int capacidadProvincias) {
        provincias = new Provincia[capacidadProvincias];
        cantidadProvincias = 0;
    }
    
    public void agregarProvincia(Provincia provincia) {
        if (cantidadProvincias < provincias.length) {
            provincias[cantidadProvincias] = provincia;
            cantidadProvincias++;
        }
    }
    
    public void ciudadesEnDeficit() {
        for (int i = 0; i < cantidadProvincias; i++) {
            if (provincias[i].masDeLaMitadEnDeficit()) {
                System.out.println("Provincia: " + provincias[i].getNombre() + " tiene más de la mitad de ciudades en déficit.");
            }
        }
    }
}

