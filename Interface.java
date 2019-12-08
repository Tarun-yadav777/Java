package JavaPrograms;

interface Writter1{
    void show(String i);

}
class Pen1 implements Writter1 {
    public void show(String i) {
        System.out.println("its "+i);
    }

}
class Pencil1 implements Writter1 {
    public void show(String i) {
        System.out.println("its is a"+i);
    }

}
class Kit {
    public void showsomething(Writter1 w){
        w.show("stationory");
    }
}
public class Interface {
    public static void main(String arg[]){
        Writter1 obj = new Pen1();
        Writter1 obj1 = new Pencil1();
        Kit o = new Kit();
        o.showsomething(obj);


    }
}
