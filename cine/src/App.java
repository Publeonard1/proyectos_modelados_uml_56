import java.util.Scanner; //Fase 7.1: Abrir está libreria para introducir la cedula por teclado

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("BIENVENIDOS AL CINE!");
        //Se inicia creando un objeto llamado Cliente cliente

        // CLINETE UNO, tradicional
        Cliente cliente_Uno = new Cliente(); // new palabra clave para darle vida al objeto y el constructor con su mismo nombre de clase
        
        //Fase 7.2: Se copia el Scanner de la clase App.java del proyecto ejemplos  para ingresar los números de cédula
        Scanner sc = new Scanner(System.in); // Se està creando un objeto de la clase Scanner llamado sc que es una utilidad dentro de la libreria de java. y el (System.in) està entrando al sistema
        System.out.println("Ingrese su cédula: "); //Voy a preguntar mi nombre, como un input en .py
        String cedula = sc.nextLine(); // Esté .nextLine() me permite leer la siguiente línea de String cambiamos nombre por cedula que es un atributo de la clase Persona
        cliente_Uno.setCedula(cedula); // Llamamos el método setCedula de la clase Persona para que interactue con la libreria Scanner y ahora se hace para que se escriba el nombre del cliente por teclado
        System.out.println("Ingrese su nombre, por favor: ");
        String nombre = sc.nextLine(); //Cuando se usa este .nextline es para capturar cadenas de texto String y .nextIn es para capturar Tipos enteros 
        cliente_Uno.setNombre(nombre); // Ahí la variable nombre esta lista para que se introduzca por teclado el nombre del cliente

        // Para darle valores de una clase se ha encapsulado o va privado por su atributos, no puede dar directamente valores  por eso se usan los set y los get 
        cliente_Uno.setCedula("1015231489"); /* Ahi es donde se llama el get y el set desde la clase App 
        para operar ya que estos vienen de la clase principal Persona.*/
        cliente_Uno.setNombre("Maria"); // Estos atributos son heradados de  la clase madre Persona
        // Ahora se hereda el setID de la sub clase cliente 
        cliente_Uno.setID(145); // Atributo heredeado de clase
        // Todos objetos variblables las puedo pasar de una clase a otra o de un metodo a otro con sus datos
        
        /* Ahora llamaremos el metodo que se reescribió previamente en la clase cliente con procedencia 
        en la interface clase Tiquete calculado el descuento del tiquete para clientes tradicionales
        cliente_Uno.calcular_Precio(precio_Base) y se reem`laza por el valor del tiquete pero antes
        hay que determinar el objeto si es flotante y como variable llamada precio para que nos retorne 
        esa variable --> float precio = cliente_Uno.calcular_Precio(16000);
        */
        float precio = cliente_Uno.calcular_Precio(16000);
        // Ahora vamos a mostrar por terminal lo que se ha hecho hasta el momento
        System.out.println("Cédula: " + cliente_Uno.getCedula() 
                            + "\nNombre: " + cliente_Uno.getNombre()
                            + "\nID: " + cliente_Uno.getID()
                            + "\nPrecio del Tiquete: " + precio); 
                // para poder concatenarlo se llama a las funciones o métodos get de la clase Persona 
        // Es lo mismo pero en una linea 
        //System.out.println("Cédula: " + cliente_Uno.getCedula() + "\nNombre: " + cliente_Uno.getNombre() + "\nID: " + cliente_Uno.getID() + "Precio del Tiquete: " + precio);
        /*
        BIENVENIDOS AL CINE!
        Cédula: 1015231489
        Nombre: Maria
        ID: 145
        Precio del Tiquete: 15000.0

        Esto es lo que me muestra si estuviera en una impresora para poder tener el boleto y poder
        entrar. ­los \n sirve que de un salto de línea y no quede junto
        */
        // Ahora en esta fase 3 o continuación 3 se agraga un método proveniente de la clase Persona que muestre los datos de los clintes
        cliente_Uno.mostrar_Datos(); 
        // Fase 4: Se imprimen los datos pero ahora como hubo modificación en la subclase cliente con el método mostrar_datos le va a utlizar
        // el ultimo cambio --> Cédula = 1015231489 - Nombre = Maria - ID = 145 mostando ahora el ID del cliente tradicional
        // Este fué el vacio

        //Fase 6: Ejemplo 2 polimorfismo en la Clase padre Persona usando herencia 
        cliente_Uno.saludar(); //Ahí podemos elegir cual nos sirve y que parametro contiene
        // Y mwe imprime "Hola Maria" 
        // Ahora con el segundo método que tiene parametro tipo String, me permite darle texto por que tiene comillas 
        cliente_Uno.saludar("Buenos días,"); // Edito el texto del tipo String "cliente_Uno.saludar(saludo);", Imprimo --> Buenos días, Maria
        //Este es el sobrecargado y es un método que se comporta de diferente modo y se puede replicar dentro de una misma clase!

        // CLIENTE PREMIUM con todo lo anterior
        
        Cliente_premium cliente_Dos = new Cliente_premium(); // Aqui esta el constructor con el mismo nombre de la sublcase

        cliente_Dos.setCedula("1003459845"); 
        cliente_Dos.setNombre("Cesar");
        cliente_Dos.setNumero_tarjeta(34); //Cliente pemium es diferente porqué este tiene numero de trajeta y no ID
        // Ahora se demuestra el cálculo del tiquete con valor de cliente premium
        float precio_premium = cliente_Dos.calcular_Precio(16000);
        // Ahora se imprime 
        System.out.println(); // Esto es para darle un espacio como salto de línea
        // y se copia como está tal cual como la impresión anterior para modificarlo con cliente_Dos
        System.out.println("Cédula: " + cliente_Dos.getCedula() 
                            + "\nNombre: " + cliente_Dos.getNombre()
                            + "\nNúmero de tarjeta: " + cliente_Dos.getNumero_tarjeta() // Cambia por el numero tarjeta
                            + "\nPrecio del Tiquete: " + precio_premium); 
        // Fase 5.1: mostrar los datos del cliente preferencial llamado el método reescrito desde la clase Cliente_premium
        cliente_Dos.mostrar_Datos(); // Lo ejecuta y le mostrará --> Cédula = 1003459845 - Nombre = Cesar - Número de tarjeta = 34
        
        //Fase 6: el ultimo caso de polimorfismo es sobre escribir un método varias veces o que estè repetido y que se comporte distinto dentro de una clase
        cliente_Dos.saludar(); // Hola Cesar
        cliente_Dos.saludar("Buen día,"); // Buen día, Cesar
        // Método que se puede replicar y comportar de distantas formas dentro de la misma clase Persona 
        
        // Fase 7: Escribir por teclado la cedula desde otra clase padre o proyecto pero antes escribir import java.util.Scanner; en la primera línea 
    
        /*Fase 8: Creación de listas:
        Lo primero que se va a ealizar es un ArrayList, vamos a ingresar unos números que tengán su pocisión para después buscarlos e eliminarlos
        y luego hacer otro ArrayList para agregar variios Clientes. Vamos a crear un Método llamado generarLista 
        */ /*Pero como me estagenarndo problema si invoo un mètodo de una misma clase en este caso main genera inconveniente y todo lo que hay en este método generarLista se pasa a otra clase*/
    
        // Ahora se invoca desde la subclase Prueba_lista el ciclo, el método donde esta el ciclo while que me permite introducir por teclado los datos necesarios para guardar los clientes
        // Se llama con un nuevo objeto pruebaContenedor pero antes el nombre de la subclase
        Prueba_lista pruebaContenedor = new Prueba_lista(); //Hace el constructor 
        pruebaContenedor.generarLista(); // luego invoca el método que esta en esa clase  y lleugo correr programa2.

        // Fase 9.3: Crear la lista para que vaya a intruducir los datos, que seán repetitivos con un cilo while 
        String opcion = "S"; 
        while (opcion.equalsIgnoreCase("S")) {   //Se usa el mismo Scanner sc y .equals me permite igualar // El .equalsIgnoreCase permite retornar un buleano ingnorando si es mayuscula o no
            System.out.println("Ingrese su cédula: ");
            cedula = sc.next(); // Uso de next: Me va a leer el contenido de lo que se esta escebiendo por consola pero no va a saltar de línea, se va a quedar en la que está
            System.out.println("Ingrese su nombre: ");
            nombre = sc.nextLine();
            System.out.println("Ingrese si ID");
            int id = sc.nextInt();
            // Se crea el objeto nuevoCliente
            /*Cliente nuevoCliente = new Cliente(); //Para que el objeto nuevo interactue con los metodos de la subclase cliente
            //Esto se comenta para dar a la fase 13: crar en una línea los set y los get
            nuevoCliente.setCedula(cedula);
            nuevoCliente.setNombre(nombre);
            nuevoCliente.setID(id); //Este ciclo busca de manera iterada que me genere varias veces un nuevo clientey borrando el anterior
            
        //Fase 13: Constructores sobrecargados en la subclase Cliente */
            Cliente nuevoCliente = new Cliente(cedula, nombre, id); //Todo este objeto evita lo que hay en las líneas 114 hasta 116


            //Voy a gregar los datos a la lista con el contenerdor pruebaContenedor.generarLista que está dentro del main 
            pruebaContenedor.agregarCliente(nuevoCliente); // Ya tiene todo el paquete de datos del cliente y lo recibe en la subclase Prueba_lista en
            // en su método agregarClinte y lo devuelve aquí en el main y lo itera con este while y agrega a la lista, vueleve el ciclo
            // Ahora se hace otro String que pregunte que si desea agregar otro cliente y culmina este ciclo
            System.out.println("Desea agregar otro cliente? (S / N ): ");
            opcion = sc.next();
            sc.nextLine(); // Cuando llegue a está línea siga pasando a la otra y no se quedé esperando con el .next() anterior
        }
        //Fase 10: Ahora como podemos acceder a esa lista, accediendo desde la subclase Prueba_lista  haiendo un método para que lo invoque aqui en el main
        pruebaContenedor.mostrar_Nombre_Clientes(); // Me va a mostrar una lista de los nombres de los clientes

        // Fase 11: Mostrar todo los datos de los clientes en una factura con los métodos de las subclase Prueba_lista
        /* Para comprovar que el método que me va a mostrar todos los datos del cliente se requiere del objeto pruebaContenedor 
        y el método mostrar_Datos_Clientes de la subclase Prueba_lista*/
        pruebaContenedor.mostrar_Datos_Clientes();

    }
}

// para hacer en el teclado back slash es con alt+92  --> \n esto permite hacer un salto de linea para saber 
//que es lo que se va a imprimir
/* 
Paso 1: Crecación clase Persona como clase madre o principal de nuestro  proyecto en un nuevo
archivo. Con sus atributos cedula y nombre y sus métodos get y set 

public class Persona { // Clase madre o clase principal Persona en el cual tiene dos atributos cedula y nombre
    
    protected String cedula;// El tipo de dato es un String para las cedulas de los clientes para no hacer operaciones matematicas 
    protected String nombre; 
//se le va a agragr los metodos accesorio set y get como están en el modelado de cine
    public void setCedula(String cedulaString){ // En este metodo no me retornara nada
        this.cedula = cedula; // Este atributo es para diferenciar el atributo con un this 
    }
// Ahora getCedula como método accesorio o comportamineto
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
// Los get me van a retornar el tipo de dato en este caso son string ambos 
    public String getCedula(){
        return this.cedula;
    }

    public String getNombre(){
        return this.nombre;
    }

}

Paso 2: SE hace una nueva clase llamada Cliente en un nuevo archivo con su atributo ID y sus métodos get y set
public class Cliente extends Persona{ // En esta sub clase Cliente vamos a heredar o hacer una extención desde la clase madre Persona
    // subclassClinete hereda <-- ClasePersona
    private int id;
//Luego se realiza su get y set como métodos accesorios 
    public void setID(int id){
        this.id = id;
    }

    public int getID (){ 
        return this.id;
    }
}

Paso 3: Hacer una sub clase nueva en otro archivo con su atributo privado y los métodos accesorios get y set
public class Cliente_premium extends Persona{ // Tamabién hereda la conexion con la clase madre llamada Persona
    
    private int numero_tarjeta;

    public void setNumero_tarjeta(int numeroTarjeta){
        this.numero_tarjeta = numeroTarjeta;        
    }

    public int getNumero_tarjeta() { // con la palabra get le busca el nombre de la sub clase y se agrega por defecto 
        return this.numero_tarjeta;
    }
}

Paso 4: Crear la interfaz por lo que es una clase e implementarla y sobre escribir el método 




cd..
git add .
git commit -m "Se crea proyecto cine"
git push origin master

Paso 5: Crear un objeto pero antes de crear un tipo de dato a una variable 
    Cliente cliente_Uno = new  // new palabra clave para darle vida al objeto y el constructor con su mismo nombre de clase
*/


/*
----------------------------Unidad 2, Tercer tema 13J------------------------
COLECCIONES Y EXEPCIONES 

Java collection Framework

Se conoce como una librería que permite manejar contenedores (Estructura de datos--> Listas,
conjuntos de mapas, entre otros), todas estas clases permiten guardar en ellas referencias a objetos .

*/

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

---------------------------------Java Collection Framework-15J-----------------------------------------------
Es como se conocen a la librería de clases contenedoras de java que podemos encontrar en el paquete estándar (java.util)
// Lista de enteros.
// Puede haber enteros repetidos en la lista:
List<Integer> listaDeManzanas;

Estas clases sirven para almacenar colecciones de objetos como listas, conjuntos, mapas, entre otros. 
// Conjunto de enteros. 
// No puede haber enteros repetidos:
Set<Integer> conjuntoDeNaranjas;

Todas estas clase permiten guardaren ellas referencias a objetos 
// Un mapa que asocia a una cadena un entero,
// como en una lista de notas de un examen:
// [("Juan Goytisolo", 9.5), 
// ("Pablo Iglesias", 5.0), ...]
Map<String, Integer> mapaDeNota

------------------------------- Conjusntos----------------------------------
ES otro tipo de contenedor como las listas, pero en el no hay ningún orden de colección de objetos y cada elemento 
sólo aparece una vez al contrario que una lista, donde podian repetirse 
* HashSet: Usa tablas hash para acelerar la búsqueda, adición y aliminación de elementos .
* LinkedHashSet: Es una versión ordenada de HashSet que mantiene una lista doblemente vinculada en todos los elementos.
* TreesET: Usa un árbil binario para acelerar la búsqueda, adición y eliminación de elementos.

* Crear un conjunto 
Set<Integer> conjuntoEnteros = new HashSet<>();
var conjuntoEnteros = new HashSet<Integer>();

* Añadir elementos al conjunto
conjuntoEnteros.add(4);
conjuntoEnteros.add(5);
conjuntoEnteros.add(7);
conjuntoEnteros.add(4); // retorna false por repetido

* Tamaño del conjunto
conjuntoEnteros.size(); // 3 ---> sixe (tamaño)

* Esta en el conjunto ?
conjuntoEnteros.contains(7); // 'true' ---> Los contains sirve  para determinar si el conjunto esta contenido en el mismo
conjuntoEnteros.contains(8); // 'false'

* Eliminar objeto
conjuntoEnteros.remove(new Integer(7)); // true ---> 

* Está Vacía?
conjuntoEnteros.isEmpty(); ---->   // false
conjuntoEnteros.clear(); ----> // Ahora si está vacía

* Recorrer todos los elementos
for (Integer entero: conjuntoEnteros) {
System.out.println(entero);
}

----------------------------------Colas------------------------------------------------------
La cola (Queue) Se usan para insertar elementos al final de la cola y los elimina desde el principio de la cola.
El Deque representa una cola de dos extremos, es decir una cola en la que puede agregar y eliminar elementos de ambos
extremos.

Implememtaciones 
* PriorityQueue: Implementación del algoritmo de cola
* LinkedList: Permite inserción y borrado de elementos de la lista. IMplementa la interface Deque
* ArrayDeque: Proporciona una forma de aplicar array de tamaño dinámico, ademas de la implementación de la interfaz Deque

Queue<Integer> colaEnteros = new PriorityQueue<>();
var colaEnteros = new LinkedList<Integer>();

● Crear cola
colaEnteros.add(4);
colaEnteros.offer(5);
colaEnteros.offer(7);
colaEnteros.offer(6);

●Añadir elementos al conjunto
colaEnteros.size(); // 4

● Tamaño de cola
colaEnteros.poll(); // 4
colaEnteros.remove(); // 5

●Obtener un elemento de cola
colaEnteros.peek(); // 7
colaEnteros.element(); // 7

●Obtener el primer elemento de cola
colaEnteros.remove(); // 7

●Está vacía?
colaEnteros.isEmpty(); // false
colaEnteros.clear(); // Ahora si está vacía

●Recorrer todos los elementos
for (Integer entero: colaEnteros) {
System.out.println(entero);

------------------------------------------Mapas-----------------------------------------------------
Permiten establecer una correspondencia entre pares de objetos: uno que actúa como clave y otro como valor asociado a 
esa clave.
Un diccionario es un mapa entre cadenas de texto: La oalabra que buscamos en el diccionario actúa como clave y su 
significado como valor asociado. Se usan cuando se quiere dar un orden especifico a nuestra información es cuando se 
quiere tener varios datos y necesariamente se requería de diccinarios para organizarlos

Implementación 
Hashtable: Es una estructura de datos que utiliza una función hash. Ya no es usado.
HashMap: Almacena pares clave / valor en una tabla hash, y no están oredandos de ninguna manera.
LinkedHashMap: Agrega una lista vinculada a la estructura del HashMap.
TreeMap: Es implementado como un árbol Rojo-negro, un tipo de árbol binario de búsqueda equilibrada.




------------------------------------------Java Generics-------------------------------------------
Cómo manejar clases y métodos de una forma generica en los cuales yo puede indicarque tipo de dato va atener mi información. 
Los generics fueron introducidos en la versión 5 de Java 2004
Las colecciones (Listas, conjuntos,etc) pueden guardar Objects de cualquier tipo
Restringe los Objects a ser puestos en la colección.
Permiten al compilador informar de muchos errores de compilación que hasta el momento solo se descubririan en tiempos de ejecución

-----------------------------------------Convenciones----------------------------------------------------
Según las convenciones los nombres de los parametros de tipo usados comúnmente son los siguientes:

E: Elemento de una colección 
K: Clave
N: Número
T: tipo
V: valor
S, U, W, etc: Para segundos , terceros y cuartos tipos.

-----------------------------------------Exepciones---------------------------------------------------------
Se conocen como los errores que me van a ocurrir en tiempo de ejcución y que me permiten cortar la ejecución del 
programa.

Captura de Exepciones: Es un mecánismo en el uso de bloques try/catch/finally.
El manejo de exepciones se logra con el bloque try. 
El bloque try pueden manejar multiples exepciones.
La cláusula finally es ejecutada con posterioridad cualquiera sea la condición de termino de try (sin o con error).
Esta sección permite dejar las cosas consistentes antes del término del bloque try

Esquema Try: Intentar 
try {
//Código que puede provocar errores
} catch(Tipo1 var1) { //catch: atrapar
//Gestión del error de tipo Tipo1
} catch(Tipo2 | Tipo3 | Tipo4 var) {
//Gestión del error de tipo Tipo2,
// Tipo3 o Tipo4
} catch(TipoN varN) {
//Gestión del error de tipo TipoN
} finally {  // Se ejecuta con error o no y el clasico es el cierre de conexiones de bases de datos, con maquinas, entre otros
//Código de finally
}



*/