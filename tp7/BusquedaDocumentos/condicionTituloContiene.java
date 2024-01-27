public class condicionTituloContiene extends Condicion {
    private String palabraClave;

    public condicionTituloContiene(String palabraClave) {
        this.palabraClave = palabraClave.toLowerCase();
    }

    @Override
    public boolean cumple(Documento documento) {
        String tituloDocumento = documento.getTitulo().toLowerCase();
        return tituloDocumento.contains(palabraClave);
    }
}