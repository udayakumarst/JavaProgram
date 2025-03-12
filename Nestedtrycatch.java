package JavaClass;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Nestedtrycatch {
	
	public static void main(String[] args) 
	{
	
	try {
	Scanner s1= new Scanner(System.in);
	System.out.println("please enter your age");
	int  age=  s1.nextInt();
	}
		
	catch(InputMismatchException b1)
	{
		try {
			Scanner s1= new Scanner(System.in);
		System.out.println("please enter your age in numbers");
		int  age=  s1.nextInt();	
		}
		catch(InputMismatchException c1) {
			Scanner s1= new Scanner(System.in);
			System.out.println("please enter your age in only numbers");
			int  age=  s1.nextInt();
		}
	}
		
	}
	
	}

