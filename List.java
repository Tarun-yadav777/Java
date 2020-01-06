package JavaPrograms;

import java.util.ArrayList;
import java.util.Collections;

public class List {
    public static void main(String arg[])
    {
        java.util.List<Integer> values = new ArrayList<>();
        values.add(3);
        values.add(5);
        values.add(1);
        values.add(4);
        Collections.sort(values);
        System.out.println("List : ");
        values.forEach(System.out::print);
        values.add(1,2);
        System.out.println();
        values.forEach(System.out::print);
        values.remove(4);
        System.out.println();
        values.forEach(System.out::print);
        System.out.println();
        System.out.println(values.get(2));
        System.out.println(values.size());

    }
}
