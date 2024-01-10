public class DD
{
	public static void main(String []args)
	{
		int x[] = new int[2];//diff ways of creating array reference
		int []y = new int[2];
		int[] z = new int[2];
		int[]p = new int[2];
		//ints[] = new int[2];
		System.out.println(x[0]);
		System.out.println(x[1]);
		x[0] =100;
		x[1] =1000;
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println("done");
		System.out.println("done");
	}
}
