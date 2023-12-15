class R 
{
	int i;
	void test (R ref)
	{
		System.out.println("from test(R): begin " + ref.i);
		ref.i = 20;
		System.out.println("from test(R): end " + ref.i);
	}
	public static void main(String[] args) 
	{
		R r1 = new R();
		System.out.println("main begin:" + r1.i);
		r1.i = 10;
		System.out.println("before calling test (R) method: " + r1.i);
		r1.test(r1);
		System.out.println("after calling test (R) method: " + r1.i);
	}
}
/*
1. Changes  in destination reflecting to the source ==> call by reference/pass by reference
2. If u r sending the reference there is 100 percent chances of object modification 
3. Reference is like a key to object
*/