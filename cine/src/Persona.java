public class Persona { // Clase madre o clase principal Persona en el cual tiene dos atributos cedula y nombre
    
    protected String cedula;// El tipo de dato es un String para las cedulas de los clientes para no hacer operaciones matematicas 
    protected String nombre; 
//se le va a agragr los metodos accesorio set y get como están en el modelado de cine
    public void setCedula(String cedula){ // En este metodo no me retornara nada
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
    //FASE 3.  Se va a agregar en la clase persona por el método de polimorfismo, cómo mostrar los datos de la persona
    public void mostrar_Datos(){
        System.out.println("Cédula = " + this.cedula + " - Nombre = " + this.nombre);
    }

    // Fase 6: El otro ejemplo de polimorfismo que se comporte de distintas maneras y que este repetido dentro de una misma clase 
    public void saludar(){ // Esté método no va a tener ningún parametros pero si va a tener una cadena de texto 
        System.out.println("Hola " +  this.nombre); // Este método de cadena de texto para saludar a la persona
    }
    // Otro método como el anterior 
    /*public void saludar(){ De una vez me dectecta este mensaje "Duplicate method saludar() in type Persona" Este método esta repetido en 
        en la clase padre persona, Entonces hay que utilizar algo para diferenciar y ese algo son los argumentos que esta recibiendo. Y como en el primer
        caso no tiene parametros, en este segundo va a recibir un tipo String que se va a llamar saludo. Lo que le permite difereciarse del anterior es que 
        tiene un parametro.
    }
    */
    public void saludar(String saludo){
        System.out.println(saludo + " " + this.nombre); // Este método es igual pero lo diferencia del anterior es que recibe parametros. 
    } // Estos dos métodos son para invocarlos en el App.java como polimorfismo

    
}

