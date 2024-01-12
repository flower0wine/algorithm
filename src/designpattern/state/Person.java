package designpattern.state;

/**
 * @author flowerwine
 * @projectName Algorithm
 */
public class Person {
    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public void doSomething() {
        state.doSomething();
    }
}
