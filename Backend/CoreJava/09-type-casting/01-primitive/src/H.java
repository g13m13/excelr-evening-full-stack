class H // no upcasting bcoz of both the int value
{
	static int test()
	{
		int i = 10;
		return i;
	}
	public static void main(String[] args) 
	{
		System.out.println(test() +"done");
	}
}
