package tp1;
public class PuntoGeometrico {
    private int y;
    private int x;
    
    public PuntoGeometrico(){
        this.y = 0;
        this.x = 0;

    }
    public PuntoGeometrico(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    

    public void desplazarPuntos(int w, int z){
        this.x += w;
        this.y += z;
    }

    public double distanciaEuclidea(PuntoGeometrico otroPunto) {
        double distanciaX = this.x - otroPunto.x;
        double distanciaY = this.y - otroPunto.y;
        return Math.sqrt(distanciaX * distanciaX + distanciaY * distanciaY);
    }
    public void desplazar(double dx, double dy) {
    }
    
}
class Rectangulo {
    private PuntoGeometrico verticeSuperiorIzquierdo;
    private PuntoGeometrico verticeInferiorDerecho;
    
    public Rectangulo(PuntoGeometrico verticeSuperiorIzquierdo, PuntoGeometrico verticeInferiorDerecho) {
        this.verticeSuperiorIzquierdo = verticeSuperiorIzquierdo;
        this.verticeInferiorDerecho = verticeInferiorDerecho;
    }
    
    public void desplazar(double dx, double dy) {
        this.verticeSuperiorIzquierdo.desplazar(dx, dy);
        this.verticeInferiorDerecho.desplazar(dx, dy);
    }
    
    public double calcularArea() {
        double base = Math.abs(verticeInferiorDerecho.distanciaEuclidea(new PuntoGeometrico(verticeSuperiorIzquierdo.getX(), verticeInferiorDerecho.getY())));
        double altura = Math.abs(verticeSuperiorIzquierdo.distanciaEuclidea(new PuntoGeometrico(verticeSuperiorIzquierdo.getX(), verticeInferiorDerecho.getY())));
        return base * altura;
    }
    
    public int compararCon(Rectangulo otroRectangulo) {
        double areaEsteRectangulo = this.calcularArea();
        double areaOtroRectangulo = otroRectangulo.calcularArea();
        
        if (areaEsteRectangulo > areaOtroRectangulo) {
            return 1;
        } else if (areaEsteRectangulo < areaOtroRectangulo) {
            return -1;
        } else {
            return 0;
        }
    }
    
    public boolean esCuadrado() {
        double base = Math.abs(verticeInferiorDerecho.distanciaEuclidea(new PuntoGeometrico(verticeSuperiorIzquierdo.getX(), verticeInferiorDerecho.getY())));
        double altura = Math.abs(verticeSuperiorIzquierdo.distanciaEuclidea(new PuntoGeometrico(verticeSuperiorIzquierdo.getX(), verticeInferiorDerecho.getY())));
        return base == altura;
    }
    
    public double obtenerLargoLadoSuperior() {
        return Math.abs(verticeInferiorDerecho.distanciaEuclidea(verticeSuperiorIzquierdo));
    }
    
    public boolean estaAcostado() {
        double base = Math.abs(verticeInferiorDerecho.distanciaEuclidea(new PuntoGeometrico(verticeSuperiorIzquierdo.getX(), verticeInferiorDerecho.getY())));
        double altura = Math.abs(verticeSuperiorIzquierdo.distanciaEuclidea(new PuntoGeometrico(verticeSuperiorIzquierdo.getX(), verticeInferiorDerecho.getY())));
        return altura > base;
    }
}