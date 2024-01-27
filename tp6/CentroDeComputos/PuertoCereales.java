package tp6.CentroDeComputos;

public class PuertoCereales {

    private ListaOrdenada barcos;
    private ListaOrdenada camiones;

    public PuertoCereales() {
        barcos = new ListaOrdenada();
        camiones = new ListaOrdenada();
    }

    public Barco addCamion(Camion cam){
        if (barcos.tieneElementos()){
            //Computadora libre = computadoras.remove(0);
            Barco libre = (Barco) barcos.getSiguienteElemento();
            libre.asignarProceso(cam);
            return libre;
        }
        else{ //tengo que guardar el proceso
            camiones.agregarElemento(cam);
            return null;
        }
    }

    
    public void liberarComputadora(Barco barc){
        barc.liberarComputadora();
        barcos.agregarElemento(barc);
    }

}


