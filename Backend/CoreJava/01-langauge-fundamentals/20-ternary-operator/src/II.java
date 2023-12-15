class II 
{
	public static void main(String[] args) 
	{
		int a =1;
		int b = 2;
		int c=3;
		int min = ( a<b && a<c) ? a:(( b < c)?b:c);  
		System.out.println(min);
	}
}
