package demo1;
interface A{
	public void showA();
}
interface B{
	public void showB();
}
 class interfacedemo implements A, B{
	public void showA() {
		System.out.println("interface A");
	}
	public void showB() {
		System.out.println("interface B");
	}
	  interfacedemo(A a){
		
	}
	  interfacedemo(B b){
		  
	  }
}


public class multipleinterface {
	public static void main(String args[]) {
		interfacedemo id=new interfacedemo((A)()->System.out.println(""));
		
	}

}
