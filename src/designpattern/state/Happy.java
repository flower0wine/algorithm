package designpattern.state;

/**
 * @author flowerwine
 * @projectName Algorithm
 */
public class Happy implements State {
    @Override
    public void doSomething() {
        System.out.println("积极干活");
    }
}
