package JavaClass;
public class thisCalling 
{
	thisCalling()
	{
		this("Hey");
		System.out.println("First");
	}
	thisCalling(String a)
	{
		System.out.println("Second");
	}
	public static void main(String[] args) 
	{
		new thisCalling();
	}
}
