package bridge;

// Clase que implementa la interfaz Engine
// Esta clase representa un motor electrico
// que es un tipo concreto de motor
// Esta clase es un implementador del puente
public class ElectricEngine implements Engine{
    @Override
    public String start() {
        return "Electric engine ha empezado";
    }
}
