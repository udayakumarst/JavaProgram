package JavaClass;
class Parent 
{
	static void add() 
	{
		System.out.println("Parent Calss");
	}
}
class Child extends Parent 
{
	static void sub() 
	{
		System.out.println("Child Calss");
	}
}
public class SingleInheritance extends Child 
{
	public static void main(String[] args) 
	{
		add();
		sub();
	}
}
