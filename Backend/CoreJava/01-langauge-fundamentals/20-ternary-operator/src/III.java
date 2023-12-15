class  III
{
	public static void main(String[] args) 
	{
		int a = 100;
		int b = 200;
		int c = 300;
		int d = 400;
		int min =(a<b && a<c && a<d)? a :(b<c && b<d)? b :(c<d)? c : d;
		System.out.println(min);
	}
}
