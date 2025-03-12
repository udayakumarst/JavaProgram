package JavaClass;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class Set_Property 
{
	public static void main(String[] args) 
	{
		Set s = new HashSet();
		s.add(21);
		s.add(22);
		s.add(23);
		s.add(24);
		s.add(25);
		System.out.println(s);
		
		Iterator s1 = s.iterator();	
		while(s1.hasNext())
		{
			System.out.println(s1.next());
		}
	}
}
