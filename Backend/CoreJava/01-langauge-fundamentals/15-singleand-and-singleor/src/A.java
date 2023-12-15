class A 
{
	public static void main(String[] args) 
	{
		int i =0;
		if ((++i == 1) & (i++ ==  2))//(&) bitwase and or single and operator
		//in single and (&),it will b checking both the oprents
		//And both must b true then it returns true output
		{
		
		System.out.println("from if");
		i++;
		}
		System.out.println("end of main");
		System.out.println(i);
		
	}
}
