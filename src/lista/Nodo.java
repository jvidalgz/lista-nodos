package lista;

/**
 * Created by nacho on 09-04-2015.
 */
public class Nodo {
    public String dato;


    public Nodo(String d){
        this.dato=d;
        }

    @Override
    public String toString() {
        return "Nodo{" +
                "dato='" + dato + '\'' +
                '}';
    }
}
