package lk;
import java.util.Arrays;
public class Lk {
    public static void main(String args[]) {
        System.out.println("ex");
        String arr[]  = {"hello"};
        class1 obj = new class1();
        obj.main(arr);
    }
}



class class1 {
    public void main(String args[]) {
        System.out.println(Arrays.toString(args));
    }
}
