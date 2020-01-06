package JavaPrograms;

import java.util.*;
import java.util.Comparator;
import java.util.List;

class Students1 implements java.lang.Comparable<Students1>
{
    String Name;

    @Override
    public String toString() {
        return "Students1{" +
                "Name=" + Name +
                ", roll_no=" + roll_no +
                ", marks=" + marks +
                '}';
    }

    public Students1(String name, int roll_no, int marks) {
        Name = name;
        this.roll_no = roll_no;
        this.marks = marks;
    }

    int roll_no;
    int marks;


    @Override
    public int compareTo(Students1 o) {
        return this.marks>o.marks?-1:this.marks<o.marks?1:0;
    }
}
public class Comparable {
    public static void main(String arg[])
    {
        List<Students1> stu = new ArrayList<>();
        stu.add(new Students1("Jack", 1, 98));
        stu.add(new Students1("Marie", 2, 78));
        stu.add(new Students1("John", 3, 82));
        Collections.sort(stu);
        System.out.println("Records in sorted marks : ");
        for(Students1 s : stu)
        {
            System.out.println(s);
        }
    }
}
