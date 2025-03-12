package JavaClass;
import java.util.Date;
public class Dates 
{
	public static void main(String[] args) 
	{
		Date d1 = new Date();
		System.out.println("Current date->" + d1);
		Date d2 = new Date(d1.getTime()-(1000*60*60*24*1));
		System.out.println("Past date->" + d2);
		Date d3 = new Date(d1.getTime()+(1000*60*60*24*1));
		System.out.println("Future date->" + d3);
		
		String a = d1.toString();
		String month = a.substring(4, 7); //4->F & 7->Space
		System.out.println(month);
		String date = a.substring(8, 10);
		System.out.println(date);
		String year = a.substring(a.length()-4);//It will start from 2025 only
		System.out.println(year);
		
		String b = date.concat("-").concat(month).concat("-").concat(year);
		System.out.println(b);
	}
}
