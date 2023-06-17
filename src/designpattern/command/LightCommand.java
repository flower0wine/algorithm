package designpattern.command;

/**
 * @author flowerwine
 * @version 1.1
 * @projectName Algorithm
 * @description
 */
public class LightCommand implements Command {
    private Light light;

    public LightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void on() {
        light.on();
    }

    @Override
    public void off() {
        light.off();
    }
}
