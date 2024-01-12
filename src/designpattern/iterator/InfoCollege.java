package designpattern.iterator;

import java.util.Iterator;

/**
 * @author flowerwine
 * @projectName Algorithm
 */
public class InfoCollege implements College {
    private Student[] students = new Student[10];
    private String name;

    public InfoCollege() {
        this.name = "赵高学院";
        students[0] = new Student("鼠头");
        students[1] = new Student("鸭脖");
    }

    @Override
    public Iterator<Student> getIterator() {
        return new InfoCollegeIterator(students);
    }

    public Student[] getStudents() {
        return students;
    }

    @Override
    public String name() {
        return name;
    }
}
