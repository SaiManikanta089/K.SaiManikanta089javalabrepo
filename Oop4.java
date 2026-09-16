class A
{
   void m()
   {
      System.out.println("Hi");
	}
}
class B extends A
{
   void m()
   {
      System.out.println("Hello");
	}
}
class Oop4
{
    public static void main(String[] args)
    {
       A obj=new B();
       obj.m();
       B obj1=new B();
       obj.m();
	}
}	
   