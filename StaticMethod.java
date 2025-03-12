package JavaClass;
public class StaticMethod 
{
	static void car(int a, int b)
	{
		System.out.println("Car is safe for journey");
	}
	static void bike(int a)
	{
		System.out.println("Bike is not safe for journey");
	}
	static void train(int a)
	{
		System.out.println("train is safe for journey but not comfortable");
	}
	public static void main(String[] args) 
	{
		car(20, 20);
		bike(30);
		train(90);
	}
}
