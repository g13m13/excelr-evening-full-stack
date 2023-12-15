class F // ERROR bcoz main method is not there
{
	static int i = 10;

	static int test()
	 
	{
		System.out.println("from test");
		return 20;
	}
}
//in java JDK <= 1.6 executing a class without main method is possible.
//in java JDK <= 1.7 executing a class without main method is not possible.
