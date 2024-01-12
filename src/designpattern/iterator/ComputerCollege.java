package designpattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author flowerwine
 * @projectName Algorithm
 */
public class ComputerCollege implements College {
    private List<Student> students = new ArrayList<>();
    private String name;

    public ComputerCollege() {
        name = "软件学院";
        students.add(new Student("孙庆洋"));
        students.add(new Student("朱佳军"));
        students.add(new Student("李伟建"));
        students.add(new Student("李志"));
    }

    @Override
    public Iterator<Student> getIterator() {
        return new ComputerCollegeIterator(students);
    }

    public List<Student> getStudents() {
        return students;
    }

    @Override
    public String name() {
        return name;
    }
}
