class V // CLASS OVER IN COMPLETE PROGRAM
{
	V()
	{
		V obj1 = new V(10);
		System.out.println("V()");
	}
	V(int i)
	{
		V obj2 = new V(10,20);
		System.out.println("V(int)");
	}

	V(int i, int j)
	{
		V obj3 = new V(10,20,30);
		System.out.println("V(int,int)");
	}
	
	V (int i, int j, int k)
	{
		System.out.println("V(int,int,int)");
}
	public static void main(String[] args) 
	{
		V v1 = new V();
		System.out.println("----------");

		V v1 = new V(100);
		V v1 = new V();
		V v1 = new v();
		System.out.println("done");
	}
}
