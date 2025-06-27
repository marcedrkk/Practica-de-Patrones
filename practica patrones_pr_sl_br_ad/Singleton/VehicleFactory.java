package Singleton;
import prototype.Vehicle;
import prototype.Car;
import prototype.Bike;

public class VehicleFactory {
    // Esta es la unica instancia que existira de la clase VehicleFactory
    private static VehicleFactory instance = null; 
    // Constructor privado para que nadie pueda crear objetos directamente
    private VehicleFactory() {}
    
    // Metodo estatico que devuelve la instancia de la clase
    public static VehicleFactory getInstance() {
        if (instance == null) {
            // si no existe ya la instancia
            instance = new VehicleFactory();
        }
        // siempre devuelve la misma 
        return instance;
    }   
    // Metodo para crear un vehiculo segun el tipo
    // Este metodo es el que se encargara de crear los vehiculos

    public  Vehicle createVehicle(String type) {
        if ("car".equalsIgnoreCase(type)) {
            return new Car();
        } else if ("bike".equalsIgnoreCase(type)) {
            return new Bike();
        }
        return null;
    }
}

