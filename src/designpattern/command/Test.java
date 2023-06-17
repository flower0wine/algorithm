package designpattern.command;

/**
 * @author flowerwine
 * @version 1.1
 * @projectName Algorithm
 * @description
 */
public class Test {
    public static void main(String[] args) {
        Light light = new Light();
        Command command = new LightCommand(light);

        RemoteController controller = new RemoteController();
        controller.setCommand(0, command);
        controller.on(0);
    }
}
