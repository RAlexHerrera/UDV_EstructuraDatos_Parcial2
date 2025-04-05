package UDV_EstructuraDatos_Parcial2;

/**
 * Clase que representa un nodo de la lista enlazada.
 */
public class Node {
    int data; // Valor del nodo
    Node next; // Referencia al siguiente nodo

    /**
     * Constructor de la clase Node.
     * @param data Valor del nodo.
     */
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}