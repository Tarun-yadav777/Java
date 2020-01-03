package JavaPrograms;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

class Student
{
    private int roll_no;
    private String name;

    @Override
    public String toString() {
        return "Student{" +
                "roll_no=" + roll_no +
                ", name='" + name + '\'' +
                '}';
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class College
{
    private List<Student> students;

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
public class Serialization {
    public static void main(String arg[])
    {
        try
        {
        Student obj1 = new Student();
        obj1.setRoll_no(18);
        obj1.setName("Tarun Yadav");

        Student obj2 = new Student();
        obj2.setRoll_no(19);
        obj2.setName("Rahul Raghav");

        List<Student> s = new ArrayList<>();
        s.add(obj1);
        s.add(obj2);

        College c = new College();
        c.setStudents(s);

         XMLEncoder x = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("College")));
            x.writeObject(c);
            x.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
