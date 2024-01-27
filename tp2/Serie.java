package tp2;

class Serie {
    private String titulo;
    private String descripcion;
    private String creador;
    private String genero;
    private Temporada[] temporadas;
    private int cantidadTemporadas;

    public Serie(String titulo, String descripcion, String creador, String genero, int cantidadTemporadas) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.creador = creador;
        this.genero = genero;
        this.cantidadTemporadas = cantidadTemporadas;
        this.temporadas = new Temporada[cantidadTemporadas];
    }

    public void agregarTemporada(int indice, Temporada temporada) {
        if (indice >= 0 && indice < cantidadTemporadas) {
            temporadas[indice] = temporada;
        } else {
            System.out.println("Índice de temporada no válido.");
        }
    }

    public int getTotalEpisodiosVistosSerie() {
        int totalVistos = 0;
        for (int i = 0; i < temporadas.length; i++) {
            totalVistos += temporadas[i].getTotalEpisodiosVistos();
        }
        return totalVistos;
    }

    public double getPromedioCalificacionesSerie() {
        int totalCalificaciones = 0;
        int episodiosVistos = 0;
        for (int i = 0; i < temporadas.length; i++) {
            totalCalificaciones += temporadas[i].getPromedioCalificaciones() * temporadas[i].getTotalEpisodiosVistos();
            episodiosVistos += temporadas[i].getTotalEpisodiosVistos();
        }
        return episodiosVistos > 0 ? (double) totalCalificaciones / episodiosVistos : 0;
    }

    public boolean todosEpisodiosVistos() {
        for (int i = 0; i < temporadas.length; i++) {
            for (int j = 0; j < temporadas[i].getTotalEpisodiosVistos(); j++) {
                if (!temporadas[i].getEpisodio(j).estaVisto()) {
                    return false;
                }
            }
        }
        return true;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Temporada[] getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(Temporada[] temporadas) {
        this.temporadas = temporadas;
    }

    public int getCantidadTemporadas() {
        return cantidadTemporadas;
    }

    public void setCantidadTemporadas(int cantidadTemporadas) {
        this.cantidadTemporadas = cantidadTemporadas;
    }
    
}