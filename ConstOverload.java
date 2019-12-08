package JavaPrograms;

class Rectangle{
    int length;
    int breadth;
    int area;
    public Rectangle(){
        length=0;
        breadth=0;
    }
    public Rectangle(int l,int b){
        length=l;
        breadth=b;
    }
    public Rectangle(int x){
        length=x;
        breadth=x;
    }
    public int cal_area(){
        return(length*breadth);
    }
}
public class ConstOverload {
    public static void main(String arg[])
    {
        Rectangle ob1 = new Rectangle();
        System.out.println("area using 1st construction ="+ob1.cal_area());
        Rectangle ob2 = new Rectangle(5,10);
        System.out.println("area using 2nd constuctor ="+ob2.cal_area());
        Rectangle ob3 = new Rectangle(5);
        System.out.println("area using 3rd constructor ="+ob3.cal_area());
        Rectangle ob4 = new Rectangle(20,28);
        System.out.println("area using constructor ="+ob4.cal_area());
    }
}
