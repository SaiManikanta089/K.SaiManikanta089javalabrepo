class A
{
    void sum(int a,int b)
    {
      System.out.println(a+b);
    }
    void diff(int a,int b)
    {
      System.out.println(a-b);
	}
}
class B extends A
{
    void mult(int a,int b)
    {
      System.out.println(a*b);
	}
    void div(int a,int b)
    {
      System.out.println(a/b);
	}
}
class Oop3
{
   public static void main(String[] args)
   {
      B obj=new B();
	  obj.sum(45,0);
	  obj.diff(63,18);
	  obj.mult(5,9);
	  obj.div(90,2);
	}
}	
	  
      	  
    