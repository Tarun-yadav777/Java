package JavaPrograms;

import java.util.Scanner;

class Author
{
    String name;
    String email;
    public Author(String str,String str2)
    {
        name=str;
        email=str2;
    }
    public void show1()
    {
        System.out.println("Name : "+name+" <-::-> Email id : "+email);
    }
}
class Book
{
    int price;
    int quantity;
    String name;
    String email;
    public Book(int price,int quantity,String name,String email)
    {
        this.price=price;
        this.quantity=quantity;
        this.name=name;
        this.email=email;
    }
    public void object()
    {
        Author obj = new Author(name,email);
        obj.show1();
    }

}
public class EndTermQ4 {
    public static void main(String arg[])
    {
        System.out.println("Enter the name of the author of the book1 ");
        Scanner s = new Scanner(System.in);
        String str1 = s.nextLine();
        System.out.println("Enter the price of the book1 ");
        Scanner s1 = new Scanner(System.in);
        int x = s1.nextInt();
        System.out.println("Enter the quantity of the book1 ");
        Scanner s2 = new Scanner(System.in);
        int y = s2.nextInt();
        System.out.println("Enter the email id of the author ");
        Scanner s3 = new Scanner(System.in);
        String str2 = s3.nextLine();
        Book obj2 = new Book(x,y,str1,str2);
        System.out.println("Enter the name of the author of the book2 ");
        Scanner s4 = new Scanner(System.in);
        String str3 = s4.nextLine();
        System.out.println("Enter the price of the book2 ");
        Scanner s5 = new Scanner(System.in);
        int x2 = s5.nextInt();
        System.out.println("Enter the quantity of the book2 ");
        Scanner s6 = new Scanner(System.in);
        int y2 = s6.nextInt();
        System.out.println("Enter the email id of the author2 ");
        Scanner s7 = new Scanner(System.in);
        String str4 = s7.nextLine();
        Book obj3 = new Book(x2,y2,str3,str4);
        if(obj2.price>obj3.price)
            obj2.object();
        else
            obj3.object();

    }
}
