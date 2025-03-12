package JavaClass;
import java.util.Scanner;
public class CircumferenceofRectangle 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the l value");
		double l = s.nextInt();
		System.out.println("Enter the b value");
		double b = s.nextInt();
		double Circumference = 2*(l+b);
		System.out.println("Area of Circumference is " + Circumference);
		s.close();
	}
}
