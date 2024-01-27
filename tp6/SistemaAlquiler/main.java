package tp6.SistemaAlquiler;

import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
        Sistema sistema = new Sistema();

        // Crear clientes
        Cliente cliente1 = new Cliente("Cliente1", 10);
        Cliente cliente2 = new Cliente("Cliente2", 20);

        // Crear ítems (por ejemplo, autos y películas)
        Auto auto1 = new Auto("Marca1", 10000, "ABC123", "Nafta");
        Pelicula pelicula1 = new Pelicula("Pelicula1", "Aventura", 5);

        // Agregar clientes e ítems al sistema
        sistema.addCliente(cliente1);
        sistema.addCliente(cliente2);
        sistema.addItem(auto1);
        sistema.addItem(pelicula1);

        LocalDate fechaVencimiento1 = LocalDate.of(2022, 10, 15);
        LocalDate fechaVencimiento2 = LocalDate.of(2023, 11, 1);

        // Realizar alquileres con fecha de vencimiento
        Alquiler alquiler1 = new Alquiler(cliente1, auto1, fechaVencimiento1);
        Alquiler alquiler2 = new Alquiler(cliente2, pelicula1, fechaVencimiento2);


        sistema.addAlquiler(alquiler1);
        sistema.addAlquiler(alquiler2);

        // Verificar alquileres vencidos
        System.out.println("Alquileres vencidos:");
        sistema.seVencioAlquiler();

        // Verificar disponibilidad de ítems
        System.out.println("\nÍtems disponibles para alquilar:");
        sistema.sePuedeAlquilar();
    }
}
    

