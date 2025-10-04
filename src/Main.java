import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        int opcion = 0;

        do {
            // Menú en consola
            System.out.println("\n===== MENÚ ÁRBOL BINARIO =====");
            System.out.println("1. Insertar número");
            System.out.println("2. Mostrar recorrido inorden");
            System.out.println("3. Buscar número");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            // Validar que el usuario ingrese solo números
            if (sc.hasNextInt()) {
                opcion = sc.nextInt();
            } else {
                System.out.println("Error: debe ingresar un número entre 1 y 4.");
                sc.next(); // Limpiar entrada no válida
                continue;  // Volver al menú
            }

            switch (opcion) {
                case 1: // Insertar número
                    System.out.print("Ingrese el número que desea insertar: ");
                    if (sc.hasNextInt()) {
                        int num = sc.nextInt();
                        arbol.insertar(num);
                        System.out.println("Número insertado correctamente.");
                    } else {
                        System.out.println("Error: debe ingresar un número entero válido.");
                        sc.next();
                    }
                    break;

                case 2: // Mostrar recorrido inorden
                    System.out.println("Mostrando recorrido inorden del árbol:");
                    arbol.recorridoInorden();
                    break;

                case 3: // Buscar número
                    System.out.print("Ingrese el número que desea buscar: ");
                    if (sc.hasNextInt()) {
                        int numBuscar = sc.nextInt();
                        boolean encontrado = arbol.buscar(numBuscar);
                        if (encontrado) {
                            System.out.println("✅ El número " + numBuscar + " SÍ se encuentra en el árbol.");
                        } else {
                            System.out.println("❌ El número " + numBuscar + " NO se encuentra en el árbol.");
                        }
                    } else {
                        System.out.println("Error: debe ingresar un número entero válido.");
                        sc.next();
                    }
                    break;

                case 4: // Salir del programa
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Error: opción no válida. Por favor, seleccione entre 1 y