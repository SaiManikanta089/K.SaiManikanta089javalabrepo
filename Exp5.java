import java.util.*;
class Customer
{
	String location;
	String name;
	Customer(String location,String name)
	{
		this.location=location;
		this.name=name;
	}	
	void reconnect()
	{
		System.out.println("Reconnected");
	}
    void randomize()
    {
        System.out.println("Randomize");	
	}
}
class Order
{
    String date;
  	String number;
	Order(String date,String number)
	{
		this.date=date;
		this.number=number;
	}	
	void confirm()
	{
		System.out.println("Order confirmed");
	}
	void close()
	{
		System.out.println("Order closed");
	}
}
class SpecialOrder extends Order
{
	String number;
	String date;
	SpecialOrder(String date,String number)
	{
		super(date,number);
	}
	void confirm()
	{
		System.out.println("Order Confirmed");
	}
	void close()
	{
		System.out.println("Order closed");
	}
	void dispatch()
	{
		System.out.println("Order dispatched");
	}
}
class NormalOrder extends Order
{
	String number;
	NormalOrder(String date,String number)
	{
		super(date,number);
		
	}
	void confirm()
	{
		System.out.println("Order confirmed");
	}
	void receive()
	{
		System.out.println("Order received");
	}
	void dispatch()
	{
		System.out.println("Order dispatched");
	}
	void close()
	{
		System.out.println("Order closed");
	}
}
class Exp5
{
	public static void main(String[] args)
	{
		Customer c=new Customer("Srikakulam","Sai");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1.Special order 2.Normal order");
		int ch=sc.nextInt();
		switch(ch)
		{
			case 1:
			System.out.println("Enter date and number:");
			String d=sc.next();
			String n=sc.next();
			SpecialOrder so=new SpecialOrder(d,n);
			System.out.println("Name:"+c.name+" Location:"+c.location);
			System.out.println("Date:"+so.date);
			so.dispatch();
			so.confirm();
			
			break;
			case 2:
			System.out.println("Enter date and number:");
			String d1=sc.next();
			String n1=sc.next();
			NormalOrder no=new NormalOrder(d1,n1);
			System.out.println("Name:"+c.name+" Location:"+c.location);
			System.out.println("Date:"+no.date);
			no.dispatch();
			no.close();
			break;
			default:
			System.out.println("Invalid number");
			break;
		}
	}
}	
			
		
	

	
	

	
		
	
	