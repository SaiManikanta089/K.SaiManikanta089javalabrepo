import java.io.*;
abstract class Bank
{
	abstract int getInterest();
}
class Customer
{
	private String name;
	private String accNo;
	public void setdetails(String name,String accNo)
	{
		this.name=name;
		this.accNo=accNo;
	}
    public String getName()
    {
        return name;
	}
	public String getaccNo()
    {
        return accNo;
	}
}
class RBI extends Bank
{
	public int getInterest()
	{
		return 4;
	}
	void display()
	{
		System.out.println("RBI rate of interest is:"+getInterest()+" %");
	}
}
class SBI extends Bank
{
    public int getInterest()
	{
		return 7;
	}
	void display()
	{
		System.out.println("SBI rate of interest is:"+getInterest()+"%");
	}
}	
class Exp7
{
	public static void main(String[] args)
	{
		Console cs=System.console();
		String s=cs.readLine("Enter 1.RBI 2.SBI:");
		int ch=Integer.parseInt(s);
		switch(ch)
		{
			case 1:
			   RBI r=new RBI();
			   r.display();
			   break;
			case 2:
			   SBI sb=new SBI();
			   sb.display();
			   break;
			default :
			    System.out.println("Invalid Choice");
		}
	}
}	
			   
		
		
		
	
		