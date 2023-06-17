package designpattern.templete;

/**
 * @author flowerwine
 * @version 1.1
 * @projectName Algorithm
 * @description
 */
public class PureMilk extends Milk {
    @Override
    public void add() {
        System.out.println("加入天然的新鲜牛奶");
    }

    @Override
    public boolean judge() {
        return false;
    }
}
