import java.util.Scanner;
public class Main {

    // Arboles binarios de busqueda
    // Implementar las operaciones de inserción, búsqueda y recorrido en orden (in-order traversal).

    static class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    static class Tree {
        Node root;

        Tree() {
            root = null;
        }

        public void insert(int key) {
            root = insertRec(root, key);
        }

        Node insertRec(Node root, int key) {
            if (root == null) {
                root = new Node(key);
                return root;
            }
            if (key < root.key)
                root.left = insertRec(root.left, key);
            else if (key > root.key)
                root.right = insertRec(root.right, key);
            return root;
        }

        boolean search(int key) {
            return searchRec(root, key);
        }

        boolean searchRec(Node root, int key) {
            if (root == null)
                return false;
            if (root.key == key)
                return true;
            return key < root.key ? searchRec(root.left, key) : searchRec(root.right, key);
        }

        public void inorder() {
            inorderRec(root);
        }

        public void inorderRec(Node root) {
            if (root != null) {
                inorderRec(root.left);
                System.out.print(root.key + " ");
                inorderRec(root.right);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tree tree = new Tree();


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
                        tree.insert(num);
                        System.out.println("Número insertado correctamente.");
                    } else {
                        System.out.println("Error: debe ingresar un número entero válido.");
                        sc.next();
                    }
                    break;

                case 2: // Mostrar recorrido inorden
                    System.out.println("Mostrando recorrido inorden del árbol:");
                    tree.inorder();
                    break;

                case 3: // Buscar número
                    System.out.print("Ingrese el número que desea buscar: ");
                    if (sc.hasNextInt()) {
                        int numBuscar = sc.nextInt();
                        boolean encontrado = tree.search(numBuscar);
                        if (encontrado) {
                            System.out.println("El número " + numBuscar + " SÍ se encuentra en el árbol.");
                        } else {
                            System.out.println("El número " + numBuscar + " NO se encuentra en el árbol.");
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
                    System.out.println("Error: opción no válida. Por favor, seleccione entre 1 y 4 ");
                    sc.next();
                    break;

            }
        } while (opcion != 4);
    }
}