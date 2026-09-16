abstract class A
{
    void show()
	{
	    System.out.println("In show");
	}	
	abstract void m1();
	abstract void m2();
}	
 abstract class B extends A
 {
    public void m1()
	{
	   System.out.println("In m1");
	}
}
class C extends B
{
    public void m2()
    {
        System.out.println("In m2");
	}
} 
class Oop7
{
   public static void main(String[] args)
  {
   C obj=new C();
   obj.show();
   obj.m1();
   obj.m2();
   }
}   