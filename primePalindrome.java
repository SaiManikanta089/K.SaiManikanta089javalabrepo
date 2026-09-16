import java.util.*;
class primePalindrome
{
	static boolean isPrime(int n)
	{
		int count=0;
		for(int i=0;i<=n;i++)
		{
			count=0;
            for(int j=1;j<=i;j++)
			{
  				if(i%j==0)
				{
					count++;
				}
			}
		}
		return count==2;
	}
    static boolean isPalindrome(int n)
    {
        int rev=0,digit,temp=n;
		while(temp>0)
		{
     		digit=temp%10;
			rev=rev*10+digit;
			temp/=10;
		}
		return rev==n;
	}
    public static void main(String[] args)
    {
        System.out.printf("Enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(isPrime(n) && isPalindrome(n))
		{
			System.out.printf("%d is a prime and palindrme",n);
		}
		else
		{
  			System.out.printf("It is not a prime palindrome");
		}
		sc.close();
	}
}	