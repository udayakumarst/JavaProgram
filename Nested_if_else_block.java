package JavaClass;
public class Nested_if_else_block 
{
	public static void main(String[] args) 
	{
		int a = 10;
		int b = 30;
		if(a<b) // if it's a true then it will enter inside the loop
		{
			if(a<b) 
			{
				if(a==10) 
				{
					System.out.println("Print the output2");
				}
				else 
				{
					System.out.println("Print inner else");
				}
			}
			else 
			{
				System.out.println("Print inner else");
			}
		}
		else 
		{
			if(a==b) 
			{
				System.out.println("Print the output1");
			}
			else 
			{
				System.out.println("Print inner else1");
			}
		}	
	}
}
