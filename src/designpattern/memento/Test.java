package designpattern.memento;

/**
 * @author flowerwine
 * @projectName Algorithm
 */
public class Test {

    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("消极状态");
        caretaker.addMemento(originator.createMemento());
        System.out.println(originator.getState());

        originator.setState("积极状态");
        caretaker.addMemento(originator.createMemento());
        System.out.println(originator.getState());

        originator.setState("癫狂状态");
        caretaker.addMemento(originator.createMemento());
        System.out.println(originator.getState());


        originator.restoreMemento(caretaker.getMemento());
        System.out.println(originator.getState());

        originator.restoreMemento(caretaker.getMemento());
        System.out.println(originator.getState());

        originator.restoreMemento(caretaker.getMemento());
        System.out.println(originator.getState());
    }
}
