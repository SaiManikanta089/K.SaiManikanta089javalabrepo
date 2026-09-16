 class commandArgs
{
	public static void main(String[] args)
	{
		int arr[]=new int[5];
		for(int i=0;i<5;i++)
		{
 			arr[i]=Integer.parseInt(args[i]);
		}
		int sum=0;
		for(int n:arr)
		{
   			System.out.println(n);
			sum+=n;
		}
		System.out.println("Sum is "+sum);
		System.out.println("Average is "+sum/5);
	}
}	
    		