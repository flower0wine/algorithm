package designpattern.templete;

/**
 * @author flowerwine
 * @version 1.1
 * @projectName Algorithm
 * @description
 */
public class Test {
    public static void main(String[] args) {
        Milk milk = new PureMilk();
        milk.make();
    }
}
