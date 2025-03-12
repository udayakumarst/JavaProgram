package JavaClass;
import java.util.HashMap;
import java.util.Map;
public class Map_concept 
{
	public static void main(String[] args) 
	{
		Map<Integer, String> m = new HashMap<Integer, String>(); 
		m.put(23134114, "Uday");
		m.put(13212311, "Supriya");
		m.put(35234532, "kavya");
		System.out.println(m);
		
		Map<Integer, String> m1 = new HashMap<Integer, String>(); 
		m1.put(23134214, "Uday1");
		m1.put(13211311, "Supriya1");
		m1.put(35284532, "kavya1");
		m1.putAll(m);
		m1.remove(13211311);
		m1.remove(23134114, "Uday");
		m1.replace(13212311, "kavya1");
		System.out.println(m1);
	}
}
