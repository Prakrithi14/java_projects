class Account{
    private String accountname;
    double amnt;
    Account(String accountholder,double amount){
        accountname=accountholder;
      if(amount>0){
        amnt=amount;
      }
      else{
        amnt=0;
        System.out.println("Amount cannot be negative");
      }
    }
    public void deposit(double amount){
        if(amount>0){
            amnt=amnt+amount;
            System.out.println("Deposited:"+amount);
        }
        else{
            System.out.println("invalid");
        }
    }
    public void withdraw(double amount){
        if(amount>0 && amount<amnt){
            System.out.println("Amount withdrawn:"+amount);
            amnt=amnt-amount;
        }   
        else{
            System.out.println("Insufficient balance");
        }
     }
     public void checkbalance(){
        System.out.println("Available balance is:"+amnt);
     }
    }



public class Bankaccount {


    public static void main(String args[]){
        Account ac=new Account("ABC",10000);
        ac.checkbalance();
        ac.deposit(10);
        ac.withdraw(11111);
        ac.withdraw(100);
        ac.checkbalance();



    }
    
}
