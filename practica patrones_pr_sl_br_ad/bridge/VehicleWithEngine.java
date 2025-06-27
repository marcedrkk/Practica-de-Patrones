package bridge;

// Clase abstracta que representa un vehiculo con motor
// Esta clase es la que se va a extender por los vehiculos concretos
public abstract class VehicleWithEngine {
    protected Engine engine; // El motor del vehiculo 

    public VehicleWithEngine(Engine engine) {
        this.engine = engine; // Asignamos el motor al vehiculo
    }
    // Metodo que devuelve el tipo de vehiculo
    public abstract void startEngine(); 
}