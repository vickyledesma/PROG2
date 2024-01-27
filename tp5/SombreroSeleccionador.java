import java.util.ArrayList;

public class SombreroSeleccionador {

    public void asignarCasa(Alumno alumno, Casa casas){
        for(int i = 0 ; i < casas.size(); i++){
            Casa casa = casas.get(i);
            if(casa.puedeAceptarAlumno(alumno) && cumpleEnemigos(alumno, casa)){
                casa.aceptarAlumno(alumno);
                alumno.agregarFamiliar(casa);
            }
        }
        System.out.println("se agrego el alumno " + alumno + "a la casa " + casas);
        
    }
    private static boolean cumpleEnemigos(Alumno alumno, Casa casa) {
        ArrayList<Casa> familiares = alumno.getFamiliares();
        ArrayList<Casa> enemigos = casa.getEnemigos();
        
        for (int i = 0; i < familiares.size(); i++) {
            Casa familiar = familiares.get(i);
            if (enemigos.contains(familiar)) {
                return false;
            }
        }
        return true;
    }
    
}
