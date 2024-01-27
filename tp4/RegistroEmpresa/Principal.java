package tp4.RegistroEmpresa;

public class Principal {
public static void main(String[] args) {
        // Crear algunas personas y roles
        Empleado empleado1 = new Empleado("Empleado1", "Apellido1", 30, 101, 50000.0);
        UsuarioFinal usuario1 = new UsuarioFinal("Usuario1", "Apellido2", 25, "user1", "password1");
        Jerarquico jefe1 = new Jerarquico("Jefe1", "Apellido3", 40, 201, 80000.0, null);

        // Agregar empleados a cargo del jerárquico
        jefe1.agregarEmpleadoACargo(empleado1);

        // Generar el listado de personas
        String listadoPersonas = obtenerListadoPersonas(empleado1, usuario1, jefe1);
        System.out.println(listadoPersonas);
    }

    public static String obtenerListadoPersonas(Datos... personas) {
        StringBuilder sb = new StringBuilder();
        for (Datos persona : personas) {
            sb.append(persona.toString()).append("\n");
        }
        return sb.toString();
    }
}