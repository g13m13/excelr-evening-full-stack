class BB//error: 'try' without 'catch', 'finally' or resource declarations
{
 	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i;
		try//try alone is not possible
		{
			System.out.println("from try begin");
			i = 10 / 0;
			System.out.println("from try end");
		}
		
		System.out.println("main end");
	}
}
