# ¿Qué es un árbol binario?
Un árbol binario es un conjunto finito de nodos que consta de un nodo raíz que tiene dos subárboles binarios denominados subárbol izquierdo y subárbol derecho.
El árbol binario es una estructura de datos muy útil cuando el tamaño de la estructura no se conoce, se necesita acceder a sus elementos ordenadamente.
En sí un árbol binario es una colección de objetos, cada uno de los cuales contiene datos o una referncia a su subárbol derecho.
Básicamente se pueden utilizar tres formas para recorrer un árbol binario, preorden, inorden, postorden.
En el orden inorden se recorre de la siguiente manera: subárbol izquierdo, raíz, subárbol derecho.

# ¿Cómo se implementó?
Reutilizamos el codigo que nos entregó.
Primero, la clase interna llamada Node, que representa cada nodo del árbol.
Luego la clase Tree que representa el árbol completo y contiene las operaciones principales.
El la clase Tree estan los metodos insert(); que insertará los numeros que ingrese el usuario, y luego de ingresar su raiz, dependiendo su valos, si es menor lo coloca a la izquierda y si es mayor lo coloca a la derecha.
metodo search, el cual devolverá un True si encuaenta el numero que se desea buscar, o false si no lo encuentra.
metodo inorden, nos mostrará los elementos ordenados de menor a mayor.
En la clase principal main, creamos un menu de consola y se realiza la validación de que el valor ingresado sea solo numero.
Luego se creó una sentencia switch y  en cada caso, se realiza el llamada de los métodos, insert(), search(), inorder()

# Ejecución
Al ejecutar el proyecto inicalmente nos muestra un menú en consola:
<img width="1215" height="204" alt="image" src="https://github.com/user-attachments/assets/04dabca4-1fb1-4c95-ad05-d632fe684e6b" />

Escogemos la opción 1 para insertar números:
<img width="1116" height="256" alt="image" src="https://github.com/user-attachments/assets/21f5b273-2ba6-4146-b785-98b1fe338ab6" />

Después de insertar con la opción 1 la cantidad de números, seleccionamos la opción 2 para mostrar el recorrido en inorden:
<img width="1166" height="299" alt="image" src="https://github.com/user-attachments/assets/1b68a3fa-f500-48f9-aea3-9f1cca1918c5" />

<img width="1257" height="345" alt="image" src="https://github.com/user-attachments/assets/af842d23-6dc9-4bff-9a14-691fde8efcce" />

Luego seleccionamos la opción 3 para buscar un número del árbol: 
<img width="1135" height="314" alt="image" src="https://github.com/user-attachments/assets/070b4197-22e9-4ddd-b92b-9e4fe92b9bb3" />

Al buscar un número existente nos confirma: 
<img width="1223" height="309" alt="image" src="https://github.com/user-attachments/assets/b2a3c473-fdc8-40bc-afad-7e61b9da6656" />

Al buscar un número no existente en el árbol nos confirma:
<img width="1244" height="370" alt="image" src="https://github.com/user-attachments/assets/e7e0e70f-0b2a-499a-9d2c-09be7691e187" />

Opción 4 para salir del menú:
<img width="1239" height="248" alt="image" src="https://github.com/user-attachments/assets/3a3fb8de-d848-417d-ba97-4eb505e6cd6c" />

Error al elegir una opción incorrecta del menú:
<img width="1248" height="246" alt="image" src="https://github.com/user-attachments/assets/c3aa298e-3556-46ff-8428-009d3a2949be" />


# Integrantes
Angie Paola Botero Agudelo
Andres Felipe Quiroz Agudelo
Andres Camilo Ospino Mejía
