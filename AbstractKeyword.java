package JavaPrograms;

abstract class Writter{
    abstract public void show(String i);
    public void show(String i,String j){
        System.out.println(i+","+j);
    }

}
class Pen extends Writter {
    public void show(String i) {
        System.out.println("its "+i);
    }

}
class Pencil extends Writter {
    public void show(String i) {
        System.out.println("its is a"+i);
    }

}
public class AbstractKeyword {
    public static void main(String arg[]){
        Writter obj = new Pen();
        obj.show("pen");
        Writter obj1 = new Pencil();
        obj1.show("pencil");
        obj.show("pen","pencil");
    }
}
