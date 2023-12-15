class HH 
{
	public static void main(String[] args) 
	{
		int a = 10;
		int b =20;
		int c = 30 ;
		int d = 40;
		if (a<b && a<c && a<d)
		{
		
		System.out.println("among a,b,c,d" + a + "is min");
		}
		else if (b<c && b<d)
		{
			System.out.println("among a,b,c,d" + b + "is min");
		}
		else if (c<d)
		{
			System.out.println("among a,b,c,d" + c + "is min");
		}
		else
			System.out.println("among a,b,c,d" + d + "is min");
}
}