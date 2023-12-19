class E //SUPER CLASS,PARENT CLASS
{
	static int i;

	public static void main(String[] args) 
	{
		System.out.println("from E Main");
	}
}
class F extends E  //CLASS B IS SUB CLASS,CHILD CLASS
{
	static int j;
	static 
	{
		F.main(null);
	}

	public static void main(String[] args) 
	{
		F f1 = new F();
		System.out.println(f1.i);
		System.out.println(f1.j);
		System.out.println(F.i);
		System.out.println(F.j);
		System.out.println("-------------");
		F.main(null);
	}
}
