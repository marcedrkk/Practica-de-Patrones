package bridge;

//interfaz del motor (implementador del puente)
// Esta interfaz define el comportamiento de un motor
// Cualquier clase que implemente esta interfaz
// debe proporcionar una implementacion del metodo start
// Este metodo devuelve un String que indica que el motor ha empezado
public interface Engine {
    String start();
}
