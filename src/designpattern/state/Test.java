package designpattern.state;

/**
 * @author flowerwine
 * @projectName Algorithm
 */
public class Test {
    public static void main(String[] args) {
        Person person = new Person();

        person.setState(new Happy());
        person.doSomething();

        person.setState(new Sad());
        person.doSomething();
    }
}
