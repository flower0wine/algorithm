package designpattern.iterator;

import java.util.Iterator;

/**
 * @author flowerwine
 * @projectName Algorithm
 */
public class InfoCollegeIterator implements Iterator<Student> {
    private Student[] students;

    public InfoCollegeIterator(Student[] students) {
        this.students = students;
    }

    private int index = 0;

    @Override
    public boolean hasNext() {
        return index < students.length;
    }

    @Override
    public Student next() {
        Student student = students[index];
        index++;
        return student;
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }
}
