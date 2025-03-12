package JavaClass;
class java
{
	java(String UN, String PW)
	{
		System.out.println("This is parent Constructor");
	}
}
public class SuperCalling extends java
{
	SuperCalling()
	{
		super("Uday", "Uday@3");
		System.out.println("This is Child Constructor");
	}
	public static void main(String[] args) 
	{
		new SuperCalling();
	}
}
