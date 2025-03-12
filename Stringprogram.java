package JavaClass;

public class Stringprogram {

	public static void main(String[] args) 
	{
		String a= "english";
		String b=" HIN DI  ";
		System.out.println(a.toUpperCase());
		System.out.println(b.toLowerCase());
        System.out.println(a.length());
        System.out.println(a.charAt(1));//indexing start from 0
        System.out.println(b.trim());//it will remove spaces in front and ending of string
        System.out.println(a.concat(" is a beautiful language"));
        System.out.println(a.contains("gl"));
        System.out.println(a.equals("English"));
        System.out.println(a.equalsIgnoreCase("EnGLish"));
	}

}
