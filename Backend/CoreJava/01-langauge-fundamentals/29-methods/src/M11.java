class M11
{
	static void testOne ()
	{
		
		System.out.println("from testOne"); //there is no caller for this 
	}
	static public  void main( String[]  args) 
	{
		System.out.println("from main");//JVm is caller for main method
	}
	static void testTwo ()
	{
		
		System.out.println("from testTwo"); 
	
	}
	}