package JavaClass;
public class ThisKeyword 
{
	String name;
	double salary;
	int emp_id;
	void Emp_details(String name, double salary, int emp_id)
	{
		this.name=name;
		this.salary=salary;
		this.emp_id=emp_id;
		System.out.println("Emp name is-->"+name);
		System.out.println("Emp Salary is-->"+salary);
		System.out.println("Emp Id is-->"+emp_id);
	}
	public static void main(String[] args) 
	{
		ThisKeyword g = new ThisKeyword();
		g.Emp_details("Uday", 68000, 1245);
		System.out.println(g.name);
		System.out.println(g.salary);
		System.out.println(g.emp_id);
	}
}
