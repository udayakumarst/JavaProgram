package JavaClass;
import java.util.Scanner;
public class AreaOfCircle 
{
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter r value");
		int r = s1.nextInt();
		System.out.println("enter pi value");
		double pi = s1.nextDouble();
		s1.close();
		System.out.println(pi*r*r);
	}
}
