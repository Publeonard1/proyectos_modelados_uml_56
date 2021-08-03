import java.util.ArrayList; //Fase 8: Esta libreria se generó automaticamente para crear la lista ArrayList
import java.util.Scanner; // Esta libreria permite introducir por teclado los datos necesarios para formar la lista

public class Prueba_lista {

    //Fase 9.1: Construir ese ArrayList mediante el constructor de la clase, como es un atributo se le da el modificador private
    private ArrayList<Cliente> listaCliente; //Aquí estamos declarando nuestro atributo llamandolo listaCliente
    // Para inicializar el debemos tomar el constructor de la clase ArrayLis. De manera ordenada se construye el objeto antes y después se agrega a los métodos
    // Fase 9.2: Darle vida al constructor para que inicialice o que es como tal el arreglo
    public Prueba_lista() { //Cuando iniciemos con valores lo dejemos en el constructor para cuando se requiere en otras funciones quede global dentro de la clase lo pueda usar
        listaCliente = new ArrayList<>(); // Ya quedo inicializado nuestro constructor con la subclase Cliente
    }

    /*Fase 8: Creación de listas:
    Lo primero que se va a realizar es un ArrayList, vamos a ingresar unos números que tengán su posición para después buscarlos e eliminarlos
    y luego hacer otro ArrayList para agregar varios Clientes. Vamos a crear un Método llamado generarLista 
    */ /*Pero como me estagenarndo problema si invoco un mètodo de una misma clase en este caso main genera inconveniente y todo lo que hay en este método generarLista se pasa a otra clase*/
    public void generarLista(){ //Por el momento no se generan datos de netrada (Paraemtros o argumentos)
        //Un atributo puede ser una lista y se caracteriza por el tipo de dato que esta tendra.
        ArrayList<Integer> listaNumeros = new ArrayList<>();//Arriba genera automaticamente la libraria para que crear la lista --> import java.util.ArrayList;. 
        Scanner scan = new Scanner(System.in); // se crea un onjeto nuevo llamado scan porque el anterior esta dentro del main y este metodo es aparte 
        int numero = 0; // Vamos a trabajar con un ciclo While para que me pregunte cuantas veces introduzca el número
        while (numero >= 0) { // Con los ciclos podemos repetir objetos, valores y ente caso el mensaje
            System.out.println("Ingrese su cédula (Número negativo para salir): ");
            numero = scan.nextInt(); //Esté nextInt(me convierte de texto a número entero)
            if (numero >= 0){ // Con el condicional me permite guardar solo los numeros positivos
                listaNumeros.add(numero); // Y ahora me agrega el número a la lista
            }
        }
        // Vamos hacer un bucle convecional, contiene un ciclo for para que me de la longitud de la lista
        for (int i = 0; i < listaNumeros.size(); i++){
            System.out.println(listaNumeros.get(i)); // Me mostrará la lista de los elementos en App.java cuando corra programa
        }
        // Vamos hacer la operación anterior pero con forEach (Por cada uno me va a mostrar)
        listaNumeros.forEach(elemento -> { // Esta flecha  -> me indica lo que va a ejecutar en el bloque de .forEach
            System.out.println(elemento); //Aqui en el forEach me va mostrar el valor y no el contenido 
        }); // Y su proposito es que va a recorrer la lista numeros y me va a imprimir cada número
    }

    // Fase 9: Vamos a crear un nuevo método para una lista e ir agregarndo nuevos clientes, y me va recibir un objeto constrido
    public void agregarCliente(Cliente pCliente){ //Aquí se sa como parametro el elemento pCliente con su subclase cliente
        // Se crea está lista en forma de atributo --> Fase 9.1
        listaCliente.add(pCliente);   //Fase9.3: Aquí le indica que necesita un elemento del objeto listaCliente que esta en este metodo como paramentro pCliente 
    }            // Esté pCliente sale en el App.java para crearun objeto y se va tomar los datosdel cliente y su proposito es guaradr esos datos en la lista
    
    // Fase 10: Crear un nuevo método que me permita acceder a está lista solo muestre los nombres de los clientes
    public void mostrar_Nombre_Clientes() {
        for (int i = 0; i < listaCliente.size(); i++){
            System.out.println(listaCliente.get(i).getNombre()); // Tomando el nombre que me esta iterando
        }
    }

    // Fase 11 Cl15Jul: Se realiza un nuevo método para mostrar la totalidad de los datos de los clientes que contiene el objeto
    public void mostrar_Datos_Clientes(){ //En este no me recibe nada de parametros porqué se va amanipular el ArrayList de objetos que ya es propiamente un atributo de esta clase
        String cadena_Clientes = "";
        System.out.println("\nDatos de los clientes"); //\n me permite apartar las impresiones anteriores y seguir con está
        for (int i=0; i< listaCliente.size(); i++){ // i inicia en 0; desde i hasta listaCliente con el tamaño .size; y el incremento de i++
            String datos = "Cédula: " + listaCliente.get(i).getCedula()
                        + "\nnombre:" + listaCliente.get(i).getNombre()
                        + "\nID:" + listaCliente.get(i).getID() 
                        + "\n----------------------------------------";
            cadena_Clientes = cadena_Clientes.concat(datos); //La función concat(str) , me permite tovar el valor de la variable cadena_Clientes y añadiendo otro valor, otra cadena de texto o otra variable
        }
    System.out.println(cadena_Clientes); // Con está impresión le va a mostrar toda la variable cadena_Clientes
    }
}   

/* -----------------------Listas------------------------------------------------------
Se llaman listas a cualquier colección de objetos ordenados por posición, como un array. Podemos 
añadir objetos con sus atributos y métodos, acceder a su pocisión es un objeto, eliminar, copiar, entre otros.

IMPLEMENTACIONES
1. ArrayList: Guarda una lista de elmentos en un array de tamaño dinámico.
2. LinkedList: Permite inserción y borrado de elementos de la lista.
3. Vector: Aumenta o reduce su tamaño de forma dinámica, se usán cuando se acumulan valores.
4. Stack: Representa una pila de objetos de ultimo en entrar, primero en salir (LIFO). 

Comenzamos FASE 8. Creación de listas 

Crear una lista
ist<Integer> listaEnteros(Nombre de nuestra lista) = new(Palabra clave) y el constructor ArrayList<>();
var listaEnteros = new ArrayList<Integer>();

Añadir tamaño de lista
listaEnteros.add(4);
listaEnteros.add(5);
listaEnteros.add(7);
listaEnteros.add(2, 6); // Agrega 6 entre 5 y 7

main es un método estatico y no se pueden llamar elemntos de una misma clase a un método estatico y viceversa

*/