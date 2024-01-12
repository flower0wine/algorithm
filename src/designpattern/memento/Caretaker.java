package designpattern.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * 备忘录管理者, 保存着被备忘录对象, 备忘录对象保存着数据
 * @author flowerwine
 * @projectName Algorithm
 */
public class Caretaker {
    private List<Memento> mementos = new ArrayList<>();

    public void addMemento(Memento memento) {
        mementos.add(memento);
    }

    public Memento getMemento() {
        if(mementos.size() == 0) {
            return null;
        }
        return mementos.remove(mementos.size() - 1);
    }
}
