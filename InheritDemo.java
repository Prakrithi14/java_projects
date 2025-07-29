package demo1;
class parent{
	public parent() {
		System.out.println("Constructor in parent");
	}
}
class child extends parent{
	public child() {
		System.out.println("Constructor in child");
		
	}
}
public class InheritDemo {
	public static void main(String [] args) {
		parent p=new parent();
		child c=new child();
	}
}
