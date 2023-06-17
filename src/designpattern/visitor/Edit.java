package designpattern.visitor;

/**
 * @author flowerwine
 * @version 1.1
 * @projectName Algorithm
 * @description
 */
public class Edit implements Operation {
    @Override
    public void execute(Word word) {
        System.out.println("编辑 word 文档");
    }

    @Override
    public void execute(Txt txt) {
        System.out.println("编辑文本文档");
    }
}
