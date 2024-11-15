import java.util.Scanner;
class MultipleDynamicFloat
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
float multiplethree=value1*value2*value3;
System.out.println("Addition of three given numbers are"+multiplethree);
}
}