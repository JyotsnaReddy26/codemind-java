import java.util.Scanner;
class volumeofCylinder
{
public static void main(String args[])
{
   Scanner sc=new Scanner(System.in);
        Double volume,r,h;
           r=sc.nextDouble();
           h=sc.nextDouble();
           volume=3.14*(r*r)*h;
   System.out.println("Volume of cylinder is:"+volume);
System.out.printf("Volume of cylinder is :%.2f",volume);
}
}