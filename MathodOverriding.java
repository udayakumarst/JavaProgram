package JavaClass;
class Java1
{
	  void login()
	{
		System.out.println("login with email id");
	}
}
public class MathodOverriding extends Java1
{
	void login()
	{
		System.out.println("Login with mobile no");
	}
	public static void main(String[] args) 
	{
		/*MathodOverriding n = new MathodOverriding();
		n.login();
		*/
		Java1 j1=new Java1();
		j1.login();
	}
}
