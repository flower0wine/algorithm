package designpattern.mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * @author flowerwine
 * @projectName Algorithm
 */
public class Mediator {
    private Map<String, Procedure> map = new HashMap<>();

    public void handle() {}

    public void add(Procedure procedure) {
        this.map.put(procedure.getName(), procedure);
    }
}
