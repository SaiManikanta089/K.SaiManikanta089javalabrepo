import java.util.*;
class Roman
{
	public int romanInteger(String S)
	{
		Map<Character,Integer> map=new HashMap<>();
		map.put('I',1);
		map.put('V',5);
		map.put('X',10);
		map.put('L',50);
		map.put('C',100);
		map.put('D',500);
		map.put('M',1000);
		int res=0;
		for(int i=0;i<S.length();i++)
		{
			int cur=map.get(S.charAt(i));
			int next=((i+1)<S.length())?map.get(S.charAt(i+1)):0;
			if(cur<next)
			{
				res=res-cur;
			}
			else
			{
  				res=res+cur;
			}
		}
		return res;
	}
}
class Exp10
{
	public static void main(String[] args)
	{
		System.out.println("Enter a roman number");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		Roman r=new Roman();
		System.out.println(s+" = "+r.romanInteger(s));
	}
}	
		
		