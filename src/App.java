public class App {
    public static void main(String[] args) throws Exception {
        
        Hotel hotelA = new Hotel("Marriott", 10);
        Hotel hotelB = new Hotel("Tequendama", 15);

        Cliente cliente1 = new Cliente("Ecopetrol", "123456");
        Cliente cliente2 = new Cliente("Terpel", "987654");

        Reserva reserva1 = new Reserva(cliente1, hotelA); 
        Reserva reserva2 = new Reserva(cliente2, hotelB); 

        System.out.println("RESERVAS REALIZADAS:");
        System.out.println("Hotel: "+reserva1.getHotel().getNombre()+
        " | Habitacion: "+reserva1.getHabitacionAsignada()+
        " | Cliente: "+ reserva1.getCliente().getNombre()+
        " | Cedula: "+ reserva1.getCliente().getCedula());
        
        
        System.out.println("Hotel "+reserva2.getHotel().getNombre()+
        " | Habitacion: "+reserva2.getHabitacionAsignada()+
        " | Cliente: "+reserva2.getCliente().getNombre()+
        " | Cedula: "+reserva2.getCliente().getCedula());
        
    }
}
