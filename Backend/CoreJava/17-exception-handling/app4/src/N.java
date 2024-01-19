class N 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			Class.forName("");
		}
		catch (ClassNotFoundException ex)
		{
			ex.printStackTrace();//for getting details means at wht line no. we hv exception
		}
		System.out.println("main end");
	}
}
