
import java.util.LinkedList;

public class Pila<T> {
    private LinkedList<T> elementos;

    public Pila() {
        elementos = new LinkedList<>();
    }


    public void push(T elemento) {
        elementos.addFirst(elemento);
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("La pila está vacía");
            return null;
        }
        return elementos.removeFirst();
    }

    public T top() {
        if (isEmpty()) {
            System.out.println("La pila está vacía");
            return null;
        }
        return elementos.getFirst();
    }

    public int size() {
        return elementos.size();
    }

    public Pila<T> copy() {
        Pila<T> copia = new Pila<>();
        copia.elementos.addAll(this.elementos);
        return copia;
    }

    public Pila<T> reverse() {
        Pila<T> pilaInversa = new Pila<>();
        for (int i = elementos.size() - 1; i >= 0; i--) {
            pilaInversa.push(elementos.get(i));
        }
        return pilaInversa;
    }

    public boolean isEmpty() {
        return elementos.isEmpty();
    }
}