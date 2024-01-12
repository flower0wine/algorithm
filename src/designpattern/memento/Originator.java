package designpattern.memento;

/**
 * 记录者, 执行保存和恢复操作
 * @author flowerwine
 * @projectName Algorithm
 */
public class Originator {
    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public Memento createMemento() {
        Memento memento = new Memento();
        memento.setState(state);
        return memento;
    }

    public void restoreMemento(Memento memento) {
        this.state = memento.getState();
    }
}
