package designpattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author flowerwine
 * @projectName Algorithm
 */
public class Test {
    public static void main(String[] args) {
        // 组装数据
        List<College> collegeList = new ArrayList<>();
        ComputerCollege computerCollege = new ComputerCollege();
        InfoCollege infoCollege = new InfoCollege();
        collegeList.add(computerCollege);
        collegeList.add(infoCollege);

        // 迭代
        Iterator<College> collegeIterator = collegeList.iterator();
        while (collegeIterator.hasNext()) {
            College college = collegeIterator.next();
            System.out.println("===" + college.name() + "===");
            Iterator<Student> iterator = college.getIterator();
            while(iterator.hasNext()) {
                Student student = iterator.next();
                System.out.println(student);
            }
        }

    }
}
