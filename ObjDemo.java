package demo1;

class Calc{
	
int a,b;
public int add(int a,int b) {
	int result;
	result=a+b;
    return result;
}

}
public class ObjDemo {
	public static void main(String args[]) {
		Calc obj=new Calc();
		int res=obj.add(5,4);
		System.out.println("result is"+res);
		
	}
}
