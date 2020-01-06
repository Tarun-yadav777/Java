package JavaPrograms;

import java.util.ArrayList;
import java.util.Collections;

public class Comparator {
    public static void main(String arg[])
    {
        java.util.List<Integer> values = new ArrayList<>();
        values.add(34);
        values.add(51);
        values.add(12);
        values.add(43);
        java.util.Comparator<Integer> com = new java.util.Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1%10>o2%10?1:-1;
            }
        };
        Collections.sort(values,com);
        System.out.println("Values : "+values);


    }

    }

