package designpattern.visitor;

/**
 * @author flowerwine
 * @version 1.1
 * @projectName Algorithm
 * @description
 */
public class Word implements File {
    @Override
    public void accept(Operation operation) {
        operation.execute(this);
    }
}
