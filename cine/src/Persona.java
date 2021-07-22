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
