package designpattern.state;

/**
 * @author flowerwine
 * @projectName Algorithm
 */
public class Sad implements State {

    @Override
    public void doSomething() {
        System.out.println("消极怠工");
    }
}
