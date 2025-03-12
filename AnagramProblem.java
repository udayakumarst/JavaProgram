package JavaClass;

import java.util.Arrays;

public class AnagramProblem {

	public static void main(String[] args) 
	{
		String a="acf";
		String b="cat";
		
	if(a.length() != b.length())	{
		
		System.out.println("not anagram");
	}
	else {
		System.out.println("lets check whether they are anagram");
		char[] c1=a.toCharArray();
		char[] c2=b.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		boolean b1= Arrays.equals(c1, c2);
	if (b1==true) {
		System.out.println("they are anagram");
	}
	else 
	{
		System.out.println("they are not anagram");
	}
	}
	}	
	}


