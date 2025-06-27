package bridge;

// Clase que implementa la interfaz Engine
// Esta clase representa un motor de gasolina
// que es un tipo concreto de motor
// Esta clase es un implementador del puente
public class GasEngine implements Engine {
    @Override
    public String start() {
        return "Gas engine ha empezado";
    }
}
