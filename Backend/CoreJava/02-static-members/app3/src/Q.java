class Q 
{
	
	static
	{//usage before decleration is not possible(IFR-illegal forward reference)
		System.out.println(i);//error

		i = 20;
	}
	static int i = 10;


	public static void main(String[] args) 
	{
		System.out.println(i);
	}
}