package tp2;

public class Temporada {
    private Episodio[] episodios; //arreglo
    private int cantidadEpisodios;

    public Temporada(int cantidadEpisodios) {
        this.cantidadEpisodios = cantidadEpisodios;
        this.episodios = new Episodio[cantidadEpisodios];
    }

    public void agregarEpisodio(int indice, Episodio episodio) {
        if (indice >= 0 && indice < cantidadEpisodios) {
            episodios[indice] = episodio;
        } else {
            System.out.println("Índice de episodio no válido.");
        }
    }
    public Episodio getEpisodio(int indice) {
        if (indice >= 0 && indice < cantidadEpisodios) {
            return episodios[indice];
        } else {
            System.out.println("Índice de episodio no válido.");
            return null;
        }
    }

    public int getTotalEpisodiosVistos() {
        int totalVistos = 0;
        for (int i = 0; i < episodios.length; i++) {
            if (episodios[i] != null && episodios[i].estaVisto()) {
                totalVistos++;
            }
        }
        return totalVistos;
    }

    public double getPromedioCalificaciones() {
        int totalCalificaciones = 0;
        int episodiosVistos = 0;
        for (int i = 0; i < episodios.length; i++) {
            if (episodios[i] != null && episodios[i].estaVisto()) {
                totalCalificaciones += episodios[i].getCalificacion();
                episodiosVistos++;
            }
        }
        return episodiosVistos > 0 ? (double) totalCalificaciones / episodiosVistos : 0;
    }
}



    

