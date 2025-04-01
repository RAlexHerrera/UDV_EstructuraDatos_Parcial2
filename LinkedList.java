package UDV_EstructuraDatos_Parcial2;
public class LinkedList {
    private Node head;

    // Método para agregar un nodo al final de la lista
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

    // Método para agregar un nodo al inicio de la lista
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Método para agregar un nodo en una posición específica de la lista
    public void addMiddle(int data, int position) {
        if (position < 1) {
            System.out.println("Posición inválida.");
            return;
        }
        if (position == 1) {
            addFirst(data);
            return;
        }
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
    }

    // Método para eliminar un nodo por su valor
    public void remove(int data) {
        if (head == null) {
            System.out.println("La lista está vacía.");
            return;
        }
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
    }

    // Método para imprimir la lista
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

    // Método para invertir la lista enlazada
    public void reverse() {
        Node prev = null, current = head, next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    // Método para verificar si un valor existe en la lista
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
