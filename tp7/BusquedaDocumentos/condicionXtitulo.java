public class condicionXtitulo extends Condicion {
    private String substring;

    public condicionXtitulo(String substring) {
        this.substring = substring.toLowerCase();
    }


    @Override
    public boolean cumple(Documento documento) {
        return documento.getTitulo().toLowerCase().contains(substring);
    }
}
