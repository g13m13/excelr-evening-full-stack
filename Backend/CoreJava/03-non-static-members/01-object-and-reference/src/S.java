class S 
{
	int i;
	static void test (int i)
	{
		System.out.println("from test(int) begin: " + i);
		i = 20;
		System.out.println("from test(int)end: " + i);
	}
	public static void main(String[] args) 
	{
		S s1 = new S();
		System.out.println("main begin: " + s1.i);
		s1.i = 10;
		System.out.println("before  test (int): " + s1.i);
		test(s1.i);
		System.out.println("after  test (int) method: " + s1.i);
	}
}
/* 1. call by value/pass by value
2. changes in the destination would  not be refelecting to the source
3.Bcoz we r not sending the reference instead we are sending the value
4. Value is not key to the object(Reference  is not key to the object)
5.We r sending only value not the key, so ther is 0 percent of object modification
*/