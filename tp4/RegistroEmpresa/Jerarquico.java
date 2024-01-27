package tp4.RegistroEmpresa;

import java.util.List;

public class Jerarquico extends Empleado{
     private List<Empleado> empleadosACargo;

    public Jerarquico(String nombre, String apellido, int edad, int nrolegajo, double sueldo,
            List<Empleado> empleadosACargo) {
        super(nombre, apellido, edad, nrolegajo, sueldo);
        this.empleadosACargo = empleadosACargo;
    }

    public void agregarEmpleadoACargo(Empleado empleado) {
        empleadosACargo.add(empleado);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Jerárquico - ").append(super.toString()).append("\n");
        sb.append("Empleados a Cargo:\n");
        for (Empleado empleado : empleadosACargo) {
            sb.append("- ").append(empleado.getNombre()).append(" ").append(empleado.getApellido()).append("\n");
        }
        return sb.toString();
    }
    
}
