package JavaClass;
public class AccessSpecifiers 
{
	public static  void add()
	{
		System.out.println("Public access specifier");
	}
	protected static void sub()
	{
		System.out.println("protected access specifier");
	}
	static void mult()
	{
		System.out.println("default access specifier");
	}
	private static void div()
	{
		System.out.println("private access specifier");
	}
	public static void main(String[] args) 
	{
		add();
		sub();
		mult();
		div();
	}
	public void publicMethod() {
		// TODO Auto-generated method stub
		
	}
}
