package JavaClass;
public class InheritanceClass1 
{
	static void add() 
	{
      System.out.println("Parent Calss");
	}
}
  class InheritanceClass2 extends InheritanceClass1
	{
	static void sub()
	{
	  System.out.println("Child Calss");
	}

	public static void main(String[] args) 
	{
		sub();
		add();
	}
}
