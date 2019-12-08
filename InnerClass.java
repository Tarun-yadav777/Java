package JavaPrograms;

class Outer {
    int length;
    int breath;

    public Outer(int a, int b)
    {
        length=a;
        breath=b;
    }
    class Inner{
        int area;

        public int cal_area()
        {
            area=length*breath;
            return area;
        }

    }

}
public class InnerClass {
    public static void main(String arg[]){
        int x;
        Outer obj = new Outer(4,5);
        Outer.Inner obj1 = obj.new Inner();
        x=obj1.cal_area();
        System.out.println("Area="+x);
    }
}
