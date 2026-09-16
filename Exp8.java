import java.io.*;
interface Employee
{
   String getName();
   double calculatePay();
   void display();
}
class RegularEmployee implements Employee
{
   String name;
   double basic;
   RegularEmployee(String name,double basic)
   {
	   this.name=name;
	   this.basic=basic;
   }
   public double calculatePay()
   {
	   return basic+basic*0.1+basic*0.2+basic*0.05;
   }
   public void display()
   {
	   System.out.println("Name:"+name+" pay:"+calculatePay());
   }
   public String getName()
   {
	   return name;
   }
}
class ContractEmployee implements Employee
{
    String name;
	int month,pay;
	ContractEmployee(String name,int pay,int month)
	{
		this.name=name;
		this.pay=pay;
		this.month=month;
	}
	public String getName()
   {
	   return name;
   }
   public double calculatePay()
   {
	   return pay;
   }
   public void display()
   {
	   System.out.println("Name:"+name+" Total pay:"+calculatePay());
   }
}
class Vendor implements Employee
{
	String name;
	int hrs,rate;
	Vendor(String name,int rate,int hrs)
	{
		this.name=name;
		this.rate=rate;
		this.hrs=hrs;
	}
	public String getName()
   {
	   return name;
   }
   public double calculatePay()
   {
	   return rate*hrs;
   }
   public void display()
   {
	   System.out.println("Name:"+name+" Total pay:"+calculatePay());
   }
}
class Exp8
{
    public static void main(String[] args)
	{
		Console cs=System.console();
		String s=cs.readLine("Enter 1.Regular Employee 2.Contarct Employee 3.Vendor");
		int ch=Integer.parseInt(s);
		switch(ch)
		{
			case 1:
			   RegularEmployee re=new RegularEmployee("Sai",100000);
			   re.display();
			   break;
			case 2:
			   ContractEmployee ce=new ContractEmployee("Mani",500000,8);
			   ce.display();
			   break;
			case 3:
			   Vendor v=new Vendor("Sai",600,8);
			   v.display();
			   break;
			default :
			    System.out.println("Invalid Choice");
		}
	}
}	
		
		
    	
   
	
   
	   
	   