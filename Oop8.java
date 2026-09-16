interface I1
{
   void m1();
   void m2();
   int a=45;
}
interface I2
{
   void m3();
}
class A
{
   void m4()
   {
      System.out.println("In m4");
	}
}	
abstract class B extends A implements I1,I2
{
    public void m1()
	{
	    System.out.println("In m1");
	}
    public void m2()
    {
        System.out.println("In m2");
	}
} 
class C extends B
{
    public void m3()
    {
        System.out.println("In m3");
	}
}
class Oop8
{
    public static void main(String[] args)
    {
       C obj=new C();
       obj.m1();
       obj.m2();
       obj.m3();
       obj.m4();
	   System.out.println(obj.a);
	}
}	