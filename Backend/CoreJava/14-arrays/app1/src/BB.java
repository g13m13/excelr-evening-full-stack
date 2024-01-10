class BB 
{
	public static void main(String[] args) 
	{
		int[] x;
		x = new int[5];
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);
		System.out.println(x[3]);
		System.out.println(x[4]);
		x[0]=100;
		x[1]=200;
		x[2]=300;
		x[3]=1400;
		x[4]=1050;
		x = null;
		
		System.out.println(x.length);
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);
		System.out.println(x[3]);
		System.out.println(x[4]);
	}
}
