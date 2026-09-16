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
		int result=0;
		for(int i=0;i<S.length();i++)
		{
			
		
		