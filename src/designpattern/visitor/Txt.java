package designpattern.visitor;

/**
 * @author flowerwine
 * @version 1.1
 * @projectName Algorithm
 * @description
 */
public class Txt implements File {
    @Override
    public void accept(Operation operation) {
        operation.execute(this);
    }
}
