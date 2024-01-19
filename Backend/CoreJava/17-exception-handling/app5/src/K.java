class K
{
	static void test1() throws OutOfMemoryError
	{
		test2();
	}
	static void test2() throws NullPointerException
	{
		test3();
	}
	static void test3() throws ArithmeticException
	{
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test1();
		System.out.println("main end");
	}
}
//L.java:9: error: unreported exception InterruptedException; must be caught or declared to be thrown
              //  Thread.sleep(1000);
                            ^
//L.java:10: error: unreported exception ClassNotFoundException; must be caught or declared to be thrown
                //Class.forName("");
                             ^