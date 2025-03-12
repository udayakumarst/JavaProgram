package JavaClass;
public class MethodOverloading 
{
	static void add(int a, double b)
	{
		System.out.println("static method 1");
	}
	static void add(double d, char a)
	{
		System.out.println("static method 2");
	}
	void add(boolean v )
	{
		System.out.println("non static method 1");
	}
	void add(float v )
	{
		System.out.println("non static method 2");
	}
	public static void main(String[] args) 
	{
		add(10,20);
		add(3.9,'s');
		MethodOverloading rf = new MethodOverloading();
		rf.add(true);
		rf.add(3f);
	}
}
