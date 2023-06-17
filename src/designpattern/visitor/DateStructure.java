package designpattern.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author flowerwine
 * @version 1.1
 * @projectName Algorithm
 * @description
 */
public class DateStructure {
    private List<File> fileList = new ArrayList<>();

    public void addFile(File file) {
        fileList.add(file);
    }

    public void handle(Operation operation) {
        for(File file : fileList) {
            file.accept(operation);
        }
    }
}
