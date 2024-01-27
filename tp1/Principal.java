package tp1;

public class Principal {
    public static void main(String[] args) {
        Persona p1 = new Persona(4444);
        System.out.println(p1.getNombre());
        System.out.println(p1.saberSiEsMayorDeEdad());
        System.out.println(p1.saberSiPuedeVotar());

        Electrodomestico p2 = new Electrodomestico("pava", 190,"azul",10,10);
        System.out.println(p2.balance());

        PuntoGeometrico punto1 = new PuntoGeometrico(2, 3);
        PuntoGeometrico punto2 = new PuntoGeometrico(5, 7);
        
        System.out.println("Distancia entre los puntos: " + punto1.distanciaEuclidea(punto2));
        
        Rectangulo rectangulo1 = new Rectangulo(punto1, punto2);
        System.out.println("Área del rectángulo: " + rectangulo1.calcularArea());
        System.out.println("¿Es cuadrado? " + rectangulo1.esCuadrado());
        System.out.println("Largo del lado superior: " + rectangulo1.obtenerLargoLadoSuperior());
        System.out.println("¿Está acostado? " + rectangulo1.estaAcostado());
        
    }
}
