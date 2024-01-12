package designpattern.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @author flowerwine
 * @projectName Algorithm
 */
public class ComputerCollegeIterator implements Iterator<Student> {
    private List<Student> students;

    public ComputerCollegeIterator(List<Student> students) {
        this.students = students;
    }

    private int index = 0;

    @Override
    public void remove() {
        Iterator.super.remove();
    }

    @Override
    public boolean hasNext() {
        return index < students.size();
    }

    @Override
    public Student next() {
        Student student = students.get(index);
        index++;
        return student;
    }
}
