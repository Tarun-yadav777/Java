package JavaPrograms;


class Encapsulation{
    private String name;
    private int roll_no;
    private int year;
    private String course;
    public void get_name(String name){
        this.name=name;
        System.out.println("name of the student="+name);
    }
    public int getRoll_no(int roll_no){
        this.roll_no=roll_no;
        return roll_no;
    }
    public int getYear(int year){
        this.year=year;
        return year;
    }
    public void getcourse(String course){
        this.course=course;
        System.out.println("name of the course="+course);
    }
}
public class Encapsulation1 {
    public static void main(String arg[]){
        Encapsulation obj = new Encapsulation();
        obj.get_name("Tarun_yadav");
        obj.getcourse("CSE");
        System.out.println("roll no is="+obj.getRoll_no(18));
        System.out.println("year of the student is="+obj.getYear(2));
    }
}
