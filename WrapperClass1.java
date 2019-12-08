package JavaPrograms;

class Wrapperclass{
    String a,b;
    public Wrapperclass(String x,String y){
        a=x;
        b=y;
    }
    int c = Integer.parseInt(a);
    int d = Integer.parseInt(b);
    public void show(){
        System.out.println("string sum ="+(c+d));
    }

}
public class WrapperClass1 {
    public static void main(String arg[]){
        Wrapperclass obj = new Wrapperclass("tarun","yadav");
        obj.show();
    }
}
