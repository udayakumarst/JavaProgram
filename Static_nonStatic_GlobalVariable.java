package JavaClass;
public class Static_nonStatic_GlobalVariable 
{
	int a = 100;
	static int b = 200;
	void nonstatic()
	{
	
		System.out.println(a+b);
	}
	static void Static()
	{
		Static_nonStatic_GlobalVariable c=new Static_nonStatic_GlobalVariable();
		System.out.println(c.a);
		System.out.println(b-c.a);
	}
	public static void main(String[] args) 
	{
		Static_nonStatic_GlobalVariable h=new Static_nonStatic_GlobalVariable();
		h.nonstatic();
		Static();
	}
}
