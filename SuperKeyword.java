package JavaPrograms;

class SuperClass14{
    int a,b;
    public SuperClass14(){
        a=0;
        b=1;
        System.out.println(a+":"+b);
    }
    public SuperClass14(int i,int j){
        a=i;
        b=j;
        System.out.println(a+":"+b);
    }
}
class SubClass14 extends SuperClass14{
    int x,y;
    public SubClass14(){
        x=0;
        y=2;
        System.out.println(x+":"+y);
    }
    public SubClass14(int i,int j){
        super(i,j);
        x=i;
        y=j;
        System.out.println(x+":"+y);
    }
}

public class SuperKeyword {
    public  static void main(String arg[]){
        SubClass14 obj = new SubClass14();
        SubClass14 obj1 = new SubClass14(2,3);

    }
}
