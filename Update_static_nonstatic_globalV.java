package JavaClass;
public class Update_static_nonstatic_globalV 
{
	static int a = 100;
	int b = 200;
	static void add()
	{
		a = 300;
	    Update_static_nonstatic_globalV v=new Update_static_nonstatic_globalV();
	    v.b=400;
		System.out.println(v.b+a);
	}
	void sub() 
	{
		 a = 1000;
		 b = 3000;
		System.out.println( b-a);
	}
	public static void main(String[] args) 
	{
       add();
       Update_static_nonstatic_globalV v=new Update_static_nonstatic_globalV();
       v.sub();
	}
}
