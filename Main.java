package UDV_EstructuraDatos_Parcial2;
import java.util.Scanner;

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
