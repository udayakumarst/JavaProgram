package JavaClass;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
public class Under_Collection 
{
	public static void main(String[] args) 
	{
		//u.add(Object e)
		Collection u = new ArrayList();//Upcasting
		u.add(true);
		u.add('A');
		u.add(23.6);
		u.add("Uday");
		System.out.println(u);
		
		Iterator u1=u.iterator();
		while(u1.hasNext())
		{
			System.out.println(u1.next());
		}
		/*
		Collection k = new ArrayList();//Upcasting
		k.add(false);
		k.add("Kumar");
		k.add(8768768);
		//addAll(Collection c)
		k.addAll(u);
		System.out.println(k);
		
		//Integer data type
		Collection<Integer> q = new ArrayList<Integer>();//Upcasting
		q.add(21);
		q.add(22);
		q.add(23);
		System.out.print("Integer data type-->");
		System.out.println(q);
		
		//Double data type
		Collection<Double> a = new ArrayList<Double>();//Upcasting
		a.add(12.1);
		a.add(21.2);
		a.add(21.3);
		System.out.print("Double data type-->");
		System.out.println(a);
		
		//String data type
		Collection<String> z = new ArrayList<String>();
		z.add("Uday");
		z.add("Kumar");
		z.add("ST");
		System.out.print("String data type-->");
		System.out.println(z);
		
		//Integer data type
		Collection<Integer> s = new ArrayList<Integer>();// Upcasting
		s.add(21);
		s.add(22);
		s.add(23);
		//remove & removeAll method
		System.out.println("Before removing Integer data type-->" + s);
		s.remove(22);
		System.out.println("After removing Integer data type-->" + s);
		s.removeAll(s);
		System.out.println("After removing all Integer data type-->" + s);
		
		//contains & containsAll method
		boolean d = s.contains(10);
		System.out.println(d);
		boolean d1 = s.containsAll(s);
		System.out.println(d1);*/
	}
}
