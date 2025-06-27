package adapter;
import bridge.*;

public class OldEngineAdapter implements Engine {
    private OldEngine oldEngine; 

    public OldEngineAdapter(OldEngine oldEngine) {
        this.oldEngine = oldEngine;
    }

    public String start() {
        return oldEngine.turnOn();
    }
}
