package JavaClass;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
public class List_Property1 
{
	public static void main(String[] args) 
	{
		List <String> l1 = new ArrayList<String>();
		l1.add("Uday");
		l1.add("Shilpa");
		l1.add("Kavya");
		l1.add(0, "Sonu");
		System.out.println(l1);
		
		Iterator<String> i = l1.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println("List iterator starting:");
		ListIterator <String> i3 = l1.listIterator();
		System.out.println("Forward Iteration:");
		while(i3.hasNext())
		{
			System.out.println(i3.next());
		}
		System.out.println("Backward Iteration:");
		while(i3.hasPrevious())
		{
			System.out.println(i3.previous());
		}
	}
}
