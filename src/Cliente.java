public class Cliente {
    
    String nombre;
    String cedula;

    public Cliente(String nombre, String cedula){
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public String getNombre(){
        return nombre;
    }

    public String getCedula(){
        return cedula;
    }
}

