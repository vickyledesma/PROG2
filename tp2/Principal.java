package tp2;


import java.time.LocalDateTime;

public class Principal {
    public static void main(String[] args) {
      Episodio episodio = new Episodio("hola", "hola", true, 5);

      System.out.println(episodio.calificarEpisodio(4));

        Asistente Asistente1 = new Asistente("Nombre1", "123456789", "correo1@example.com");
        Asistente Asistente2 = new Asistente("Nombre2", "987654321", "correo2@example.com");
        Participante participante1 = new Participante("Participante1", Asistente1);
        Participante participante2 = new Participante("Participante2", Asistente2);

        // Crear objetos de Reunion
        LocalDateTime fechaHora1 = LocalDateTime.of(2023, 8, 18, 10, 0);
        Reunion reunion1 = new Reunion(fechaHora1, "Lugar1", "Tema1", 60, new Participante[]{participante1, participante2});

        LocalDateTime fechaHora2 = LocalDateTime.of(2023, 8, 18, 12, 0);
        Reunion reunion2 = new Reunion(fechaHora2, "Lugar2", "Tema2", 45, new Participante[]{participante1});

        // Crear una AgendaPersonal y agregar reuniones
        AgendaPersonal agenda = new AgendaPersonal(10);
        agenda.agregarReunion(reunion1);
        agenda.agregarReunion(reunion2);

        // Verificar si hay conflicto de horarios
        boolean conflicto = agenda.hayConflictoDeHorarios(reunion1);
        System.out.println("Hay conflicto de horarios: " + conflicto);
        Establecimiento establecimiento = new Establecimiento();

        Usuario usuario1 = establecimiento.registrarUsuario("Usuario1");
        Usuario usuario2 = establecimiento.registrarUsuario("Usuario2");

        Cancha canchaFutbol = establecimiento.getCanchas()[0];
        Cancha canchaPaddle = establecimiento.getCanchas()[2];

        Turno turnoFutbolUsuario1 = establecimiento.reservarTurno(canchaFutbol, usuario1);
        Turno turnoPaddleUsuario2 = establecimiento.reservarTurno(canchaPaddle, usuario2);

        System.out.println("Costo del turno de fútbol para " + usuario1.getNombre() + ": " + turnoFutbolUsuario1.calcularCosto());
        System.out.println("Costo del turno de paddle para " + usuario2.getNombre() + ": " + turnoPaddleUsuario2.calcularCosto());

        usuario1.incrementarReservas(); // Simulamos más reservas para hacer a usuario1 socio
        System.out.println(usuario1.getNombre() + " es socio: " + usuario1.esSocio());

        
    }
    
}
