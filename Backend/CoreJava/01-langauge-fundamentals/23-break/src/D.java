class  D


	public static void main(String[] args) 
	{
		int i;
		for ( i =0;i < 10 ;i++ )
		{
		
		System.out.println("loop begin :" + i);
		if (i > 5)
		{
			System.out.println("some statement");
			break;//break must b the last statemnt in break blockBUT BEFORE BREAK THERE CAN B A STMNT
			
		}
		System.out.println("loop end :" + i);

	}
	System.out.println("main end:" + i);
}