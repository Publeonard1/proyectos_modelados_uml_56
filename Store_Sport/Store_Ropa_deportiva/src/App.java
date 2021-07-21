public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Mi tienda de ropa deportiva - STORE"); 
        // para poder cerar una variable se hace con un tipo de dato antes de hacer su vinculo
        Producto productoUno = new Producto();// el tipo de dato es en si la clase producto y nuestro objeto se va llamar producto1 y para crear ese objeto se requiere de un constructor new 
                           //= new Producto(); el constructor con la clase pero en modo de operación o metodo
        // Con ese objeto ya se puede hacer lo que quiera
        productoUno.setNombre_producto("Camisa FCFColombia"); // Con ese punto ya llama a los metodos que estan en la clase Prodcuto para relacionarlos en el App.java
        productoUno.setPrecio(280000.00); // Ya tiene un precio esa camisa
        
        productoUno.mostrar(); //Hay un metodo que creamos en la clase Prodcuto llamado mostrar
        // Ya se puede ejecutar el programa 
    }
}
// vamos a ralizar la relacion entre clases 