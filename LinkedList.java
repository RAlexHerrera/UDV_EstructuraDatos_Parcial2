package UDV_EstructuraDatos_Parcial2;
/**
 * Clase que representa una lista enlazada simple.
 */
public class LinkedList {
    private Node head; // Nodo inicial (cabeza) de la lista

    /**
     * Método para agregar un nodo al final de la lista.
     * @param data Valor a agregar.
     */
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    /**
     * Método para agregar un nodo al inicio de la lista.
     * @param data Valor a agregar.
     */
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    /**
     * Método para agregar un nodo en una posición específica de la lista.
     * @param data Valor a agregar.
     * @param position Posición en la lista (1-based index).
     */
    public void addMiddle(int data, int position) {
        if (position < 1) {
            System.out.println("Posición inválida.");
            return;
        }
        if (position == 1) {
            addFirst(data);
            return;
        }
        try {
            Node newNode = new Node(data);
            Node temp = head;
            for (int i = 1; temp != null && i < position - 1; i++) {
                temp = temp.next;
            }
            if (temp == null) {
                System.out.println("La posición excede la longitud de la lista.");
                return;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        } catch (Exception e) {
            System.out.println("Error al insertar en la posición: " + e.getMessage());
        }
    }

    /**
     * Método para eliminar un nodo por su valor.
     * @param data Valor a eliminar.
     */
    public void remove(int data) {
        if (head == null) {
            System.out.println("La lista está vacía.");
            return;
        }
        try {
            if (head.data == data) {
                head = head.next;
                return;
            }
            Node temp = head;
            while (temp.next != null && temp.next.data != data) {
                temp = temp.next;
            }
            if (temp.next == null) {
                System.out.println("Valor no encontrado en la lista.");
                return;
            }
            temp.next = temp.next.next;
        } catch (Exception e) {
            System.out.println("Error al eliminar el valor: " + e.getMessage());
        }
    }

    /**
     * Método para imprimir la lista enlazada.
     */
    public void printList() {
        if (head == null) {
            System.out.println("La lista está vacía.");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    /**
     * Método para invertir la lista enlazada.
     */
    public void reverse() {
        Node prev = null, current = head, next;
        try {
            while (current != null) {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            head = prev;
        } catch (Exception e) {
            System.out.println("Error al invertir la lista: " + e.getMessage());
        }
    }

    /**
     * Método para verificar si un valor existe en la lista.
     * @param value Valor a buscar.
     * @return true si existe, false en caso contrario.
     */
    public boolean contains(int value) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == value) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
}
