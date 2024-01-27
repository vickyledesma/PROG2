public class CondicionContenido extends Condicion {
    private String palabraFrase;

    public CondicionContenido(String palabraFrase) {
        this.palabraFrase = palabraFrase.toLowerCase();
    }

    @Override
    public boolean cumple(Documento documento) {
        String contenidoDocumento = documento.getContenido().toLowerCase();
        return contenidoDocumento.contains(palabraFrase);
    }
}
