package JavaClass;
import java.util.Arrays;
public class Countofalphabets 
{
	public static void main(String[] args) 
	{
		int countofalpha=0;
		int countofdigit=0;
		int countofspace=0;
		
       String s1="Uday@1098 ";
       char[] c1= s1.toCharArray();
      System.out.println(Arrays.toString(c1));
       
       for(int i=0; i<c1.length; i++) 
       {
       boolean b1=Character.isAlphabetic(c1[i]);
       boolean b2=Character.isDigit(c1[i]);
       boolean b3=Character.isWhitespace(c1[i]);
       
       if(b1==true) 
       {
    	   countofalpha++;
       }
       if(b2==true) 
       {
    	   countofdigit++;
       }
       
       if(b3==true) 
       {        
    	   countofspace++;
       }
       }
       
       System.out.println(countofalpha);
       System.out.println(countofdigit);
       System.out.println(countofspace);
       
       int countofsc=s1.length()-(countofalpha+countofdigit+countofspace);
       System.out.println(countofsc);
	}
}


















