import java.util.ArrayList;
import java.util.Arrays;

public class Principal {

    public static void main(String[] args) {
        // Crear casas con constructores
        Casa gryffindor = new Casa("Gryffindor",
                new ArrayList<>(Arrays.asList("Valentía", "Coraje")),
                new ArrayList<>(), new ArrayList<>());

        Casa slytherin = new Casa("Slytherin",
                new ArrayList<>(Arrays.asList("Astucia", "Ambición")),
                new ArrayList<>(), new ArrayList<>());

        Casa hufflepuff = new Casa("Hufflepuff",
                new ArrayList<>(Arrays.asList("Lealtad", "Trabajo Duro")),
                new ArrayList<>(), new ArrayList<>());

        Casa ravenclaw = new Casa("Ravenclaw",
                new ArrayList<>(Arrays.asList("Inteligencia", "Creatividad")),
                new ArrayList<>(), new ArrayList<>());

        // Establecer enemistades
        gryffindor.agregarEnemigo(slytherin);
        slytherin.agregarEnemigo(gryffindor);

        hufflepuff.agregarEnemigo(ravenclaw);
        ravenclaw.agregarEnemigo(hufflepuff);

        // Crear alumnos con constructores
        Alumno harry = new Alumno("Harry Potter",
                new ArrayList<>(Arrays.asList("Valentía", "Coraje")),
                new ArrayList<>());

        Alumno draco = new Alumno("Draco Malfoy",
                new ArrayList<>(Arrays.asList("Astucia", "Ambición")),
                new ArrayList<>());

        Alumno hermione = new Alumno("Hermione Granger",
                new ArrayList<>(Arrays.asList("Inteligencia", "Coraje")),
                new ArrayList<>());

        Alumno cedric = new Alumno("Cedric Diggory",
                new ArrayList<>(Arrays.asList("Lealtad", "Trabajo Duro")),
                new ArrayList<>());

        // Asignar casas a los alumnos
        SombreroSeleccionador sombrero = new SombreroSeleccionador();

        sombrero.asignarCasa(harry, gryffindor);
        sombrero.asignarCasa(draco, slytherin);
        sombrero.asignarCasa(hermione, ravenclaw);
        sombrero.asignarCasa(cedric, hufflepuff);
    }
}
    
