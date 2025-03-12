package JavaClass;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayvalueruntime {

	public static void main(String[] args) {
     Scanner s1=new Scanner(System.in);
     System.out.println("please enter size of array age");
     int age[]= new int[s1.nextInt()];
     System.out.println("please enter size of array age2");
     int age2[]=new int[s1.nextInt()];
     
     for(int i=0; i<age.length;i++) {
    	 System.out.println("please enter values for age at index"+i);
    	 age[i]=s1.nextInt();
    	 System.out.println("please enter values for age2 at index"+i);
    	 age2[i]=s1.nextInt();
             }
     boolean b1=Arrays.equals(age, age2);
    	 if (b1==true) {
    		 System.out.println("arrays are equal");
    	 }
    	 else {
    		 System.out.println("not equal");
    	 }
     
    }
}
