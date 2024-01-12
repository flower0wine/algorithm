package designpattern.memento;

/**
 * 保存数据的对象
 * @author flowerwine
 * @projectName Algorithm
 */
public class Memento {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
