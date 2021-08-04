public class Cliente extends Persona implements Tiquete_interfaz { // En esta sub clase Cliente vamos a heredar o hacer una extención desde la clase madre Persona
    // subclassClinete hereda <-- ClasePersona
    private int id;
// Fase 13: Hacer un constructor sobrecargado que me permita pero antes un constructor vacío
    public Cliente(){ //Un constructor es un método y debe ser pubico no lleva void y ningçin tipo de returns, simplemente va el nombre y se va a llmar igual que la clase en este caso es Cliente
        //Un constructor vacío y después un constructor sobrecargardo.
    }  
    public Cliente(String cedula, String nombre, int id) { // Estè es un constructor sobrecargado
        this.cedula = cedula;
        this.nombre = nombre;
        this.id = id;
    }

    //Luego se realiza su get y set como métodos accesorios 
    public void setID(int id){
        this.id = id;
    }

    public int getID (){ 
        return this.id;
    }

    @Override // Se reecribe el metodo Tiquete_interfaz.calcular_Precio(float) que se encuentra en la clase Tiquete
    public float calcular_Precio(float precio_Base) { // Y aquí se le agrag eñ contenido
    //para el ciente tradicional se va a suponer que que tiene un descuento de 1000 pesos del valor del ticket
        float precioFinal_basico = precio_Base - 1000;
        return precioFinal_basico; // Y de este modo se le hace el proceso de la interfaz a la clase Cliente premium
    }

    // Fase 4: Ahora que en està subclase le agregue  para mostrar el id del cliente y se va a sobreescibir con @Override
    @Override
    public void mostrar_Datos(){
        System.out.println("Cédula = " + this.cedula
                                    + " - Nombre = " + this.nombre
                                    + " - ID = " + this.id + " (Polimorfismo)");
    }
}

/*
Después de escribir "public class Cliente extends Persona" se agrega implements y luego aparece 
la clase Tiquete_interfaz pero me muestra una advertencia "The type Cliente must implement the inherited abstract method 
Tiquete_interfaz.calcular_Precio(float)" Que el tipo Clinete debe implementar el método abstracto Tiquete_interfaz.calcular_Precio(float)
Eso quiere decir que està obligado a reescribir el método con la palabra  @Override
*/
