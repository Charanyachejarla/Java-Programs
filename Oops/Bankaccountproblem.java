class BankAccount
{
    int accountNumber ;
    double balance;
    BankAccount(int ac,double bal)
    {
        accountNumber=ac;
        balance=bal;
    }
    void deposit( double amount)
    { 
        System.out.println(balance+=amount);
    }
    void withdraw(double amount)
    {
        if(balance>amount)
        {
            balance-=amount;
        }
    }
    void displaybalance()
    {
        System.out.println("Balance:"+balance);
    }
}
class SavingsAccount extends BankAccount
{
    double interestrate;
    SavingsAccount(double intre, int ac, double bal)
    {
        super(ac, bal);
        interestrate=intre;
    }
    void addInterest()
    {
        double interest=balance*interestrate/100;
        balance+=interest;
        System.out.println("After interest:"+balance);
    }
}

class CheckingAccount extends BankAccount
{
   double overdraftLimit;
   CheckingAccount(double overdraft, int ac, double bal)
   {
    super(ac,bal);
    overdraftLimit=overdraft;
   }
   void withdraw(double amount)
   {
    System.out.println("Checking  Account");
     System.out.println("Balance:"+balance);
     System.out.println("Withdrawl:"+amount);
     double res=balance+overdraftLimit;
    
    if(amount>res)
    {
        System.out.println("overdraft limit exceed");
    }
    else{
        double over=0;
        if(balance>=amount)
        {
            balance-=amount;
        }
        else{
            
            over=amount-balance;
            balance=0;    
       
            }
           System.out.println("overdraft used:"+over);     
    }
    System.out.println();
}
}
class FDAccount extends BankAccount
{
    int termInYears;
    double fdInterestRate;
    FDAccount(int term, double fd,int ac,double bal)
    {
        super(ac, bal);
        termInYears=term;
        fdInterestRate=fd;
    }
    void calculateMaturityAmount()
    {
        System.out.println("Balance:"+balance);
       double maturity = balance + (balance * fdInterestRate * termInYears / 100);
       System.out.println("maturity Amount(after"+termInYears +"years at"+ fdInterestRate+"%):"+maturity);
    }
}

public class Bankaccountproblem {
    public static void main(String[] args)
    {
        
        SavingsAccount ob1=new SavingsAccount(25,10203043,4000);
        System.out.println("Savings  Account");
         ob1.displaybalance();
         ob1.addInterest();
         System.out.println();

        CheckingAccount ob2=new CheckingAccount(500,10203043,4000);
         
         ob2.withdraw(4500);
        FDAccount ob3=new FDAccount(2,25,10203043,6000);
        System.out.println("FDAccount:");
        ob3.calculateMaturityAmount();
    }
}
