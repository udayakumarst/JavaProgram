package JavaClass;
import java.util.ArrayList;
import java.util.List;
public class List_Property
{
	public static void main(String[] args) 
	{
		List l = new ArrayList();
		l.add("Uday");
		l.add('A');
		l.add(12);
		l.add(23.4);
		l.add(1231231);
		l.add(true);
		l.add(null);
		System.out.println(l);
	}
}
