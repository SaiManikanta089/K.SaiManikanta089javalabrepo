import java.util.scanner*;
class Demo
{ 
   public static void main(String[] args)
   {
       int dogit,temp,n,count=0,total=0;
       int arr[]=new int[5];
       scanner sc=new Scanner(System.in);
	   for(int i=0;i<5;i++)
	   {
	     arr[i]=sc.nextInt();  
		}
        for(int i=0;i<5;i++)		
		{
		   n=arr[i];
		   temp=n;
		   while(temp>0)
		   {
		      digit=temp%10;
			  count++;
			  temp/=10;
			} 
            if(count==2)
 			{
			  total++;
			}
		}
		System.out.println(total);
	}
}	