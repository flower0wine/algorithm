package designpattern.visitor;

/**
 * @author flowerwine
 * @version 1.1
 * @projectName Algorithm
 * @description
 */
public class Test {
    public static void main(String[] args) {
        Word word = new Word();
        Txt txt = new Txt();

        Operation create = new Create();
        Operation edit = new Edit();
        DateStructure dateStructure = new DateStructure();
        dateStructure.addFile(word);
        dateStructure.addFile(txt);

        dateStructure.handle(create);
        dateStructure.handle(edit);
    }
}
