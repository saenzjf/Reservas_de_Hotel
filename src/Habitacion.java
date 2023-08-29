public class Habitacion {
    
    private int numero;
    private boolean disponible;
    private Cliente ocupante;

    public Habitacion(int numero){
        this.numero = numero;
        this.disponible = true;
        this.ocupante = null;
    }

    public int getNumero(){
        return numero;
    }

    public boolean isDisponible(){
        return disponible;
    }

    public Cliente getCliente(){
        return ocupante;
    } 

    public void reservar(Cliente cliente){
        this.disponible = false;
        this.ocupante = cliente;
    }

    public void cancelarReserva(){
        this.disponible = true;
        this.ocupante = null;
    }
}
