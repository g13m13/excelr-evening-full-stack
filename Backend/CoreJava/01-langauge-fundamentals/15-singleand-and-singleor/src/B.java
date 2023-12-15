class  B
{
	public static void main(String[] args) 
	{
		int i =0;
		if ((i++ == 0) |(i++ ==  1))// "|"bitwise OR or Single or
		//becoz of single OR it will check both oprend
		//if any one oprend is ture  it will return TRUE means if anyone is true that is sufficent
		{
		
		System.out.println("from if");
		i++;
		}
		System.out.println("end of main");
		System.out.println(i);
		
	}
}
