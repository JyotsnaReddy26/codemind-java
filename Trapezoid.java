import java.util.Scanner;
class Trapezoid
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
       Double b1,b2,h,area;
            b1=sc.nextDouble();
             b2=sc.nextDouble();
             h=sc.nextDouble();
             area=0.5*(b1+b2)*h;
       System.out.println("Area of trapezoid is:"+area);
        System.out.printf("Area of trapezoid is :%.2f",area);
}
}