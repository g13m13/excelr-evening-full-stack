class DD 
{
	int i;
	DD()
	{
		i = 10;
		System.out.println("DD()");
	}
	public static void main(String[] args) 
	{
		DD d1 = new DD();
		DD d2 = new DD();
		DD d3 = new DD();
		DD d4 = new DD();
		DD d5 = new DD();
		System.out.println(d1.i);
		System.out.println("done");
	}
}
