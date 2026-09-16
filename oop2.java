class A
{
   int a;
   int b;
   static int c=45;
   A(int a,int b)
   {
      this.a=a;
	  this.b=b;
	}
}
class oop2
{
   public static void main(String[] args)
   {
      A obj=new A(18,7);
      System.out.println(obj.a);
      System.out.println(obj.b);
	  System.out.println(A.c);
	  A.c=A.c+45;
	  System.out.println(A.c);
   }
}   
   