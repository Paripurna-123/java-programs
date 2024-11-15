import java.util.Scanner;
class SubDynamicFloat
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter first value");
float value1=scan.nextFloat();
System.out.println("Enter second value");
float value2=scan.nextFloat();
System.out.println("Enter third value");
float value3=scan.nextFloat();
float subthree=value1-value2-value3;
System.out.println("Substaction of three given numbers are"+subthree);
}
}