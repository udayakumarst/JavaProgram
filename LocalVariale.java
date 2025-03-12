package JavaClass;
public class LocalVariale 
{
	public static void add()
	{
		int a =200;
		int b =90;
		System.out.println(a*b);
	}
	void cool()
	{
		int a =200;
		int b =90;
		System.out.println(a/b);
	}
	public static void main(String[] args) 
	{
		add();
		LocalVariale b = new LocalVariale();
		b.cool();
	}
//	public static void main(String[] args) 
//	{
//		int a = 65;
//		int b = 65;
//		int c = a+b;
//		System.out.println(c);
//	}
}
