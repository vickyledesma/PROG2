import java.util.ArrayList;

public class Casa {
    final static int MAX = 20;
    private String nombre;
    private ArrayList<String> cualidadesRequeridas;
    private ArrayList<Alumno> alumnos;
    private ArrayList<Casa> enemigos;


    public Casa(String nombre, ArrayList<String> cualidadesRequeridas, ArrayList<Alumno> alumnos,
            ArrayList<Casa> enemigos) {
        this.nombre = nombre;
        this.cualidadesRequeridas = cualidadesRequeridas;
        this.alumnos = alumnos;
        this.enemigos = enemigos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getCualidadesRequeridas() {
        return cualidadesRequeridas;
    }

    public void setCualidadesRequeridas(ArrayList<String> cualidadesRequeridas) {
        this.cualidadesRequeridas = cualidadesRequeridas;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public ArrayList<Casa> getEnemigos() {
        return enemigos;
    }

    public void setEnemigos(ArrayList<Casa> enemigos) {
        this.enemigos = enemigos;
    }
    public boolean puedeAceptarAlumno(Alumno alumno) {
        return alumnos.size() < MAX && alumno.getCualidades().containsAll(cualidadesRequeridas);
    }

    public void aceptarAlumno(Alumno alumno) {
        if (puedeAceptarAlumno(alumno)) {
            alumnos.add(alumno);
        }
    }

    public void agregarEnemigo(Casa enemigo) {
        enemigos.add(enemigo);
    }

    public String toString() {
        return "Casa: " + nombre; 
    }

    public int size() {
        return 0;
    }

    public Casa get(int i) {
        return null;
    }
}

    
