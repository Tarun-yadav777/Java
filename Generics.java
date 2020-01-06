package JavaPrograms;

import java.util.ArrayList;
import java.util.Collection;

public class Generics {
    public static void main(String arg[])
    {
        Collection<Integer> values = new ArrayList();
        values.add(1);
        values.add(2);
        values.add(3);
        values.remove(3);
        for(Integer i : values)
        {
            System.out.println(i);
        }

    }
}
