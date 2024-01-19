class S
{
	static void test() throws Throwable
	{
		Class.forName("");
	}
	public static void main(String[] args) throws Exception 
	{
		System.out.println("main begin");
		test();
		System.out.println("main end");
	}
}
//S.java:10: error: unreported exception Throwable; must be caught or declared to be thrown
               // test();
                    ^
// 1 error