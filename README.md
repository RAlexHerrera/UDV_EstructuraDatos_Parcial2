# UDV_EstructuraDatos_Parcial2
Evaluacion parcial 2, Estructura de Datos, Alumno Rodrigo Herrera, Carne 202102603
 Guía de Ejecución - Lista Enlazada en Java
Ejecutar el Programa
ejecútalo con el siguiente comando:

java Main

## Uso del Programa

Al iniciar la ejecución del programa, verás un menú con diferentes opciones para manipular la lista enlazada ingresando el número correspondiente a la opción deseada:
Opciones del Menú

1. **Agregar un número al final**: Inserta un número al final de la lista.
2. **Agregar un número al inicio**: Inserta un número al principio de la lista.
3. **Agregar un número en una posición específica**: Inserta un número en una posición determinada.
4. **Eliminar un número**: Elimina un número de la lista.
5. **Imprimir la lista**: Muestra los elementos actuales de la lista.
6. **Invertir la lista**: Cambia el orden de los elementos de la lista.
7. **Verificar si un número existe en la lista**: Comprueba si un número está presente en la lista.
8. **Salir**: Finaliza la ejecución del programa.


Main
Es el punto de entrada del programa. Contiene un menú interactivo que permite al usuario trabajar con la lista enlazada: agregar, eliminar, buscar, imprimir, etc.

Node
Representa un nodo individual de la lista enlazada
data: el valor que almacena el nodo.
next: una referencia al siguiente nodo en la lista.

LinkedList
Maneja toda la lógica de la lista enlazada simple, incluyendo operaciones de inserción, eliminación, búsqueda, impresión e inversión.
add(int data)
Agrega un nuevo nodo al final de la lista.
addFirst(int data)
Agrega un nuevo nodo al inicio de la lista.
remove(int data)	
Elimina el primer nodo que contiene el valor indicado.
printList()	
Muestra todos los elementos de la lista en orden, de principio a fin.
reverse()	
Invierte el orden de los nodos en la lista.
contains(int value)	
Verifica si un valor existe en la lista.


Notas Adicionales

- El programa incluye validaciones para evitar errores en la ejecución.
- Se recomienda ingresar valores válidos para evitar interrupciones.
- La lista admite valores duplicados y la eliminación solo afecta la primera coincidencia encontrada.
