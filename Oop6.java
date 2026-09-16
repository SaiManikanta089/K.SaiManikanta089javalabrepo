class A
{
	int i;
	int j;
	int k;
	A(int i)
	{ 
	   this.i=i;
	   System.out.println(this.i);
	}
    A(int i,int j)
    {
       this.i=i;
       this.j=j;
	   System.out.println(this.i);
	   System.out.println(this.j);
	}
    A(int i,int j,int k)
    {
       this.i=i;
       this.j=j;
       this.k=k;
	   System.out.println(this.i);
	   System.out.println(this.j);
	   System.out.println(this.k);
	}
}
class Oop6
{
    public static void main(String[] args)
    { 
       A obj=new A(7);
	   A obj1=new A(45,45,45);
	   A obj2=new A(18,18);
	}
}	
	   
	   