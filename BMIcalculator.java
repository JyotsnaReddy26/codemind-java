import java.util.Scanner;
class BMIcalculator
{
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
     int weight,height;
     double BMI;
      weight=sc.nextInt();
      height=sc.nextInt();
       BMI=weight/(height*height);
    System.out.println("The value of BMI calculator is:"+BMI);
}
}