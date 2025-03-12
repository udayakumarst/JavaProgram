package JavaClass;

public class Exceptionprogramm {
	
	public static void main(String[] args) 
	{
	 
	try {	
	int i=1/0;
	System.out.println(i);
	}
	catch(ArithmeticException a1) 
	{
		System.out.println("its ArithmeticException ");
	}
	}

}
