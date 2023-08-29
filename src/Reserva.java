public class Reserva {
    
    private Cliente cliente;
    private Hotel hotel;
    

    public Reserva(Cliente cliente, Hotel hotel){
        
        this.cliente = cliente;
        this.hotel = hotel;
        getHabitacionAsignada();
    }

    public Cliente getCliente(){
        return cliente;
    }

    public Hotel getHotel(){
        return hotel;
    }

    public int getHabitacionAsignada(){

        int numero = hotel.gethabitacionesDisponibles().get(0).getNumero();
        hotel.gethabitacionesDisponibles().get(0).reservar(cliente);
        return numero;
    }

    public void cancelar(){
        hotel.getHabitaciones().get(getHabitacionAsignada()).cancelarReserva();
    }

    public int getPrueba(){
        int prueba = 45;
        return prueba;
    }
  
}
