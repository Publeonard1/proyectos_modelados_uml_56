public class Cliente_premium extends Persona implements Tiquete_interfaz{ // También hereda la conexion con la clase padre llamada Persona
    
    private int numero_tarjeta;

    public void setNumero_tarjeta(int numeroTarjeta){ // Estos no tienen Id, solo tarjeta para tener acceso
        this.numero_tarjeta = numeroTarjeta;        
    }

    public int getNumero_tarjeta() { // con la palabra get le busca el nombre de la sub clase y se agrega por defecto 
        return this.numero_tarjeta;
    }

    @Override
    public float calcular_Precio(float precio_Base){
        float precioFinal_premium = (float)(precio_Base - (precio_Base * 0.50)); //Como me sigue mostrando error le agrago antes (float) y luego entre (la operación)
        return precioFinal_premium;
    }
    
    // Fase 5: Se va a sobrecargar con lo mque se hizo en la fase 3 y 4 haciendo polimorfismo en la subclase Clinete_premium
    @Override
    public void mostrar_Datos(){
        System.out.println("Cédula = " + this.cedula
                                    + " - Nombre = " + this.nombre
                                    + " - Número de tarjeta = " + this.numero_tarjeta + " (Polimorfismo)");
    }
}