package bridge;

/* Clase que implementa la interfaz Vehicle
 Esta clase representa un vehiculo concreto que tiene un motor
 Esta clase es un puente entre el vehiculo y el motor
 En este caso, es un vehiculo que puede tener cualquier tipo de motor
 que implemente la interfaz Engine
 Esta clase extiende la clase abstracta VehicleWithEngine
y proporciona una implementacion concreta del metodo startEngine */

public class VehicleImpl extends VehicleWithEngine {
    public VehicleImpl(Engine engine) {
        super(engine); // Llamamos al constructor de la clase padre
    } 
    public void startEngine(){
        System.out.println(engine.start()); // Llamamos al metodo start del motor   
    }
}

    