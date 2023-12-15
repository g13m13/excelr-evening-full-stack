class B 
{ //error: non-static method test() cannot be referenced from a static context
	void test()
	{
		System.out.println("from test()");
	}

	public static void main(String[] args) 
	{
		test();
		System.out.println("done");
	}
}
