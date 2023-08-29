import java.util.ArrayList;
import java.util.List;

public class Hotel {
    
    private String nombre;
    private List<Habitacion> habitaciones;

    public Hotel(String nombre, int numHabitaciones){
        this.nombre = nombre;
        this.habitaciones = new ArrayList<>();

        for (int i = 0; i <= numHabitaciones ; i++) {
            habitaciones.add(new Habitacion(i));
        }
    }

    public String getNombre(){
        return nombre;
    }

    public List<Habitacion> gethabitacionesDisponibles(){
        List<Habitacion> disponibles = new ArrayList<>();

        for (Habitacion habitacion : habitaciones) {
            if (habitacion.isDisponible()) {
                disponibles.add(habitacion);
            }
        }
        return disponibles;
    }

    public List<Habitacion> getHabitaciones() {
        return habitaciones;
    }


}
