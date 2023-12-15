class JJ 
{
	public static void main(String[] args) 
	{
		
		int a =1;
		int b = 2;
		int c=3;
		int d = 4;
		int min = (a<b && a<c && a<d)? a :((b<c && b<d)? b :((c<d)? c :d;));
		System.out.println(min);
	}
}
