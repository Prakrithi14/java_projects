package demo1;
 class Human{
	public String name;
	public int age;
	
	public Human() {
		this.age=0;
		this.name=null;
	}
	public String getName() {
	return this.name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getAge() {
		return age;
	}
}

public class DemoEncap {
	public static void main(String args[]){
		Human obj=new Human();
		obj.name="prakrithi";
		System.out.println(obj.getName());
}
}
