package designpattern.command;

/**
 * @author flowerwine
 * @version 1.1
 * @projectName Algorithm
 * @description
 */
public class RemoteController {
    private Command[] commands;

    public RemoteController() {
        this.commands = new Command[1];
        for(int i = 0, length = commands.length; i < length; i++) {
            this.commands[i] = new NullCommand();
        }
    }

    public void on(int index) {
        this.commands[index].on();
    }

    public void off(int index) {
        this.commands[index].off();
    }

    public void setCommand(int index, Command command) {
        this.commands[index] = command;
    }
}
