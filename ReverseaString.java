package JavaClass;

public class ReverseaString {

	public static void main(String[] args) 
	{
		String a="mom";
		String rev="";
		for(int i=a.length()-1; i>=0; i--) 
		{
			rev=rev+a.charAt(i);
		}
		System.out.println(rev);
		
		if (a.equals(rev))
		{
			System.out.println("it is a palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
	
	}
}
