package UDV_EstructuraDatos_Parcial2;

import java.util.Scanner;

// Clase Node que representa un nodo en la lista enlazada
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Clase LinkedList que implementa las operaciones de la lista enlazada
class LinkedList {
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

// Clase principal con menú interactivo
public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner scanner = new Scanner(System.in);
        int option, data, position;

        // Insertando los dígitos del DNI en la lista al inicio
        long dni = 3595674360101L;
        String dniString = String.valueOf(dni);
        for (char c : dniString.toCharArray()) {
            list.add(Character.getNumericValue(c));
        }

        do {
            System.out.println("\n--- Menú de Lista Enlazada ---");
            System.out.println("1. Agregar al final");
            System.out.println("2. Agregar al inicio");
            System.out.println("3. Agregar en una posición");
            System.out.println("4. Eliminar un valor");
            System.out.println("5. Mostrar lista");
            System.out.println("6. Invertir lista");
            System.out.println("7. Buscar un valor");
            System.out.println("8. Salir");
            System.out.print("Elija una opción: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Ingrese el valor a agregar: ");
                    data = scanner.nextInt();
                    list.add(data);
                    break;
                case 2:
                    System.out.print("Ingrese el valor a agregar al inicio: ");
                    data = scanner.nextInt();
                    list.addFirst(data);
                    break;
                case 3:
                    System.out.print("Ingrese el valor a agregar: ");
                    data = scanner.nextInt();
                    System.out.print("Ingrese la posición: ");
                    position = scanner.nextInt();
                    list.addMiddle(data, position);
                    break;
                case 4:
                    System.out.print("Ingrese el valor a eliminar: ");
                    data = scanner.nextInt();
                    list.remove(data);
                    break;
                case 5:
                    list.printList();
                    break;
                case 6:
                    list.reverse();
                    System.out.println("Lista invertida.");
                    break;
                case 7:
                    System.out.print("Ingrese el valor a buscar: ");
                    data = scanner.nextInt();
                    if (list.contains(data)) {
                        System.out.println("El valor " + data + " está en la lista.");
                    } else {
                        System.out.println("El valor " + data + " NO está en la lista.");
                    }
                    break;
                case 8:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (option != 8);

        scanner.close();
    }
}
