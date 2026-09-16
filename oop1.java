class A
{
   int a;
   int b;
   
   A(int c,int d)
   {
       a=c;
	   b=d;
	}
   int m1()
    {
      return a;
	}
    int m2()
    {
       return b;
	}
}
class oop1
{
  public static void main(String[] args)
  {
    A obj=new A(45,18);
	System.out.println(obj.m1());
	System.out.println(obj.m2());
  }
}  
	
	
    	  