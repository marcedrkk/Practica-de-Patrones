import Singleton.VehicleFactory;
import prototype.Vehicle;
import bridge.Engine;
import bridge.GasEngine;
import bridge.ElectricEngine;
import bridge.VehicleWithEngine;
import bridge.VehicleImpl;
import adapter.OldEngine;
import adapter.OldEngineAdapter;
// Main.java


public class Main {
     public static void main(String[] args) {
        // Singleton: se obtiene una sola instancia de la fábrica
        VehicleFactory factory1 = VehicleFactory.getInstance();
        VehicleFactory factory2 = VehicleFactory.getInstance();
        System.out.println(factory1 == factory2); // true: misma instancia

        // Prototype: clonación de objetos
        Vehicle car1 = factory1.createVehicle("car");
        Vehicle car2 = car1.clone(); // Copia de car1
        car1.showType();  // I am a Car
        car2.showType();  // I am a Car

        // Bridge: arrancar vehículos con diferentes motores
        Engine gasEngine = new GasEngine();
        Engine electricEngine = new ElectricEngine();
        VehicleWithEngine vehicleGas = new VehicleImpl(gasEngine);
        VehicleWithEngine vehicleElectric = new VehicleImpl(electricEngine);
        vehicleGas.startEngine();       // Starting gas engine
        vehicleElectric.startEngine();  // Starting electric engine

        // Adapter: integrar un motor antiguo
        OldEngine oldEngine = new OldEngine();
        Engine oldEngineAdapter = new OldEngineAdapter(oldEngine);
        VehicleWithEngine vehicleOld = new VehicleImpl(oldEngineAdapter);
        vehicleOld.startEngine();       // Old engine turning on
    }
}