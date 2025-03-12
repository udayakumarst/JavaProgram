package JavaClass;
public class Logical_Operators 
{
	public static void main(String[] args) 
	{
		int a = 10;
		int b = 20;
		if(a==10 && b==20)
		{
			System.out.println("with AND operators in if block");
		}
		if(a==10 || b==20)
		{
			System.out.println("with OR operators in if block");
		}
		if(!(a==20 && b==10))
		{
			System.out.println("with AND-NOT operators in if block");
		}
		if(!(a==20 || b==10))
		{
			System.out.println("with OR-NOT operators in if block");
		}
	}
}
