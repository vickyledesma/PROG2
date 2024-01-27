package tp7.CandyCrush;

import java.util.ArrayList;

public class Tablero {
    private int puntajeMinimo;
    private ArrayList<Ficha> fichas;
    private int dificultad;


    public Tablero(int puntajeMinimo, ArrayList<Ficha> fichas, int dificultad) {
        this.puntajeMinimo = puntajeMinimo;
        this.fichas = new ArrayList<>();
        this.dificultad = calcularDificultad();
    }


    public int getPuntajeMinimo() {
        return puntajeMinimo;
    }


    public void setPuntajeMinimo(int puntajeMinimo) {
        this.puntajeMinimo = puntajeMinimo;
    }


    public ArrayList<Ficha> getFichas() {
        return fichas;
    }


    public void setFichas(ArrayList<Ficha> fichas) {
        this.fichas = fichas;
    }


    public int getDificultad() {
        return dificultad;
    }


    public void setDificultad(int dificultad) {
        this.dificultad = dificultad;
    }
    
    public int calcularDificultad(){
        int sumaFortaleza = 0;
        int sumaPoder = 0;
        for(int i=0;i<fichas.size();i++){
            Ficha ficha = fichas.get(i);
            sumaFortaleza += ficha.getFortaleza();
            sumaPoder += ficha.getPoderDestruccion();
        }
        return sumaFortaleza/sumaPoder;
    }

    public ArrayList<Ficha> buscador(Condicion condicion){
        ArrayList<Ficha> lista = new ArrayList<>();
        for(int i=0;i<fichas.size();i++){
            Ficha ficha = fichas.get(i);
            if(condicion.cumple(ficha)){
                lista.add(ficha);
            }
        }
        return lista;
    }
}
