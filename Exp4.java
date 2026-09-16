import java.util.*;
class Employee
{
	String name;
	int id;
	String designation;
	double salary;
	boolean promotion;
	Employee(String name,int id,String designation,double salary)
	{
		this.name=name;
		this.id=id;
		this.designation=designation;
		this.salary=salary;
		this.promotion=true;
	}
	Employee(String name,int id,String designation,double salary,boolean promotion)
	{
		this.name=name;
		this.id=id;
		this.designation=designation;
		this.salary=salary;
		this.promotion=promotion;
	}
	void display()
	{
	    System.out.println("Name:"+name+" ID: "+id+" Promotion: "+promotion);
	}	
}
class Exp4
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name, id, designation, salary, promotion status");
		String na=sc.next();
		int id=sc.nextInt();
		String des=sc.next();
		double sal=sc.nextDouble();
		boolean pro=sc.nextBoolean();
		Employee emp=new Employee(na,id,des,sal);
		Employee emp1=new Employee(na,id,des,sal,pro);
		emp.display();
		emp1.display();
	}
}
		
	    
		