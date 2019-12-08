package JavaPrograms;

class A{
    int c,d,i,j;

    public A(){
        d=4;
        c=5;
    }

    public void sum(){
        System.out.println(" sum of class A ="+(c+d));
    }
}
class B extends A{

    public B(int a,int b){
        i=a;
        j=b;
    }

    public void sum(){
        super.sum();
        System.out.println("sum of class B ="+(i+j));
    }
}
public class MethodOverload {
    public static void main(String arg[]){
        A obj = new B(6,7);
        obj.sum();
    }
}
