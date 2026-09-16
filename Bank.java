class Account
{
   protected int acc_num;
   protected double balance;
   protected String type;
   Account(int a,double b,String s)
   {
      acc_num=a;
	  balance=b;
	  type=s;
	}
    void deposit(double b)
    {
      balance+=b;
      System.out.println("amount: "+b+"Balance: "+balance);
    }
    void withdraw(double amt)
    {
       if(amt<=balance)
       { 
         balance-=amt;
		 System.out.println("Balance:"+balance);
		}
		else
		{
		   System.out.println("Invalid Balance");
		}
	}
	void display()
	{
	   System.out.println("Acount Number: "+acc_num+" Balance: "+balance+" Type: "+type);
	} 
}
class Savings_account extends Account
{
    private int rate;
    Savings_account(int a,double b,int r)
    {
      super(a,b,"savings");
      rate=r;
	}
    void Calc_interest()
    {
      int i=(int)balance*rate/100;
      System.out.println("Interest: "+i);
	}
}
class Current_account extends Account
{
    private int overdraft;
    Current_account(int a,double b,int o)
    {
      super(a,b,"current");
      overdraft=o;
	}
    void deposit(double amt)
    {
      if(amt<=balance+overdraft)
      {
        balance+=amt;
		System.out.println("Amount:"+amt+" Balance: "+balance);
	  }
	  else
	  {
	    System.out.println("Invalid balance");
	  }
	 }
}
class Bank
{
    public static void main(String[] args)
    {
	  Savings_account sa=new Savings_account(2089,1500,100);
	  sa.deposit(500);
	  sa.display();
	  sa.withdraw(500);
	  sa.display();
	  sa.Calc_interest();
	  Current_account ca=new Current_account(2089,1000,500);
	  ca.deposit(500);
	  ca.display();
	}
}	
         	