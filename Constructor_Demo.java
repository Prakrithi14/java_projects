package demo1;

class Employee {
	String name;
	int employeeid;
	public Employee(String name,int employeeid){
		name="prakrithi";
		employeeid=01;
		System.out.println("name of employee "+name);
	}

}
class FulTimeEmployee extends Employee{
	double salary;
	public FulTimeEmployee(String name,int employeeid,double salary){
		super(name,employeeid);
	}
}
class PartTimeEmployee extends Employee{
	double hourly;
	public PartTimeEmployee (String name,int employeeid,double hourly) {
		super(name,employeeid);
		this.hourly=hourly;
		System.out.println("salary of employee is "+hourly);
		
		
	}
}

	public class Constructor_Demo {
		public static void main(String args[]) {
			PartTimeEmployee pt=new PartTimeEmployee("krithi",02,1000000);
		
		}
	}
 

