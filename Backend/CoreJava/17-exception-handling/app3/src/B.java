class B//one try block with multiple finally blocks r not possible 
{
 	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i;
		try
		{
			System.out.println("from try begin");
			i = 10 / 0;
			System.out.println("from try end");
		}
		finally
		{
			System.out.println("from finally1");
		}
		finally
		{
			System.out.println("from finally2");
		}
		System.out.println("main end");
	}
}
