class F 
{
	int i;

	F(int k)
	{
		this.i = k;
	
		System.out.println("F(int)");
	}

	public static void main(String[] args) 
	{
		F f1 = new F(10);
		System.out.println("done:" + f1.i);
	}
}