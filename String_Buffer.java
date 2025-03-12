package JavaClass;
public class String_Buffer 
{
	public static void main(String[] args) 
	{
		//Immutable
		String a = new String ("Uday");
		a.concat("Kumar ST");
		System.out.println("String output--> " + a);
		
		//Mutable
		StringBuffer b = new StringBuffer("Uday ");
		b.append("Kumar ST");
		System.out.println("StringBuffer output--> " + b);
		
		//Mutable
		StringBuilder c = new StringBuilder("Uday Kumar");
		c.append(" ST");
	    System.out.println("StringBuilder output--> " + c);
	}
}
		
		/*//Insert
	    StringBuilder h = new StringBuilder("Uday ");
		h.insert(5, "Kumar");
		System.out.println("Insert output--> " + h);
		
		//Replace
		StringBuilder v = new StringBuilder("Uday Kumar");
		v.replace(5, 10, "shankar");
		System.out.println("Replace output--> " + v);
		
		//Delete
		StringBuilder l = new StringBuilder("Uday Kumar");
		l.delete(5, 10);
		System.out.println("Delete output--> " + l);
		
		//Reverse
		StringBuilder o = new StringBuilder("Uday");
		o.reverse();
		System.out.println("Reverse output--> " + o);
		
		//Capacity
		StringBuilder m = new StringBuilder("Uday Kumar ST");
		System.out.println("Capacity output--> " + m.substring(5));
	}
}*/
