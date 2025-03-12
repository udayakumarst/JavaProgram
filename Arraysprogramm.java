package JavaClass;

import java.util.Arrays;

public class Arraysprogramm {
	
	    public static void main(String[] args) {
	        int[] numbers = new int[3];

	        try {
	           
	           numbers[0]=1;
	           numbers[1]=2;
	           numbers[2]=3;
	           numbers[3]=4;
	            
	        }
	        catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("catched");
	       }

	        System.out.println("Program continues after handling exception...");
	    }
	}
	
