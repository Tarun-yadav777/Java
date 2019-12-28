package JavaPrograms;

import java.util.Scanner;

class Circle
{
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    private int radius;

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    private String colour;
    public Circle()
    {
        radius=0;
        colour="null";
    }
    public Circle(int radius)
    {
        this.radius=radius;
    }
    public Circle(int radius,String colour)
    {
        this.radius=radius;
        this.colour=colour;
    }
    public double getArea()
    {
        double area;
        area=3.14*getRadius()*getRadius();
        return area;
    }
}
class Cylinder extends Circle
{
    int height;
    public Cylinder(int height)
    {

        this.height=height;
    }
    public double getVolume()
    {
        double volume;
        volume=4/3*(height*getRadius()*getRadius()*3.14);
        return volume;
    }
}

public class EndTermQ2 {
    public static void main(String arg[])
    {
        System.out.println("Enter the radius for calculating area : ");
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        System.out.println("Enter the colour : ");
        Scanner s1 = new Scanner(System.in);
        String str = s1.nextLine();
        Circle obj = new Circle(x,str);
        System.out.println("Enter the height of volume : ");
        Scanner s2 = new Scanner(System.in);
        int y = s2.nextInt();
        Cylinder obj2 = new Cylinder(y);
        System.out.println("Area of the given radius of colour "+obj.getColour()+" is "+obj.getArea());
        System.out.println("Volume of the given height is "+obj2.getVolume());
    }
}
