class A
{
   void sum(int a,int b)
   {
       System.out.println(a+b);
	}
   void sum(double a,double b)
    {
       System.out.println(a+b);
	}
}
class Oop5
{
   public static void main(String[] args)
    {
       A obj=new A();
       obj.sum(45,0);
       obj.sum(45.0,0.45);
	}
}	