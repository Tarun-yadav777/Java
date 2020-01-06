package JavaPrograms;

import java.util.HashMap;
import java.util.Set;

public class Hashmap {
    public static void main(String arg[])
    {
        HashMap<String,String> phonebook = new HashMap<>();
        phonebook.put("Tarun","489454484651");
        phonebook.put("Rahul","555989654488");
        phonebook.put("Dhruv","5848465498435");
        phonebook.put("Kanishk","4848944465489");
        phonebook.put("Kamal","64878984654894984");
        Set<String> key = phonebook.keySet();
        for(String i : key)
        {
            System.out.println(i+" : "+phonebook.get(i));
        }
    }
}
