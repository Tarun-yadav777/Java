package JavaPrograms;
class Complex {
    float real_part;
    float imaginary_part;
    public Complex()
    {
        real_part=0;
        imaginary_part=0;
    }
    public Complex(int real_part,int imaginary_part)
    {
        this.real_part=real_part;
        this.imaginary_part=imaginary_part;
    }
    public String addComplex(Complex o)
    {
        float sum_real,sum_imaginary;
        String str;
        sum_real=real_part+o.real_part;
        sum_imaginary=imaginary_part+o.imaginary_part;
        str=sum_real+" + i"+sum_imaginary;
        return str;
    }
    public String multiComplex(Complex o)
    {
        float multi_real=1,multi_imaginary=1;
        String str;
        multi_real=real_part*o.real_part;
        multi_imaginary=imaginary_part*o.imaginary_part;
        str=multi_real+" + i"+multi_imaginary;
        return str;
    }
    public void printComplex(Complex o)
    {
        System.out.println("Addition of two complex no :- ");
        System.out.println(addComplex(o));
        System.out.println("Multiplication of two complex no :- ");
        System.out.println(multiComplex(o));
    }
}
public class EndTermQ {
    public static void main(String arg[])
    {
        Complex obj = new Complex(3,5);
        Complex obj1 = new Complex(4,6);
        obj.addComplex(obj1);
        obj.multiComplex(obj1);
        obj.printComplex(obj1);
    }
}
