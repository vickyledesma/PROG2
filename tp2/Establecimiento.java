package tp2;

public class Establecimiento {
    private Cancha[] canchas;
    private Usuario[] usuarios;

    public Establecimiento() {
        canchas = new Cancha[]{
            new Cancha(400, "Fútbol 5"),
            new Cancha(400, "Fútbol 5"),
            new Cancha(100, "Paddle"),
            new Cancha(100, "Paddle"),
            new Cancha(100, "Paddle"),
            new Cancha(100, "Paddle")
        };
        usuarios = new Usuario[0];
    }

    public Usuario registrarUsuario(String nombre) {
        Usuario usuario = new Usuario(nombre);
        return usuario;
    }

    public Turno reservarTurno(Cancha cancha, Usuario usuario) {
        usuario.incrementarReservas();
        Turno turno = new Turno(usuario, cancha);
        return turno;
    }

    public Cancha[] getCanchas() {
        return canchas;
    }

    public void setCanchas(Cancha[] canchas) {
        this.canchas = canchas;
    }

    public Usuario[] getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuario[] usuarios) {
        this.usuarios = usuarios;
    }
    
}
