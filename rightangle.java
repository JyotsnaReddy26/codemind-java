import java.util.Scanner;
class rightangle
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
    int side1,side2;
      double result;
      side1=sc.nextInt();
      side2=sc.nextInt();
      result=Math.sqrt((side1*side1)+(side2*side2));
  System.out.println("required hypoteneus="+result);

}

}