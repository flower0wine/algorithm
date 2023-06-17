package designpattern.visitor;

public interface Operation {
    void execute(Word word);
    void execute(Txt txt);
}
