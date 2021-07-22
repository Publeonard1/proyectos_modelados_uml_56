public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("BIENVENIDOS AL CINE!");
    }
}

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

Paso 4: Crear la interfaz e implementarla y sobre escribir el método 

*/