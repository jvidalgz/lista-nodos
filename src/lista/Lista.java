package lista;

/**
 * Created by jaime on 09-04-2015.
 */
public class Lista {
    // instance variables
    public static final int CAPACITY = 16; // default array capacity
    private Nodo[] data; // generic array used for storage
    private int size = 0; // current number of elements

    public Lista() {
        this(CAPACITY);
    } // constructs list with default capacity

    public Lista(int capacity) { // constructs list with given capacity
        Nodo[] data = new Nodo[capacity];
    }

    public void add(Nodo nodo) {
        data[size] = nodo;
        size++;
    }

    public Nodo get(int i) {
        return data[i];
    }


}