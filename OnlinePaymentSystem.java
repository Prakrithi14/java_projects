package demo1;
class payment{
	double amount;

	public void  processPayment(double amount) {
	     this.amount=amount;
	     System.out.println("payment initiated");
	}
}
class creditPayment  extends payment{
	public  void processPayment(double amount) {
		System.out.println("Processing payment using credit "+"fetching credit card ");
		
	}
	
}
class debit  extends payment{
	public  void processPayment(double amount) {
		System.out.println("Processing payment using debit card "+"fetching debit card balance ");
		
	}
	
}
class upi  extends payment{
	public  void processPayment(double amount) {
		System.out.println("Processing payment rupees"+amount+" using upi "+"fetching upi id ");
		
	}
	
}

public class OnlinePaymentSystem {

	public static void main(String[] args) {
		creditPayment cp=new creditPayment();
		debit db =new debit();
		upi up =new upi();
		cp.processPayment(200);
		db.processPayment(300);
		up.processPayment(300);

	}

}
