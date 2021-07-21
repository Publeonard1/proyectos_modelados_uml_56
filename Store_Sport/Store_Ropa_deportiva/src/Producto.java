public class Producto { // Modificador publico y nuestra clase Producto que empieza en Mayuscula
    private String nombre_producto = ""; //Se puede colocar el tipo de dato en string para los objetos nombre y producto
    private Double precio = 0.0; // Los precios se dejan en decimal con el atributo precio
    
    public void mostrar(){ //el void sirve para que no retorne nada, si se necesitara de un int se usa return
        System.out.print(nombre_producto + ": " + precio);
    } 
    // Despues de hacer modificación en nuestro modelado UML se le agrega aquí los métodos accesorios Nombre y Precios con set y get
    public void setNombre_producto(String nombre_producto){
        this.nombre_producto = nombre_producto; //nombre_producto = nombre_producto; para no generar conflicto se llama el atributo con (this) para que no sean iguales a la hora de operar como variable y le està haciendo referencia al atributo 
        // o tambien se puede omitir esta confución es con public void setNombre(String nombre){
        // nombre_producto = a para quitar la confución y que no sea igual a la variable
        // ese this.nombre ese punto es de la clase
    }
    public void setPrecio(Double precio){ // El void es para que no le returne el atributo
        this.precio = precio;
    }

    // Ahora con los metodos accesorio get para nombre_producto y precio
    public String getNombre_producto(){ // Cuando se genere el metodo le va a generar un error pidiendole que le agregue un return con el atributo nombre_producto
        return this.nombre_producto;
    }
    public Double getPrecio(){
        return this.precio;
    }

    // Vamos hacer un constructor, se puede al inicio o al final, el orden en java no insterfiere pero por organización
    public Producto(){
        // por ahora está vacio el constructor
    }
    // vamos a trabajar en nuestra clase principal de App.java
}


/* CLASES JAVA -------
---------------------------MODIFICADOR DE CLASE.------------------------------------
public: Visible para todas las clases 
final: Ultima definición de clase. No podrá tener subclases 
<Sin modoficador>: Solo visible por clases del paquete
---------------------------ATRIBUTOS------------------------------------------------
<modificador> <tipo> <nombre> [= <valor x defecto>];

● public: Pueden ser modificados por un objeto
externo.
● private: Sólo son accesibles dentro de la clase.
(Recomendado)
● protected: Público para paquete e hijas, privado
para los demás.
● final: Solo puede tener 1 valor (constante).
● static: Compartido por todos los objetos. Si un objeto
cambia el valor, todos veran el cambio. También es
llamada variable de clase.
● <sin modificador>: Solo visible por clases del
paquete.

public final class Miprimerclase {
    private static final Double PI =3.1416;Atributo
    private integer contador = 0; Atributo
}
En este caso se está creando una constante 
pirvate = atributo privado 
static: para todos los objetos 
final: porque es un valor vconstante

------------------------METODOS---------------------------------
Son las funicones que se van a realizar en la clase o aplicación 
la siguiente estructura para formar un metodo

    <modificador> <tipo retorno> <nombre> 
    (<parametro>*){
        <sentecia >*
}
    <modificador> class <Nombre Clase> {
        <Atributos>
        <Constructores>
        <Métodos>
}
    public final class MiPrimerClase {
        private static final double PI = 3.1416;
        private Integer contador = 0;
        public void incrementarContador(Integer cantidad) { // integer es como acompañar la variable 
        contador += cantidad;
}

Tipo de retorno: puede ser cualquier tipo de datos, incluyendo void en 
caso de no devolver un valor.
Nombre de método:
● Los nombres reflejan los comportamientos, por lo tanto deben 
empezar con una acción (verbo).
● Los nombres de métodos deben comenzar con letra minúscula.
Parámetros: es una lista de declaraciones de variables (separados por 
coma) que determina la información que necesita para su ejecución.

-------------------Métodos de acceso y mutadores----------------------
Metodos de acceso GET 
get<NombreVarieble>
Son accesos especiales para que mi objeto pueda tener acceso desde otra clase lo pueda abrir 
con el set y get cuando los atributos estan privados cambiandoles valores y modificando a los atributos
En pocas palabras me permiten modificar los atributos

Metodos Mutadores: Sirven
<modificador> class <Nombre Clase> {
    <Atributos>
    <Constructores>
    <Métodos>
    }
    public final class MiPrimerClase {
    private Integer contador = 0;

    public Integer getContador() {
    return contador; // Aquí solo retorna el atributo contador
    }
    public void setContador(Integer valor) { // y aqui usa el void para no retornar el atributo y este si va tener parametros 
    contador = valor;
    }
}
Lo recomemdado es cuando se construya las clases, los métodos accesorios a cada uno de los atributos 
que se tiene 

public class Producto { // Modificador publico y nuestra clase Producto que empieza en Mayuscula
    // <Atributos> Ej. Que es rojo, alto
    // <Contructores> Es una función principal de cada una de las clases y se va a llamar igual al nombre que tiene la clase, dando vida al objeto cuando se este creando la clase recibiendo parametros vacios o con datos 
    // <Métodos> 
    // public final class Producto 
}
-----------------CONSTRUTORES EN JAVA.--------------------

Es un método especial que permite la creación de objetos de la clase. El nombre del constructur debe
ser igual al nombre de la clase y no retorna ningún valor, ni siquiera void. Solo se puede llamar utilizando 
con el operador  NEW durante la instalanción.
El constructor  es aquel que se define sin parametros. Si no se define ningún constructor en la clase,
el lenguaje crea uno por defecto.

<modificador> class <Nombre Clase> {
    <Atributos>
    <Constructores>
    <Métodos>
    }
public final class MiPrimerClase { // en este constructor es publico por defecto y eñ nombre de la clase y ya
    
    public MiPrimerClase(){
    }

    public MiPrimerClase(Integer cont) { // este constructor es con parametro con valores iniciales 
    contador = cont;
    }
}
--------------------------PALABRA RESERVADA this en JAVA--------------------
alabra reservada this
● Desambiguar los atributos locales de 
variables locales.
● Para referirse al objeto que invocó el 
método no estático.
● para referirse a otros constructores 
de la clase. 
ejemplo
public class EjemploThis {
    private Integer dato;

    public EjemploThis() { //en este caso esta haciendo referencia al constructor de la clase y le este pasando como argumento el número 100
    this(100);
    }
    public EjemploThis(Integer dato) { // Va a llamar el setDato de esta clase EjemploThis
    this.setDato(dato);
    }
    public void setDato(Integer dato) { // Hace referencia al atributo dato 
    this.dato = dato;
    }
    public Integer getDato() {
    return this.dato;
    }
}

----------------------------------CALSE ABSTRACTA------------------
Es una clase que no tiene objetos, Se usa para heredar apartir de ella, es decir, en una clase abstracta se describen los atributos 
y las operaciones comunes para otras clases. Se especifica de forma explicita poniendo {abstracta} del compartimiento del nombre
en cursiva. si tiene algun metodo abstracto, tambien va en cursivas
Una clase abstracta tiene operaciones abstractas, Esta operación es aquella que no tiene metodo de implementación 
en la superclase donde esta definida.

<modificador> abstract class <Nombre Clase> {
    <Atributos>
    <Constructores>
    <Métodos>
}

Las clases abstractas son un tipo especial que define que la clase no está completamente definida y por lo tanto no puede ser instanciada.
Debe ser marcada con el modoficador abstrac y esto permite que dentro de la definición de la clase puedan existir métodos abstractos 
(que no esté definda su implementación).

public abstract class ClaseAbstracta {

    public abstract implementar();
}

--------------------INTERFACES-----------------------------------------------
Polimorfismo: Es cuando se puede cambiar el comportamiento a un metodo(función).
Describe  solo operaciones (metodos) abstractos, que especifican un comportamiento que una clase puede elegir soportar 
implementando la interdaz. No inclueye atributos ni ninguna implementación.
Al igual que las clases, las interfaces pueden pasrticipar en relaciones de asociacion,
dependencia y generalización. 
Las interfaces se pueden representargraficamente por medio de un circulo pequeño en uml con un nombre situado debajo de él.
<modificador> interface <Nombre_Clase>{
    <metodos> //Operaciones
}

Las interfaces permiten que las clases independiente de su unbicación en la jerarquia de clases, implementar
comportamientos comunes.

Modificador de clase: Determina la vidsibilidad o suo de la clase 
*public: visibles para todas las clases 
*<sin modificador>: Solo visible por clases del paquete 

public interface Impresora {
    public void imprimir(String texto);
    public int getVelocidad();
}

Las interfaces no tienen cuerpo, toda clase que cumpla con el contrato definido por la interface, debe dar
la implementacion o convertirse en una clase abstracta.

Desde Java 8, existe el concepto de default method donde podemos dar una implementación por defecto a un metodo definifo 
por la interface.

public interface Impresora {
    public void imprimir(String texto);
    public int getVelocidad();
    public default boolean esMasRapida(Impresora i) {
    if (i.getVelocidad() > this.getVelocidad()) {
        return false;
        } else {
        return true;
        }
    }
}

COMO DECIDIR SI CONVIENE UNA ABSTRACTA O UNA CLASE INTERFACE?

ebe usarse una clase abstracta cuando se esta modelando una jerarquía de clases y una interfaz 
cuando se pretende homgenizar nombre entre objetos que no estan emparebtados
ver video pag 30. diapositiva POO UNIDAD 2





*/