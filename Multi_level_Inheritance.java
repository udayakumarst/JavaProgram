package JavaClass;
class Grand_Parent 
{
	void Nagu() 
	{
		System.out.println("Grand_Parent Calss");
	}
}
class Parents extends Grand_Parent
{
	static void Yogu() 
	{
		System.out.println("Parent Calss");
	}
}
class Child1 extends Parents 
{
	static void bogu() 
	{
		System.out.println("Child Calss");
	}
}
public class Multi_level_Inheritance extends Child1
{
	public static void main(String[] args) 
	{
		bogu();
		Yogu();
		Grand_Parent n = new Grand_Parent();
		n.Nagu();
	}
}
