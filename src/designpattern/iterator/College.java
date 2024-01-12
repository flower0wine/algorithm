package designpattern.iterator;

import java.util.Iterator;

/**
 * @author flowerwine
 * @projectName Algorithm
 */
public interface College {
    String name();
    Iterator<Student> getIterator();
}
