package JavaClass;
public class Replace_and_Matches
{
	public static void main(String[] args) 
	{
		String name = "My name is Sday Sai";
		String u = name.replace("S", "U"); //char
		System.out.println(u);
		String u1 = name.replace("Sai", "Kumar"); // String
		System.out.println(u1);
		
		String name1 = "My Name Is Uday Kumar ST";
		String u2 = name1.replaceAll("[A-Z]", ""); //removed capital letters
		System.out.println(u2);
		String u3 = name1.replaceAll("[a-z]", ""); // removed small letters
		System.out.println(u3);
		
		String name2 = "Uday @ 1996";
		String u4 = name2.replaceAll("[0-9]", "");
		System.out.println(u4);
		
		//Matches 
		String a = "Uday";
		System.out.print(".... is matching with Uday -->" );
		boolean b = a.matches("....");
		System.out.println(b);
		System.out.print("String ends with y -->" );//String ends with y
		boolean b1 = a.matches("(.)*y");
		System.out.println(b1);
		System.out.print("String start with U -->" );//String start with a
		boolean b2 = a.matches("U(.)*"); // (.)* It represent multi char
		System.out.println(b2);
		
		//check if the given string have man in it
		String c="salman";
		boolean c1 = c.matches("(.)*man(.)*");
		System.out.println(c1);
		
		//repeat
		String k = "Uday ";
		String n = k.repeat(2);
		System.out.println(n);
	}
}
