package JavaPrograms;

import javax.xml.stream.events.StartDocument;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Students
{
    String Name;

    @Override
    public String toString() {
        return "Students{" +
                "Name=" + Name +
                ", roll_no=" + roll_no +
                ", marks=" + marks +
                '}';
    }

    public Students(String name, int roll_no, int marks) {
        Name = name;
        this.roll_no = roll_no;
        this.marks = marks;
    }

    int roll_no;
    int marks;

}
public class CustomComparator {
    public static void main(String arg[]) {
        List<Students> stu = new ArrayList<>();
        stu.add(new Students("Jack", 1, 98));
        stu.add(new Students("Marie", 2, 78));
        stu.add(new Students("John", 3, 82));
        Comparator<Students> com = new Comparator<Students>() {
            @Override
            public int compare(Students o1, Students o2) {
                return o1.marks<o2.marks?1:-1;
            }
        };
        Collections.sort(stu,com);
        System.out.println("Records in sorted marks : ");
        for(Students s : stu)
        {
            System.out.println(s);
        }
    }
}
