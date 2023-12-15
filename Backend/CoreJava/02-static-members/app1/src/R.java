class R //ERROR
{
	static int i++ ;
	static int j++;//while declaring we cant implement increment or decrement 
	public static void main(String[] args) 
	{
		System.out.println(i);
		System.out.println(j);
	}
}
