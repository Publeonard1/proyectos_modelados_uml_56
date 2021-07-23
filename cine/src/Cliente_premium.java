public class Cliente_premium extends Persona implements Tiquete_interfaz{ // Tamabién hereda la conexion con la clase madre llamada Persona
    
    private int numero_tarjeta;

    public void setNumero_tarjeta(int numeroTarjeta){ // Estos no tienen Id, solo trajeta para tener acceso
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
}
