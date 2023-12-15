class W
{
	static int  i = 10;
	static int   j = 20;
	static int   k = (i += 100) +(j *= 2);
	
	public static void main(String[] args) 
	{
		System.out.println(i);//110
		System.out.println(j);//40
		System.out.println(k);//150
		
	}
}