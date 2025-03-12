package JavaClass;

//Declaring Abstract Class with both Abstract & Concret Method. 

abstract class AbstractClassMethod1
{
	abstract void add();
	abstract void sub();
	void login()
	{
		System.out.println("Logic to expose");
	}
	static void logout()
	{
		System.out.println("Logic to expose");
	}
}
public class AbstractClassMethod extends AbstractClassMethod1
{
	void add()
	{
		System.out.println("Logic to expose");
	}
	void sub()
	{
		System.out.println("Logic to expose");
	}
	public static void main(String[] args)
	{
		
	}
}
