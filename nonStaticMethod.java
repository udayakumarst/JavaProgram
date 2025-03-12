package JavaClass;
public class nonStaticMethod 
{
	void javaClass(int a, int b)
	{
		System.out.println("int value");
	}
	void selenium(float c, float d)
	{
		System.out.println("float value");
	}
	void github(boolean e)
	{
		System.out.println("boolean value");
	}
	void jenkins(double f)
	{
		System.out.println("double value");
	}
	public static void main(String[] args) 
	{
		nonStaticMethod F = new nonStaticMethod();
		F.javaClass(100,300);
		F.selenium(20f, 90f);
		F.github(true);
		F.jenkins(29.6);
	}
}
